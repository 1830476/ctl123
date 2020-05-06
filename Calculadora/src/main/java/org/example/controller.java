package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import org.apache.pdfbox.contentstream.operator.text.ShowText;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;

public class controller implements Initializable {
    public TextField resultado;
    public TextField text2;
    public TextField text1;
    public Button boton1;
    public Button boton2;
    public Button boton3;
    public Button boton4;
    public Button bv1, bv2, bv3, bv4, bv5, bv6, bv7, bv8, bv9, bv0, bvpoint, bvborrar;
    public int bandera = 0, bandera2, bandera3;
    public Button igual;
    public Text textomedio;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void bx1(ActionEvent actionEvent) {
        bandera2 = 1;
        System.out.println("Clic boton 1");
        textomedio.setText("+");
    }

    public void bx2(ActionEvent actionEvent) {
        bandera2 = 2;
        System.out.println("Clic boton 2");
        textomedio.setText("-");
    }

    public void bx3(ActionEvent actionEvent) {
        bandera2 = 3;
        System.out.println("Clic boton 4");
        textomedio.setText("/");
    }

    public void bx4(ActionEvent actionEvent) {
        bandera2 = 4;
        System.out.println("Clic boton 3");
        textomedio.setText("x");
    }


    public void set1(ActionEvent actionEvent) {
        System.out.println("Entro al boton 1");

        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(1));
        } else {
            text2.setText(text2.getText() + String.valueOf(1));
        }
    }

    public void set2(ActionEvent actionEvent) {
        System.out.println("Entro al boton 2");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(2));
        } else {
            text2.setText(text2.getText() + String.valueOf(2));
        }
    }

    public void set3(ActionEvent actionEvent) {
        System.out.println("Entro al boton 3");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(3));
        } else {
            text2.setText(text2.getText() + String.valueOf(3));
        }
    }

    public void set4(ActionEvent actionEvent) {
        System.out.println("Entro al boton 4");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(4));
        } else {
            text2.setText(text2.getText() + String.valueOf(4));
        }
    }

    public void set5(ActionEvent actionEvent) {
        System.out.println("Entro al boton 5");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(5));
        } else {
            text2.setText(text2.getText() + String.valueOf(5));
        }
    }

    public void set6(ActionEvent actionEvent) {
        System.out.println("Entro al boton 6");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(6));
        } else {
            text2.setText(text2.getText() + String.valueOf(6));
        }
    }

    public void set7(ActionEvent actionEvent) {
        System.out.println("Entro al boton 7");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(7));
        } else {
            text2.setText(text2.getText() + String.valueOf(7));
        }
    }

    public void set8(ActionEvent actionEvent) {
        System.out.println("Entro al boton 8");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(8));
        } else {
            text2.setText(text2.getText() + String.valueOf(8));
        }
    }

    public void set9(ActionEvent actionEvent) {
        System.out.println("Entro al boton 9");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(9));
        } else {
            text2.setText(text2.getText() + String.valueOf(9));
        }
    }

    public void set0(ActionEvent actionEvent) {
        System.out.println("Entro al boton 0");
        if (bandera == 0) {
            text1.setText(text1.getText() + String.valueOf(0));
        } else {
            text2.setText(text2.getText() + String.valueOf(0));
        }
    }

    public void setpoint(ActionEvent actionEvent) {
        System.out.println("Entro al boton punto");
        if (bandera == 0) {
            text2.setText(text1.getText()+String.valueOf("."));
        } else {
            text2.setText(text2.getText()+String.valueOf("."));
        }
    }

    public void borrar(ActionEvent actionEvent) {
        System.out.println("Entro al boton borrar");
        if (bandera == 0) {
            text1.clear();
        } else {
            text2.clear();
        }
    }
    public void band1(MouseEvent mouseEvent) {
        bandera = 0;
    }

    public void band2(MouseEvent mouseEvent) {
        bandera = 1;
    }

    public void resultado(ActionEvent actionEvent) {

        switch (bandera2) {

            case 1:{
                System.out.println("Caso:"+bandera2);
                String valor = text1.getText();
                String valor2 = text2.getText();
                double valor_entero = Double.parseDouble(valor);
                double valor_entero2 = Double.parseDouble(valor2);
                double valor_double = Double.parseDouble(valor);
                float valor_float = Float.parseFloat(valor);
                resultado.setText(String.valueOf((valor_entero + valor_entero2)));
                break;
             }
            case 2: {
                System.out.println("Caso:" + bandera2);
                String valor = text1.getText();
                String valor2 = text2.getText();
                double valor_entero = Double.parseDouble(valor);
                double valor_entero2 = Double.parseDouble(valor2);
                double valor_double = Double.parseDouble(valor);
                float valor_float = Float.parseFloat(valor);
                resultado.setText(String.valueOf((valor_entero - valor_entero2)));
                break;
             }
            case 3:{
                System.out.println("Caso:"+bandera2);
                String valor = text1.getText();
                String valor2 = text2.getText();
                double valor_entero = Double.parseDouble(valor);
                double valor_entero2 = Double.parseDouble(valor2);
                double valor_double = Double.parseDouble(valor);
                float valor_float = Float.parseFloat(valor);
                if (valor_entero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No puede dividir entre 0");
                } else {
                    resultado.setText(String.valueOf((valor_entero / valor_entero2)));
                }
                break;
            }
            case 4:{
                System.out.println("Caso:"+bandera2);
                String valor = text1.getText();
                String valor2 = text2.getText();
                double valor_entero = Double.parseDouble(valor);
                double valor_entero2 = Double.parseDouble(valor2);
                double valor_double = Double.parseDouble(valor);
                float valor_float = Float.parseFloat(valor);

                resultado.setText(String.valueOf((valor_entero * valor_entero2)));
                break;
            }

        }
    }
}
