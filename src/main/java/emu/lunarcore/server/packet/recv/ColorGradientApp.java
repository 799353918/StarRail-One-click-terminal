package emu.lunarcore.server.packet.recv;

import java.awt.Desktop;
import java.net.URI;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ColorGradientApp extends Application {
    public void start(Stage primaryStage) {
        String textContent = "本软件由UP主免费分享，QQ交流群:822751143，禁止倒卖！";
        String[] colors = {
                "#ff69b4", "#ffd700", "#00ff00", "#00bfff", "#ff1493", "#ff8c00", "#7fff00", "#ff00ff", "#00ffff",
                "#8a2be2",
                "#dc143c", "#00ff7f", "#ff6347", "#4b0082", "#da70d6", "#ffdab9", "#ff0000", "#ff4500", "#ff8c00",
                "#ffa500",
                "#ffd700", "#ffff00", "#adff2f", "#7fff00", "#00ff00", "#00fa9a", "#00bfff", "#800080", "#ffa500",
                "#008000",
                "#800000", "#ffff00" };
        TextFlow textFlow = new TextFlow();
        for (int i = 0; i < textContent.length(); i++) {
            Text text = new Text(String.valueOf(textContent.charAt(i)));
            text.setFill((Paint) Color.web(colors[i % colors.length]));
            text.setFont(Font.font(18.0D));
            textFlow.getChildren().add(text);
        }
        textFlow.setTextAlignment(TextAlignment.CENTER);
        Hyperlink hyperlink = new Hyperlink("点击加群");
        hyperlink.setFont(Font.font(22.0D));
        hyperlink.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://qm.qq.com/q/kzzOlbyZoW"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        VBox vbox = new VBox(new Node[] { (Node) textFlow, (Node) hyperlink });
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10.0D);
        Image backgroundImage = new Image("https://api.cenguigui.cn/api/pic/");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        StackPane root = new StackPane(new Node[] { (Node) vbox });
        root.setBackground(new Background(new BackgroundImage[] { backgroundImg }));
        Scene scene = new Scene((Parent) root, 400.0D, 200.0D);
        primaryStage.setTitle("欢迎加入男娘群");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
