/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigopostal;
import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class CodigoPostal{

    public void CP(){
    Scanner stdln = new Scanner(System.in);
    String cp;
    System.out.print("Introduzca el codigo postal: ");
    cp = stdln.nextLine();
    switch (cp.charAt(0)){
        case '0':
            System.out.print(cp + "esta en el Suroeste  ");
            break;    
        case '1':
            System.out.print(cp + "esta en la zona recidencial de Morio   ");
            break;
        case '2':
            System.out.print(cp + "esta el area Comercial  ");
            break;
        case '3':
            System.out.print(cp + "esta en la costa Este  ");
            break;
        case '4':
            System.out.print(cp + "esta en la zona recidencial de springfield  ");
            break;
        case '5':
            System.out.print(cp + "esta en el area sur de la playa  ");
            break;
        case '6':
            System.out.print(cp + "esta el area del Plano Central  ");
            break;
        case '7':
            System.out.print(cp + "esta en el sur  ");
            break;
        case '8':
            System.out.print(cp + "esta el area de Tlaxcala  ");
            break;
        default:
            System.out.print( cp  + "opcion invalida  ");
            break;
        }
    }
    public static void main(String[] args){
      CodigoPostal cp = new CodigoPostal();
      cp.CP();  
    } 
}
