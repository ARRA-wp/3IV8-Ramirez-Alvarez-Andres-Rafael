import java.util.Scanner;

class SumadeNumero{


public static void main(String[] args); {

Scanner entrada= new Scanner(System.in);



int num1, num2, resultado;


System.out.println("Ingresa el primer numero:");
num1 = entrada.nextInt();
System.out.println("Ingresa el segundo numero:");
num2 = entrada.nextInt();

resultado = num1+num2; 

System.out.println("La suma es de:"+resultado);

}

}