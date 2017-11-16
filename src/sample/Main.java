package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    //region declaraçoes
    String parcela1;
    String operacao;
    //endregion

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try{
            TextField display = new TextField();

            //region BtnNum
            Button num0 = new Button("0");
            Button num1 = new Button("1");
            Button num2 = new Button("2");
            Button num3 = new Button("3");
            Button num4 = new Button("4");
            Button num5 = new Button("5");
            Button num6 = new Button("6");
            Button num7 = new Button("7");
            Button num8 = new Button("8");
            Button num9 = new Button("9");

            num0.setPrefWidth(50);
            num1.setPrefWidth(50);
            num2.setPrefWidth(50);
            num3.setPrefWidth(50);
            num4.setPrefWidth(50);
            num5.setPrefWidth(50);
            num6.setPrefWidth(50);
            num7.setPrefWidth(50);
            num8.setPrefWidth(50);
            num9.setPrefWidth(50);

            num0.setPrefHeight(35);
            num1.setPrefHeight(35);
            num2.setPrefHeight(35);
            num3.setPrefHeight(35);
            num4.setPrefHeight(35);
            num5.setPrefHeight(35);
            num6.setPrefHeight(35);
            num7.setPrefHeight(35);
            num8.setPrefHeight(35);
            num9.setPrefHeight(35);
            //endregion

            //region BtnOperadores
            Button opeMais = new Button("+");
            Button opeMenos = new Button("-");
            Button opeDividir = new Button("/");
            Button opeMultiplicar = new Button("*");
            Button opeIgual = new Button("=");
            Button clear = new Button("C");

            opeMais.setPrefWidth(50);
            opeMenos.setPrefWidth(50);
            opeMultiplicar.setPrefWidth(50);
            opeDividir.setPrefWidth(50);
            opeIgual.setPrefWidth(50);
            clear.setPrefWidth(50);

            opeMais.setPrefHeight(35);
            opeMenos.setPrefHeight(35);
            opeMultiplicar.setPrefHeight(35);
            opeDividir.setPrefHeight(35);
            opeIgual.setPrefHeight(35);
            clear.setPrefHeight(35);


            //endregion


            //region Eventos
            num0.setOnAction(e -> {
                display.setText(display.getText() + "0");
            });
            num1.setOnAction(e -> {
                display.setText(display.getText() + "1");
            });
            num2.setOnAction(e -> {
                display.setText(display.getText() + "2");
            });
            num3.setOnAction(e -> {
                display.setText(display.getText() + "3");
            });
            num4.setOnAction(e -> {
                display.setText(display.getText() + "4");
            });
            num5.setOnAction(e -> {
                display.setText(display.getText() + "5");
            });
            num6.setOnAction(e -> {
                display.setText(display.getText() + "6");
            });
            num7.setOnAction(e -> {
                display.setText(display.getText() + "7");
            });
            num8.setOnAction(e -> {
                display.setText(display.getText() + "8");
            });
            num9.setOnAction(e -> {
                display.setText(display.getText() + "9");
            });

            opeMais.setOnAction(e -> {
                if (display.getText().equals(""))
                {
                    AlertBox.Show("Erro","Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                }
                else
                {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "+";                         //Executa a operaçao
                }


            });
            opeMenos.setOnAction(e -> {
                if (display.getText().equals(""))
                {
                    AlertBox.Show("Erro","Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                }
                else
                {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "-";                         //Executa a operaçao
                }
            });
            opeMultiplicar.setOnAction(e -> {
                if (display.getText().equals(""))
                {
                    AlertBox.Show("Erro","Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                }
                else
                {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "*";                         //Executa a operaçao
                }
            });
            opeDividir.setOnAction(e -> {
                if (display.getText().equals(""))
                {
                    AlertBox.Show("Erro","Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                }
                else
                {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "/";                         //Executa a operaçao
                }
            });
            clear.setOnAction(e -> {
                {
                    parcela1 = "";           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "";                         //Executa a operaçao
                }
            });
            opeIgual.setOnAction(e -> {
                if (operacao != "" && parcela1 != "" && display.getText() != "")
                {

                    //se opraçao for +
                    if (operacao == "+")
                    {
                        //Converte para doubles as strings parcela1 e display e soma
                        double valor1 = Double.parseDouble(parcela1);
                        double valor2 = Double.parseDouble(display.getText());
                        double resultado = valor1 + valor2;

                        //Coloca o display e o resultado convertido para string
                        String total = String.valueOf(resultado);
                        display.setText(total);
                        operacao = "";
                    }

                    //se opraçao for -
                    if (operacao == "-")
                    {
                        //Converte para doubles as strings parcela1 e display e soma
                        double valor1 = Double.parseDouble(parcela1);
                        double valor2 = Double.parseDouble(display.getText());
                        double resultado = valor1 - valor2;

                        //Coloca o display e o resultado convertido para string
                        String total = String.valueOf(resultado);
                        display.setText(total);
                        operacao = "";

                    }

                    //se opraçao for *
                    if (operacao == "*")
                    {
                        //Converte para doubles as strings parcela1 e display e soma
                        double valor1 = Double.parseDouble(parcela1);
                        double valor2 = Double.parseDouble(display.getText());
                        double resultado = valor1 * valor2;

                        //Coloca o display e o resultado convertido para string
                        String total = String.valueOf(resultado);
                        display.setText(total);
                        operacao = "";

                    }

                    //se opraçao for /
                    if (operacao == "/")
                    {

                        if (!display.getText().equals("0"))
                        {
                            //Converte para doubles as strings parcela1 e display e soma
                            double valor1 = Double.parseDouble(parcela1);
                            double valor2 = Double.parseDouble(display.getText());
                            double resultado = valor1 / valor2;

                            //Coloca o display e o resultado convertido para string
                            String total = String.valueOf(resultado);
                            display.setText(total);
                            operacao = "";

                        }
                        else
                        {
                            AlertBox.Show("Erro","Impossivel dividir por 0");
                            operacao = "";

                        }
                    }
                }

            });
            //endregion



            //region Parte Grafica
            VBox todosOsButoes= new VBox(5);
            HBox numeros123eMultiplicar = new HBox (10);
            HBox numeros456eMenos = new HBox (10);
            HBox numeros789eMais = new HBox (10);
            HBox numero0eIgualEDividirEClear = new HBox (10);
            BorderPane borderPane = new BorderPane();

            display.setAlignment(Pos.CENTER_RIGHT);
            display.setPrefHeight(60);
            display.setFont((Font.font(20)));

            borderPane.setTop(display);
            borderPane.setCenter(todosOsButoes);

            StackPane layoutRoot = new StackPane();
            layoutRoot.getChildren().addAll(borderPane);
            Scene scene = new Scene(layoutRoot,230,200);

            numeros123eMultiplicar.getChildren().addAll(num1,num2,num3,opeMultiplicar);
            numeros456eMenos.getChildren().addAll(num4,num5,num6,opeMenos);
            numeros789eMais.getChildren().addAll(num7,num8,num9,opeMais);
            numero0eIgualEDividirEClear.getChildren().setAll(num0,opeIgual,opeDividir,clear);

            todosOsButoes.getChildren().addAll(numeros789eMais,numeros456eMenos,numeros123eMultiplicar,numero0eIgualEDividirEClear);


            primaryStage.setScene(scene);

            primaryStage.setTitle("Calculadora");
            primaryStage.show();
            //endregion
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
