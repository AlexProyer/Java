package taller;
import java.util.Scanner;
public class Taller {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float prom=0,r=0;
        int n1=0, n2=0, suma=0, resta=0, mult=0, op=0;
        System.out.print("Ingrese dos dígitos: ");
        n1=entrada.nextInt();   
        n2=entrada.nextInt();
        System.out.println("Ahora ingrese una opción de las siguientes: ");
        System.out.println("1) Suma los dos dígitos");
        System.out.println("2) Reste los dos dígitos");
        System.out.println("3) Multiplique los dos dígitos");
        System.out.println("4) Promedio de los dos dígitos");
        op=entrada.nextInt();
        switch(op){
            case 1: suma=n1+n2; r=suma; break;
            case 2: resta=n1-n2; r=resta; break;
            case 3: mult=n1*n2; r=mult;break;
            case 4: prom=(n1+n2)/(2);r=prom;break;
            default: System.out.println("Ha seleccionado una opción errónea. ");
        }
        System.out.println("El resultado es: "+r);
    }
    
}
