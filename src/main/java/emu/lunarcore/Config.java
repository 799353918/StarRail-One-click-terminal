package emu.lunarcore;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import emu.lunarcore.data.common.ItemParam;
import lombok.Getter;

@Getter
public class Config {
    public DatabaseInfo accountDatabase = new DatabaseInfo();
    public DatabaseInfo gameDatabase = new DatabaseInfo();
    public InternalMongoInfo internalMongoServer = new InternalMongoInfo();
    public boolean useSameDatabase = true;

    public KeystoreInfo keystore = new KeystoreInfo();

    public HttpServerConfig httpServer = new HttpServerConfig(80);
    public GameServerConfig gameServer = new GameServerConfig(23301);

    public ServerOptions serverOptions = new ServerOptions();
    public ServerTime serverTime = new ServerTime();
    public ServerRates serverRates = new ServerRates();
    public LogOptions logOptions = new LogOptions();

    public String resourceDir = "./resources";
    public String dataDir = "./data";

    @Getter
    public static class DatabaseInfo {
        public String uri = "mongodb://localhost:27017";
        public String collection = "lunarcore";
        public boolean useInternal = true;
    }

    @Getter
    public static class InternalMongoInfo {
        public String address = "localhost";
        public int port = 27017;
        public String filePath = "database.mv";
    }

    @Getter
    public static class KeystoreInfo {
        public String path = "./keystore.p12";
        public String password = "";
    }

    @Getter
    private static class ServerConfig {
        public String bindAddress = "0.0.0.0";
        @SerializedName(value = "bindPort", alternate = { "port" })
        public int bindPort;

        // Will return bindAddress if publicAddress is null
        public String publicAddress = "127.0.0.1";
        // Will return bindPort if publicPort is null
        public Integer publicPort;

        public ServerConfig(int port) {
            this.bindPort = port;
        }

        public String getPublicAddress() {
            if (this.publicAddress != null && !this.publicAddress.isEmpty()) {
                return this.publicAddress;
            }

            return this.bindAddress;
        }

        public int getPublicPort() {
            if (this.publicPort != null && this.publicPort != 0) {
                return this.publicPort;
            }

            return this.bindPort;
        }
    }

    @Getter
    public static class HttpServerConfig extends ServerConfig {
        public boolean useSSL = false;
        public long regionListRefresh = 60_000; // Time in milliseconds to wait before refreshing region list cache
                                                // again

        public HttpServerConfig(int port) {
            super(port);
        }

        public String getDisplayAddress() {
            return (useSSL ? "https" : "http") + "://" + getPublicAddress() + ":" + getPublicPort();
        }
    }

    @Getter
    public static class GameServerConfig extends ServerConfig {
        public String id = "lunar_rail_test";
        public String name = "Lunar Core";
        public String description = "A LunarCore server";
        public int kcpInterval = 40;
        public Integer kcpTimeout = 30;

        public GameServerConfig(int port) {
            super(port);
        }

        public int getKcpTimeout() {
            return kcpTimeout.intValue();
        }
    }

    @Getter
    public static class ServerTime {
        public boolean spoofTime = false;
        public Date spoofDate = new Date(1705276800000L); // January 15, 2024 12:00:00 AM (GMT)
    }

    @Getter
    public static class ServerOptions {
        public boolean autoCreateAccount = true;
        public int sceneMaxEntites = 500;
        public int maxCustomRelicLevel = 15; // Maximum level of a relic that the player can create with the /give
                                             // command
        public boolean unlockAllChallenges = true;
        public boolean spendStamina = true;
        public int staminaRecoveryRate = 5 * 60;
        public int staminaReserveRecoveryRate = 18 * 60;
        public int startTrailblazerLevel = 1; // Starting trailblazer level for new players
        public boolean autoUpgradeWorldLevel = true; // Automatically upgrades world level when the player reaches a
                                                     // certain TB level
        public String language = "EN";
        public Set<String> defaultPermissions = Set.of("*");
        public int maxPlayers = -1;
        public ServerProfile serverFriendInfo = new ServerProfile();
        public WelcomeMail welcomeMail = new WelcomeMail();

        public int getStaminaRecoveryRate() {
            return staminaRecoveryRate > 0 ? staminaRecoveryRate : 1;
        }

        public int getStaminaReserveRecoveryRate() {
            return staminaReserveRecoveryRate > 0 ? staminaReserveRecoveryRate : 1;
        }
    }

    @Getter
    public static class ServerRates {
        public double exp = 1.0;
        public double credit = 1.0;
        public double jade = 1.0;
        public double material = 1.0;
        public double equip = 1.0;
    }

    @Getter
    public static class ServerProfile {
        public String name = "米忽悠之家";
        public String signature = "输入 /help 获取命令列表";
        public int level = 80;
        public int headIcon = 201310;
        public int chatBubbleId = 0;
        public List<ServerDisplayAvatar> displayAvatars = List.of(new ServerDisplayAvatar(1001, 1));

        @Getter
        public static class ServerDisplayAvatar {
            public int avatarId;
            public int level;

            public ServerDisplayAvatar(int avatarId, int level) {
                this.avatarId = avatarId;
                this.level = level;
            }
        }
    }

    @Getter
    public static class WelcomeMail {
        public String title;
        public String sender;
        public String content;
        public List<ItemParam> attachments;

        public WelcomeMail() {
            this.title = "欢迎使用CarolBcsi服务器 ";
            this.sender = "米忽悠";
            this.content = "欢迎来到米忽悠的男娘宇宙! 请将这些物品作为入门礼物。如需命令列表，请在服务器聊天窗口中输入 /help。 查看我们的 <a type=OpenURL1 href=https://qm.qq.com/q/Om2HuxFXSU>QQ</a> 和 <a type=OpenURL1 href=https://github.com/799353918/StarRail-One-click-terminal>Github</a> 以获取有关服务器的更多信息.";
            this.attachments = List.of(
                    new ItemParam(2, 1000000),
                    new ItemParam(101, 100),
                    new ItemParam(102, 100),
                    new ItemParam(1001, 1),
                    new ItemParam(1002, 1));
        }
    }

    @Getter
    public static class LogOptions {
        public boolean commands = true;
        public boolean connections = true;
        public boolean packets = false;
        public boolean filterLoopingPackets = false;
    }

    public void validate() {
        if (this.gameServer.kcpTimeout == null) {
            this.gameServer.kcpTimeout = 30;
        }
    }

}
