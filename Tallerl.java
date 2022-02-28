package tallerl;
import java.util.Scanner;
public class Tallerl {
    public static float nota(float[] notas, int i, int x){
        float prom, sum_not=0;
        for(int j=0;j<i-1;j++){
            sum_not=sum_not+notas[j];
        }prom=sum_not/x;
        return prom;
    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int i=1,j=0;
        float nota;
        System.out.print("Ingrese la cantidad de notas que desea ingresar: ");
        int x=entrada.nextInt();
        float [] notas=new float[x];
        do{
            System.out.print("Ingresa la nota "+i+" : ");
            nota=entrada.nextFloat();
            notas[j]=nota;
            j+=1;
            i+=1;
        }while(i<=x);
        System.out.println("El promedio de las notas es: "+nota(notas, i, x));
    }    
}
