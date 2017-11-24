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

    //region Declarações

    String parcela1;
    String operacao;

    //endregion

    //region Btn Scene

    Button Basica = new Button ("Básica");
    Button Cientifica = new Button ("Ciêntifica");
    Button Gravar = new Button("Gravar");
    Button Ler = new Button("Ler");
    Button acercaDe = new Button ("Acerca De");
    Button Gravar2 = new Button("Gravar");
    Button Ler2 = new Button("Ler");
    Button acercaDe2 = new Button ("Acerca De");

    //endregion

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //region Calculadora Básica

        try {

            //region Display
            TextField display = new TextField();
            //endregion

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
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "+";                         //Executa a operaçao
                }


            });
            opeMenos.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "-";                         //Executa a operaçao
                }
            });
            opeMultiplicar.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "*";                         //Executa a operaçao
                }
            });
            opeDividir.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
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
                if (operacao != "" && parcela1 != "" && display.getText() != "") {

                    //se opraçao for +
                    if (operacao == "+") {
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
                    if (operacao == "-") {
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
                    if (operacao == "*") {
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
                    if (operacao == "/") {

                        if (!display.getText().equals("0")) {
                            //Converte para doubles as strings parcela1 e display e soma
                            double valor1 = Double.parseDouble(parcela1);
                            double valor2 = Double.parseDouble(display.getText());
                            double resultado = valor1 / valor2;

                            //Coloca o display e o resultado convertido para string
                            String total = String.valueOf(resultado);
                            display.setText(total);
                            operacao = "";

                        } else {
                            AlertBox.Show("Erro", "Impossivel dividir por 0");
                            operacao = "";

                        }
                    }
                }

            });
            //endregion

            //region Parte Gráfica

            VBox todosOsButoes = new VBox(5);
            HBox numeros123EDividir = new HBox(10);
            HBox numeros456EMultiplicar = new HBox(10);
            HBox numeros789EClear = new HBox(10);
            HBox numero0MaisEMenosEIgual = new HBox(10);
            BorderPane borderPane = new BorderPane();

            display.setAlignment(Pos.CENTER_RIGHT);
            display.setPrefHeight(60);
            display.setFont((Font.font(20)));

            borderPane.setTop(display);
            borderPane.setCenter(todosOsButoes);

            StackPane layoutRoot = new StackPane();
            layoutRoot.getChildren().addAll(borderPane);
            Scene scene = new Scene(layoutRoot, 320, 200);

            numeros123EDividir.getChildren().addAll(num1, num2, num3, opeDividir, Gravar);
            numeros456EMultiplicar.getChildren().addAll(num4, num5, num6, opeMultiplicar, Ler);
            numeros789EClear.getChildren().addAll(num7, num8, num9, clear, Cientifica);
            numero0MaisEMenosEIgual.getChildren().setAll(num0, opeMais, opeMenos, opeIgual, acercaDe);

            todosOsButoes.getChildren().addAll(numeros789EClear, numeros456EMultiplicar, numeros123EDividir, numero0MaisEMenosEIgual);

            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setTitle(" Calculadora Básica");

            //endregion

            //region Btn Básica

            Basica.setOnAction(e -> {
                primaryStage.setScene(scene);
                primaryStage.show();
                primaryStage.setTitle(" Calculadora Básica");
            });

            //endregion

        } catch (Exception e) {
            e.printStackTrace();
        }

        //endregion

        //region Calculadora Ciêntifica

        try {

            //region Display
            TextField display = new TextField();
            //endregion

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
            Button raiz = new Button ("√¯");
            Button quadrado =  new Button ("x2");
            Button cubo = new Button ("x3");
            Button elevado = new Button ("^");


            opeMais.setPrefWidth(50);
            opeMenos.setPrefWidth(50);
            opeMultiplicar.setPrefWidth(50);
            opeDividir.setPrefWidth(50);
            opeIgual.setPrefWidth(50);
            clear.setPrefWidth(50);
            raiz.setPrefWidth(50);
            quadrado.setPrefWidth(50);
            cubo.setPrefWidth(50);
            elevado.setPrefWidth(50);

            opeMais.setPrefHeight(35);
            opeMenos.setPrefHeight(35);
            opeMultiplicar.setPrefHeight(35);
            opeDividir.setPrefHeight(35);
            opeIgual.setPrefHeight(35);
            clear.setPrefHeight(35);
            raiz.setPrefHeight(35);
            quadrado.setPrefHeight(35);
            cubo.setPrefHeight(35);
            elevado.setPrefHeight(35);

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
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "+";                         //Executa a operaçao
                }

            });

            opeMenos.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "-";                         //Executa a operaçao
                }

            });

            opeMultiplicar.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "*";                         //Executa a operaçao
                }

            });

            opeDividir.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
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

            raiz.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "√";                         //Executa a operaçao
                }

            });

            quadrado.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "x2";                        //Executa a operaçao
                }

            });

            cubo.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "x3";                        //Executa a operaçao
                }

            });

            elevado.setOnAction(e -> {
                if (display.getText().equals("")) {
                    AlertBox.Show("Erro", "Nao Existem Numeros No Display Para serem Operados");      //Mensagem a dizer ao user que nao existem numeros no display
                } else {
                    parcela1 = display.getText();           //Valor do display vai para a variavel parcela1 e fica em memoria
                    display.setText("");                    //Limpa o display
                    operacao = "^";                         //Executa a operaçao
                }

            });

            opeIgual.setOnAction(e -> {

                if (operacao != "" && parcela1 != "" && display.getText() != "") {

                    //se opraçao for +
                    if (operacao == "+") {
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
                    if (operacao == "-") {
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
                    if (operacao == "*") {
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
                    if (operacao == "/") {

                        if (!display.getText().equals("0")) {
                            //Converte para doubles as strings parcela1 e display e soma
                            double valor1 = Double.parseDouble(parcela1);
                            double valor2 = Double.parseDouble(display.getText());
                            double resultado = valor1 / valor2;

                            //Coloca o display e o resultado convertido para string
                            String total = String.valueOf(resultado);
                            display.setText(total);
                            operacao = "";

                        } else {
                            AlertBox.Show("Erro", "Impossivel dividir por 0");
                            operacao = "";

                        }
                    }
                }

                if (operacao == "√") {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1);
                    double resultado = Math.sqrt(valor1);

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    display.setText(total);
                    operacao = "";
                }

                if (operacao == "x2") {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1);
                    double resultado = valor1 * valor1;

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    display.setText(total);
                    operacao = "";
                }

                if (operacao == "x3") {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1);
                    double resultado = valor1 * valor1 * valor1;

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    display.setText(total);
                    operacao = "";
                }

                if (operacao == "^") {
                    //Converte para doubles as strings parcela1 e display e soma
                    double valor1 = Double.parseDouble(parcela1);
                    double valor2 = Double.parseDouble(display.getText());
                    double resultado = Math.pow(valor1, valor2);

                    //Coloca o display e o resultado convertido para string
                    String total = String.valueOf(resultado);
                    display.setText(total);
                    operacao = "";
                }
            });

            //endregion

            //region Parte Gráfica

            VBox todosOsButoes = new VBox(5);
            HBox numeros123EDividirEx2 = new HBox(10);
            HBox numeros456EMultiplicarEx3 = new HBox(10);
            HBox numeros789EClearERaiz = new HBox(10);
            HBox numero0MaisEMenosEIgualEElevado = new HBox(10);
            BorderPane borderPane = new BorderPane();

            display.setAlignment(Pos.CENTER_RIGHT);
            display.setPrefHeight(60);
            display.setFont((Font.font(20)));

            borderPane.setTop(display);
            borderPane.setCenter(todosOsButoes);

            StackPane layoutRoot = new StackPane();
            layoutRoot.getChildren().addAll(borderPane);
            Scene scene2 = new Scene(layoutRoot, 360, 200);

            numeros123EDividirEx2.getChildren().addAll(num1, num2, num3, opeDividir, quadrado, Gravar2);
            numeros456EMultiplicarEx3.getChildren().addAll(num4, num5, num6, opeMultiplicar, cubo, Ler2);
            numeros789EClearERaiz.getChildren().addAll(num7, num8, num9, clear, raiz, Basica);
            numero0MaisEMenosEIgualEElevado.getChildren().setAll(num0, opeMais, opeMenos, opeIgual, elevado, acercaDe2);

            todosOsButoes.getChildren().addAll(numeros789EClearERaiz, numeros456EMultiplicarEx3, numeros123EDividirEx2, numero0MaisEMenosEIgualEElevado);

            //endregion

            //region Btn Ciêntifica

            Cientifica.setOnAction(e -> {
                primaryStage.setScene(scene2);
                primaryStage.show();
                primaryStage.setTitle(" Calculadora Ciêntifica");
            });

            //endregion

            //region Btn Gravar

            // String fileAndLocation = "C:\\Users\\a50445\\Desktop\\Valores.bin\\";
            String fileAndLocation = "C:\\Users\\newma\\Desktop\\Valores.bin\\";
            //Serialization Serializar = (fileAndLocation, );

            //endregion
            //region Btn Ler

            //endregion

            //region Btn Acerca De
            acercaDe.setOnAction(e -> AlertBox.Show("Sobre mim", "Olá eu sou o Gonçalo Coelho Nº7 do 2ºGI"));
            //endregion

        } catch (Exception e) {
            e.printStackTrace();
        }

        //endregion

    }
}

