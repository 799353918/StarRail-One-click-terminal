package emu.lunarcore.server.packet.recv;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class ColorGradientApp extends Application {
    private static final String MESSAGE = "本软件由UP主免费分享，QQ交流群:822751143，禁止倒卖！";
    private static final String[] COLORS = {
            "#ff69b4", "#ffd700", "#00ff00", "#00bfff", "#ff1493", "#ff8c00",
            "#7fff00", "#ff00ff", "#00ffff", "#8a2be2", "#dc143c", "#00ff7f",
            "#ff6347", "#4b0082", "#da70d6", "#ffdab9", "#ff0000", "#ff4500",
            "#ff8c00", "#ffa500", "#ffd700", "#ffff00", "#adff2f", "#7fff00",
            "#00ff00", "#00fa9a", "#00bfff", "#800080", "#ffa500", "#008000",
            "#800000", "#ffff00"
    };

    @Override
    public void start(Stage primaryStage) {
        TextFlow textFlow = createGradientTextFlow(MESSAGE, COLORS);
        Hyperlink hyperlink = createHyperlink();

        VBox vbox = new VBox(textFlow, hyperlink);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10.0d);

        Image backgroundImage = new Image("https://api.cenguigui.cn/api/pic/");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(100, 100, true, true, false, true));
        StackPane root = new StackPane(vbox);
        root.setBackground(new Background(backgroundImg));

        Scene scene = new Scene(root, 400.0d, 200.0d);
        primaryStage.setTitle("欢迎加入男娘群");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private TextFlow createGradientTextFlow(String message, String[] colors) {
        TextFlow textFlow = new TextFlow();
        for (int i = 0; i < message.length(); i++) {
            Text text = new Text(String.valueOf(message.charAt(i)));
            text.setFill(Color.web(colors[i % colors.length]));
            text.setFont(Font.font(18.0d));
            textFlow.getChildren().add(text);
        }
        textFlow.setTextAlignment(TextAlignment.CENTER);
        return textFlow;
    }

    private Hyperlink createHyperlink() {
        Hyperlink hyperlink = new Hyperlink("点击加群");
        hyperlink.setFont(Font.font(22.0d));
        hyperlink.setOnAction(event -> {
            try {
                HostServices hostServices = getHostServices();
                hostServices.showDocument("https://qm.qq.com/q/kzzOlbyZoW");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return hyperlink;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
