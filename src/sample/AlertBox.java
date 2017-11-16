package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void Show (String title,String msg){


        Stage stageAlertBox = new Stage();                              //Cria Uma Window
        //stageAlertBox.initModality(Modality.APPLICATION_MODAL);             //janela Modal
        stageAlertBox.initModality(Modality.WINDOW_MODAL);                //janela Normal
        stageAlertBox.setTitle(title);                                  //Como titulo recebe a string do parametro
        stageAlertBox.setMinWidth(500);                                 //Largura da Janela
        stageAlertBox.setMinHeight(300);

        Label lbMessage = new Label(msg);                               //Cria a label para mostrar a menssagem
        Button btnClose = new Button("Fechar");                    //Cria botao para fechar janela
        btnClose.setOnAction(e-> stageAlertBox.close());                //Açao fecha esta janela

        VBox layout = new VBox(80);                             //Layout vertical com 80px entre celulas
        layout.getChildren().addAll(lbMessage,btnClose);                //Adiciona Label e Button ao Layout
        layout.setAlignment(Pos.CENTER);                               //Alinha osconteudos ao centro

        Scene scene = new Scene(layout);                                //Cria a Scene e associa o Layout
        stageAlertBox.setScene(scene);                                  //Associa a Scene a janela
        stageAlertBox.showAndWait();                                    //Executa e prende o controlo ateser fechada
    }
}
