import java.util.Scanner;

class Calculadora{

    /*
    vamos a crear un programa que se encargue de realizar
    un menu en el cual se pueda elegir entre calcular
    el area o el perimetro de las siguientes figuras
    triangulo
    cuadrado
    circulo
    actualizacion, ahora quiero que se repita todo el programa
    para volver a calcular otra area,
    como trabajo
    ustedes deben agregar las opciones del perimetro
    y dos figuras mas
    rectangulo pentagono
    */

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int suma1, suma2, resta1, resta2, multi1, multi2,divi1,divi2,opcion;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Sumar ");
        System.out.println("2.- Restar ");
        System.out.println("3.- Multiplicar ");
        System.out.println("4.- Dividir ");
        System.out.println("5.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el primer valor");
                suma1 = entrada.nextInt();
                System.out.println("Ingresa el segundo valor");
                suma2 = entrada.nextInt();

                resultado = suma1+suma2;

                System.out.println("La suma fue de: "+resultado);
                break;

            case 2:
            System.out.println("Ingresa el primer valor");
            resta1 = entrada.nextInt();
            System.out.println("Ingresa el segundo valor");
            resta2 = entrada.nextInt();

            resultado = resta1-resta2;

            System.out.println("El residuo fue de: "+resultado);
                
                break;

            case 3:
            System.out.println("Ingresa el primer valor a multiplicar");
            multi1 = entrada.nextInt();
            System.out.println("Ingresa el segundo valor a multiplicar");
            multi2 = entrada.nextInt();

            resultado = multi1*multi2;

            System.out.println("El producto fue de: "+resultado);
                break;
                case 4:
                System.out.println("Ingresa el dividendo");
            divi1 = entrada.nextInt();
            System.out.println("Ingresa el divisor");
            divi2 = entrada.nextInt();

            resultado = divi1/divi2;

            System.out.println("El cociente fue de: "+resultado);
                break;

            default:
                System.out.println("Gracias por participar :3 ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');
        
        //System.out.println(letra);
        
    }
}
