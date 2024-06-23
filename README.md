<<<<<<< HEAD


**注意:** 如果需要任何额外的支持、问题或者讨论，请查看我们的 [QQ 群](https://qm.qq.com/q/Wtf44VDGuY).

### 显著特点
- 基本游戏功能：登录、队伍配置、背包、基本场景/实体管理
- 战斗功能
- 自然世界怪物/道具/NPC生成
- 大多数角色技能已处理
- NPC商店已处理
- 祈愿系统
- 邮件系统
- 好友系统（好友支援尚未实现）
- 忘却之庭（带有1.4.0功能）
- 模拟宇宙（可以运行，但缺少许多功能）

# 运行服务端和客户端

### 必需条件
* [Java 17 JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### 推荐安装
* [MongoDB 4.0+](https://www.mongodb.com/try/download/community)

### 编译服务端核心
1. 打开系统终端，使用 `./gradlew jar` 编译服务端核心
2. 在服务器目录中创建一个名为 `resources` 的文件夹
3. 从 [https://github.com/Dimbreath/StarRailData](https://github.com/Dimbreath/StarRailData) 下载 `Config`、`TextMap` 和 `ExcelBin` 文件夹，并将它们放入资源文件夹
4. 从 [https://gitlab.com/Melledy/LunarCore-Configs](https://gitlab.com/Melledy/LunarCore-Configs) 下载 `Config` 文件夹，并将其放入资源文件夹。替换系统询问的任何文件。这些文件用于世界生成，对服务器非常重要。
5. 从系统终端使用 `java -jar LunarCore.jar` 运行服务端。Lunar Core带有一个内置的MongoDB数据库服务，因此不需要安装MongoDB。但是，强烈建议安装MongoDB。
6. 如果在配置中将 `autoCreateAccount` 设置为true，则可以跳过创建帐户的步骤。否则，需要在服务器控制台使用 `/account` 命令创建一个帐户。

### 与客户端（Fiddler）连接
1. **使用客户端至少一次登录到官方服务器和Hoyoverse账户以下载游戏数据。**
2. 安装并运行 [Fiddler Classic](https://www.telerik.com/fiddler)。
3. 将Fiddler设置为解密https流量（工具 -> 选项 -> HTTPS -> 解密HTTPS流量），确保选中 `忽略服务器证书错误`。
4. 将以下代码复制并粘贴到Fiddler Classic的Fiddlerscript选项卡中：

```javascript
=======
![LunarCore](https://socialify.git.ci/Melledy/LunarCore/image?description=1&descriptionEditable=A%20game%20server%20reimplementation%20for%20version%202.3.0%20of%20a%20certain%20turn-based%20anime%20game%20for%20educational%20purposes.%20&font=Inter&forks=1&issues=1&language=1&name=1&owner=1&pulls=1&stargazers=1&theme=Light)
<div align="center"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/Melledy/LunarCore?logo=java&style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/github/license/Melledy/LunarCore?style=for-the-badge"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Melledy/LunarCore?style=for-the-badge"> <img alt="GitHub Workflow Status" src="https://img.shields.io/github/actions/workflow/status/Melledy/LunarCore/build.yml?branch=development&logo=github&style=for-the-badge"></div>

<div align="center"><a href="https://discord.gg/cfPKJ6N5hw"><img alt="Discord - LunarCore" src="https://img.shields.io/discord/1163718404067303444?label=Discord&logo=discord&style=for-the-badge"></a></div>

[EN](README.md) | [简中](docs/README_zh-CN.md) | [繁中](docs/README_zh-TW.md) | [JP](docs/README_ja-JP.md) | [RU](docs/README_ru-RU.md) | [FR](docs/README_fr-FR.md) | [KR](docs/README_ko-KR.md) | [VI](docs/README_vi-VI.md)

**Attention:** For any extra support, questions, or discussions, check out our [Discord](https://discord.gg/cfPKJ6N5hw).

### Notable features
- Basic game features: Logging in, team setup, inventory, basic scene/entity management
- Monster battles working
- Natural world monster/prop/NPC spawns
- Character techniques
- Crafting/Consumables working
- NPC shops handled
- Gacha system
- Mail system
- Friend system (Assists are not working yet)
- Forgotten hall
- Pure Fiction
- Simulated universe (Runs can be finished, but many features are missing)

# Running the server and client

### Prerequisites
* [Java 17 JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### Recommended
* [MongoDB 4.0+](https://www.mongodb.com/try/download/community)

### Compiling the server
1. Open your system terminal, and compile the server with `./gradlew jar`
2. Create a folder named `resources` in your server directory
3. Download the `Config`, `TextMap`, and `ExcelBin` folders from [https://github.com/Dimbreath/StarRailData](https://github.com/Dimbreath/StarRailData) and place them into your resources folder.
4. Run the server with `java -jar LunarCore.jar` from your system terminal. Lunar Core comes with a built-in internal MongoDB server for its database, so no Mongodb installation is required. However, it is highly recommended to install Mongodb anyway. 

### Connecting with the client (Fiddler method)
1. **Log in with the client to an official server and Hoyoverse account at least once to download game data.**
2. Install and have [Fiddler Classic](https://www.telerik.com/fiddler) running.
3. Copy and paste the following code into the Fiddlerscript tab of Fiddler Classic. Remember to save the fiddler script after you copy and paste it:

```
>>>>>>> 415ee989561fab0fc7a8f24e1ed8126eca6f7086
import System;
import System.Windows.Forms;
import Fiddler;
import System.Text.RegularExpressions;

class Handlers
{
    static function OnBeforeRequest(oS: Session) {
        if (oS.host.EndsWith(".starrails.com") || oS.host.EndsWith(".hoyoverse.com") || oS.host.EndsWith(".mihoyo.com") || oS.host.EndsWith(".bhsr.com")) {
<<<<<<< HEAD
            oS.host = "localhost"; // 这也可以替换为其他IP地址。
=======
            oS.oRequest.headers.UriScheme = "http";
            oS.host = "localhost"; // This can also be replaced with another IP address.
>>>>>>> 415ee989561fab0fc7a8f24e1ed8126eca6f7086
        }
    }
};
```

<<<<<<< HEAD
5. 使用您的帐户名称登录，密码可以设置为任何值。

### 服务器命令
服务器命令可以在服务器控制台或游戏中运行。每个玩家的好友列表中都有一个名为 "Server" 的虚拟用户，您可以向其发送消息以使用游戏中的命令。

```
/account {create | delete} [username] (保留玩家uid). 创建或删除一个帐户。
/avatar lv(level) p(ascension) r(eidolon) s(skill levels). 设置当前角色的属性。
/clear {relics | lightcones | materials | items}. 从玩家库存中删除过滤的物品。
/gender {male | female}. 设置玩家性别。
/give [item id] x[amount] lv[number]. 给予目标玩家一个物品。
/giveall {materials | avatars}. 给予目标玩家物品。
/heal. 治疗你的角色。
/help 显示可用命令列表。
/kick @[player id]. 将一名玩家踢出服务器。
/mail [content]. 发送系统邮件给目标玩家。
/permission {add | remove | clear} [permission]. 向目标玩家授予/移除权限。
/refill. 在开放世界中补充战技点。
/reload. 重载服务器配置。
/scene [scene id] [floor id]. 将玩家传送到指定的场景。
/spawn [monster/prop id] x[amount] s[stage id]. 在目标玩家附近生成怪物或道具。
/unstuck @[player id]. 如果离线玩家卡在不加载的场景中，解除卡住。
/worldlevel [world level]. 设置目标玩家的均衡等级。
=======
4. If `autoCreateAccount` is set to true in the config, then you can skip this step. Otherwise, type `/account create [account name]` in the server console to create an account.
5. Login with your account name, the password field is ignored by the server and can be set to anything.

### Server commands
Server commands can be run in the server console or in-game. There is a dummy user named "Server" in every player's friends list that you can message to use in-game commands.

```
/account {create | delete} [username] (reserved player uid). Creates or deletes an account.
/avatar lv(level) p(ascension) r(eidolon) s(skill levels). Sets the current avatar's properties.
/clear {relics | lightcones | materials | items}. Removes filtered items from the player inventory.
/gender {male | female}. Sets the player's gender.
/give [item id] x[amount] lv[number]. Gives the targetted player an item.
/giveall {materials | avatars | lightcones | relics}. Gives the targeted player items.
/heal. Heals your avatars.
/help. Displays a list of available commands.
/kick @[player id]. Kicks a player from the server.
/mail [content]. Sends the targeted player a system mail.
/permission {add | remove | clear} [permission]. Gives/removes a permission from the targeted player.
/refill. Refill your skill points in open world.
/reload. Reloads the server config.
/scene [scene id] [floor id]. Teleports the player to the specified scene.
/spawn [npc monster id/prop id] s[stage id] x[amount] lv[level] r[radius] <battle monster ids...>. Spawns a monster or prop near the targeted player.
/stop. Stops the server
/unstuck @[player id]. Unstucks an offline player if they're in a scene that doesn't load.
/worldlevel [world level]. Sets the targeted player's equilibrium level.
>>>>>>> 415ee989561fab0fc7a8f24e1ed8126eca6f7086
```
