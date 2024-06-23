
package emu.lunarcore.server.packet.recv;

import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.image.Image;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.net.URI;
import java.awt.Desktop;
import javafx.scene.control.Hyperlink;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.application.Application;

public class ColorGradientApp extends Application {
    @Override
    public void start(final Stage stage) {
        final String s = "本软件由UP主免费分享，QQ交流群:822751143，禁止倒卖！";
        final String[] array = { "#ff69b4", "#ffd700", "#00ff00", "#00bfff", "#ff1493", "#ff8c00", "#7fff00", "#ff00ff",
                "#00ffff", "#8a2be2", "#dc143c", "#00ff7f", "#ff6347", "#4b0082", "#da70d6", "#ffdab9", "#ff0000",
                "#ff4500", "#ff8c00", "#ffa500", "#ffd700", "#ffff00", "#adff2f", "#7fff00", "#00ff00", "#00fa9a",
                "#00bfff", "#800080", "#ffa500", "#008000", "#800000", "#ffff00" };
        final TextFlow textFlow = new TextFlow();
        for (int i = 0; i < s.length(); ++i) {
            final Text text = new Text(String.valueOf(s.charAt(i)));
            text.setFill(Color.web(array[i % array.length]));
            text.setFont(Font.font(18.0));
            textFlow.getChildren().add(text);
        }
        textFlow.setTextAlignment(TextAlignment.CENTER);
        final Hyperlink hyperlink = new Hyperlink("点击加群");
        hyperlink.setFont(Font.font(22.0));
        hyperlink.setOnAction(p0 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://qm.qq.com/q/kzzOlbyZoW"));
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
            return;
        });
        final VBox vBox = new VBox(new Node[] { textFlow, hyperlink });
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10.0);
        final BackgroundImage backgroundImage = new BackgroundImage(new Image("https://api.cenguigui.cn/api/pic/"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        final StackPane stackPane = new StackPane(new Node[] { vBox });
        stackPane.setBackground(new Background(new BackgroundImage[] { backgroundImage }));
        final Scene scene = new Scene(stackPane, 400.0, 200.0);
        stage.setTitle("欢迎加入男娘群");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // 这是启动JavaFX应用的正确方式
    }
}
