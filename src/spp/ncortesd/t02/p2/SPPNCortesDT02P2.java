//Nohely Monserrat Cortés del Ángel
//A01410768
//IMT
package spp.ncortesd.t02.p2;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de valor inferior y superior");
        calculadora();
        
        System.out.println("Vuelve Pronto!");
        
    }
static int data(String valor){
    Scanner kb = new Scanner (System.in);
    
    System.out.print("Ingrese " + valor + ": ");
    int datos = kb.nextInt();
    
    return datos;
}  
static void div(int valor){
    if ((valor%2)==0){
        System.out.println(valor+" es un número par.");
    } if ((valor%3)==0){
          System.out.println(valor+" es un número divisible entre 3.");
        } if ((valor%5)==0) {
            System.out.println(valor+" es un número divisible entre 5.\n");
            } else {}
}
static void calculadora(){
    int valinf = data("valor inferior");
    int valsup = data("valor superior");
    int count = valinf - 1;
    System.out.println("Los valores entre "+valinf+" y "+valsup+" son: ");
    while (count < valsup){
        System.out.println(count=count+1);
    }System.out.println("");;
    div(valinf);
    div(valsup);
    
}

}