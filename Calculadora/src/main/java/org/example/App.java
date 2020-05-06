package org.example;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
public class App extends Application {

        public static void main( String[] args ){
            launch(args);
        }


    public void start(Stage stage) throws Exception {
        stage = FXMLLoader.load(getClass().getResource("/Elementos/tier1.fxml"));
        stage.show();
    }
}





        /*
        int i = 0;
        for (i=1;i<3;i++){
            System.out.println("Entro al for n veces:"+i);
    }
        i=0;

        System.out.println(" ");
        while (i<5){
            System.out.println("Entro al while n veces+"+i);
            i++;
        }

            i=0;
        System.out.println(" ");
        do {

            System.out.println("Entro al do while n veces+"+i);
            i++;
        }while (i<5);


    }
}





        /*
        System.out.println("Ingresa l1");
        int l1 = entrada.nextInt();
        System.out.println("Ingresa l2");
        int l2 = entrada.nextInt();
        System.out.println("Ingresa l3");
        int l3 = entrada.nextInt();

        int ar=0,div=0;

        System.out.println("valores de l"+l1+l2+l3);
        System.out.println("valores de ardiv"+ar+div);

            ar = tier1.area(l1,l2,l3);
            tier1.suma();
            div = tier1.division();
            tier1.resta(l1,l2,l3);
        System.out.println("Aqui termina la entrada de carga");
        System.out.println(" ");

        System.out.println("El valor del area es"+ar);
        tier1.suma();
        System.out.println("El valor de la division es"+div);
        tier1.resta(l1,l2,l3);
    }
}
*/