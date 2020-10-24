import java.util.*;

public class Temperatura{

    

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        float grados,gradosF;
        int grados,gradosF,opcion;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Cambiar a grados Celsius ");
        System.out.println("2.- Cambiar a grados Fahrenheit ");
        System.out.println("3.- Cambiar a grados Kelvin ");
        System.out.println("4.- Cambiar a grados Rankine ");
        System.out.println("5.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa la temperatura en grados centigrados");
                grados = entrada.nextInt();
                
                gradosF=(grados*1.8)+32

                resultado = (gradosF-32)/1.8;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;
            case 2:
                System.out.println("Ingresa la temperatura en grados centigrados");
                grados = entrada.nextInt();

                resultado = (grados*1.8)+32;

                System.out.println("Los grados Fajrenheit son: "+resultado);
                break;
            case 3:
                System.out.println("Ingresa la temperatura en grados centigrados");
                grados = entrada.nextInt();

                resultado = grados-273.15;

                System.out.println("Los grados en kelvin son: "+resultado);
                break;
            case 4:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa la temperatura en grados centigrados:");
                grados = entrada.nextInt();

                resultado = (grados*1.8)+491.67;

                System.out.println("Los grados en Rankine son: "+resultado);
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