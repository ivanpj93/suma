import javax.swing.*;

public class Main {
    //variables menú
    static int option;
    static String menu;
    public static void main(String[] args) {
        OperacionesBasicas objOperaciones = new OperacionesBasicas();
        //menú de opciones operaciones

        do{
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1.- Suma\n" + "2.- Resta\n" + "3.- Divición\n" + "4.- Multiplicación\n" + "5.- Tablas\n" + "6.- Salir\n");
            option = Integer.parseInt(menu);
            //se crea el menu
            switch(option){
                case 1:
                    objOperaciones.suma();
                    break;
                case 2:
                    objOperaciones.resta();
                    break;
                case 3:
                    objOperaciones.divicion();
                    break;
                case 4:
                    objOperaciones.multiplicacion();
                    break;
                case 5:
                    objOperaciones.tablasMulti();
                    break;
                case 6:
                    break;
            }
        }while (option != 6);
    }
}