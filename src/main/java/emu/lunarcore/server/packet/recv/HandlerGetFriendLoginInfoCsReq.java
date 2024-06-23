package emu.lunarcore.server.packet.recv;

import java.util.concurrent.CompletableFuture;
import javafx.embed.swing.JFXPanel;
import emu.lunarcore.proto.Notify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.send.PacketGetFriendLoginInfoScRsp;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

@Opcodes(2940)
public class HandlerGetFriendLoginInfoCsReq extends PacketHandler {
    @Override
    public void handle(final GameSession gameSession, final byte[] array) throws Exception {
        gameSession.send(new PacketGetFriendLoginInfoScRsp(gameSession.getPlayer()));
        final Notify.RevcMsgScNotify instance = Notify.RevcMsgScNotify.newInstance();
        final Notify.Msg instance2 = Notify.Msg.newInstance();
        instance2.setI3(100);
        instance2.setI11(0);
        instance2.setI15(0);
        instance2.setI9(9999999999999L);
        instance2.setText(
                "<color=#ff69b4>本</color><color=#ffd700>软</color><color=#00ff00>件</color><color=#00bfff>由</color><color=#ff1493>U</color><color=#ff8c00>P</color><color=#7fff00>主</color><color=#ff00ff>免</color><color=#00ffff>费</color><color=#8a2be2>分</color><color=#dc143c>享</color><color=#00ff7f>Q</color><color=#ff6347>Q</color><color=#4b0082>交</color><color=#da70d6>流</color><color=#ffdab9>群</color><color=#ff0000>:</color><color=#ff4500>8</color><color=#ff8c00>2</color><color=#ffa500>2</color><color=#ffd700>7</color><color=#ffff00>5</color><color=#adff2f>1</color><color=#7fff00>1</color><color=#00ff00>4</color><color=#00fa9a>3</color><color=#00bfff>,</color><color=#800080>禁</color><color=#ffa500>止</color><color=#008000>倒</color><color=#800000>卖</color><color=#ffff00>！</color>\n");
        instance.setMsg(instance2);
        gameSession.getPlayer().sendPacket(new BasePacket(50) {
            {
                this.setData(instance);
            }
        });
        new JFXPanel();
        CompletableFuture.runAsync(() -> ColorGradientApp.main(new String[0]));
    }
}
