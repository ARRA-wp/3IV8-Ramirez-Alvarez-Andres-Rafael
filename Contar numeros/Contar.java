import java.util.Scanner;

import java.util.*;


 class contarnumeros{



    //Metodo principal
    public static void main(String[ ] args){


Scanner Entrada = new Scanner(System.in);

//Variable
String nombre,letras;
int numeros;
Float aux;

System.out.println("Introduce el texto");
letras=Entrada.nextLine();
 for(int x=0; x< letras.lenght(); x++)
If (Character.isDigit(letras.charAt(x)));
{
numeros++;

    if(letras.charAt(x) != (char)32)
    letras ++;
}
System.out.println("Texto tiene"+ letras+ "letras");
System.out.println("Texto tiene"+ numeros+ "numeros");
  
}

    

}