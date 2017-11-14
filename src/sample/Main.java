package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        // Butões

        Button button1 = new Button("1");
        button1.setMinWidth(25);
        Button button2 = new Button("2");
        button2.setMinWidth(25);
        Button button3 = new Button("3");
        button3.setMinWidth(25);
        Button buttonIgual = new Button("=");
        buttonIgual.setMinWidth(25);
        Button button4 = new Button("4");
        button4.setMinWidth(25);
        Button button5 = new Button("5");
        button5.setMinWidth(25);
        Button button6 = new Button("6");
        button6.setMinWidth(25);
        Button buttonMais = new Button("+");
        buttonMais.setMinWidth(25);
        Button button7 = new Button("7");
        button7.setMinWidth(25);
        Button button8 = new Button("8");
        button8.setMinWidth(25);
        Button button9 = new Button("9");
        button9.setMinWidth(25);
        Button buttonMenos = new Button("-");
        buttonMenos.setMinWidth(25);
        Button button0 = new Button("0");
        button0.setMinWidth(25);
        Button buttonClear = new Button("C");
        buttonClear.setMinWidth(25);
        Button buttonMultiplicar = new Button("*");
        buttonMultiplicar.setMinWidth(25);
        Button buttonDividir = new Button(":");
        buttonDividir.setMinWidth(25);

        // Display

        HBox display = new HBox();
        display.setPrefWidth(200);

        TextField Texto = new TextField();
        Texto.setEditable(false);

        display.setAlignment(Pos.CENTER);
        display.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9, Texto);
        display.setPadding(new Insets(15, 12, 15, 12));


        // GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(button0, 0, 3);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);
        gridPane.add(button3, 2, 2);

        gridPane.add(button4, 0, 1);
        gridPane.add(button5, 1, 1);
        gridPane.add(button6, 2, 1);

        gridPane.add(button7, 0, 0);
        gridPane.add(button8, 1, 0);
        gridPane.add(button9, 2, 0);

        gridPane.add(buttonIgual, 3, 3);
        gridPane.add(buttonMais, 1, 3);
        gridPane.add(buttonMenos, 2, 3);
        gridPane.add(buttonClear, 3, 0);
        gridPane.add(buttonMultiplicar, 3, 2);
        gridPane.add(buttonDividir, 3, 1);


        try {
            /*
            * -> é o oerador LAMBDA:
            * e - parametro de entrada: contem o evento a disparar: setOnAction
            *   Muda automaticamente consuante o objeto de onde é disparado e o metodo invocado
            * A direita fica o codigo de executar (O EventHandler)
            * NOTA: Se tiver mais que uma linha, sao necessarias chavetas
            */

            button0.setOnAction(e -> {
                Texto = (System.out.println("0"));
            });

            btn2 = new Button("Clica-me para obter uma Alert Box");
            btn2.setOnAction(e -> {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Uau ...");
                alert.setHeaderText("Isto é uma MessageBox");
                alert.setContentText("Sim, parece que sim. E foi chamada pelo botão 2");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Uau ... Foi clicado no botão 2!");
                    }

                    BorderPane layout = new BorderPane();
                    layout.setCenter(gridPane);
                    layout.setTop(display);

                    // Cria a Scene
                    Scene scene = new Scene(layout, 600, 400);

                    // Definição do Título
                    primaryStage.setTitle("Calculadora");

                    // Associar a nova scene ao stage
                    primaryStage.setScene(scene);

                    // Fazer aparecer o stage já montado
                    primaryStage.show();


                });
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


