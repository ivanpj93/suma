import javax.swing.*;

public class OperacionesBasicas {
    //variables
    int num1;
    int num2;
    double resultado;
    int resultadoTbl;

    //constructor
    public OperacionesBasicas(){
        num1=0;
        num2=0;
        resultado=0;
        resultadoTbl=0;

    }
    //creamos los métodos(suma, resta, diviciín, multi)
    //suma
    public void suma(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo número"));
        resultado = num1+num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    //resta
    public void resta(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo número"));
        resultado = num1-num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    //divición
    public void divicion(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo número"));
        resultado = num1/num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    //multiplicación
    public void multiplicacion(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo número"));
        resultado = num1*num2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    //tablas de multiplicar
    public void tablasMulti(){
        int tabla = 10;
        String resultadoTabla = "";
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta la tabla de Multiplicar"));
            for(int j= 1; j<=tabla; j++){
                resultadoTbl = num1 * j;
                resultadoTabla += (num1 + " x " + j + " = " + resultadoTbl + "\n");
            }
        JOptionPane.showMessageDialog(null,resultadoTabla);
    }
}
