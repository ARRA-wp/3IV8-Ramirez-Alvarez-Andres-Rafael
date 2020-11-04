import java.util.Scanner;

public class metodinNum{

    /*
    Programa que se encargue de saber cual el numero mayor
    y menor utilizando metodos para optimizar su operacion
    */ 

    //variables globales
    int m;
    
    

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        //este es el cuerpo principal
        //aqui es donde se ejecuta
        //tengo que crear un objeto de la clase, para asi
        //mandar a llamar a sus metodos
        metodinNum maymen = new metodinNum();
        //mando a llamar a su metodo
        
        do{
        System.out.println("(umu)/");    
        maymen.cargarValores();  //manda a llamar con el objeto al metodo.
        System.out.println("Deseas repetir?");
        letra = entrada.nextLine();
        System.out.println("ono");
        }while(letra!="s");


    }

    //vamos a crear un metodo que tenga el menu de opciones
    //el menu de operaciones
    //palabra reservada vacio para metodos que 
    //no necesitan parametros
    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);

        //variables
        int val1, val2, val3;
        int mayor, menor;

        System.out.println("Ingresa el primer numero a comparar");
        val1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar");
        val2 = entrada.nextInt();
        System.out.println("Ingresa el tercero numero a comparar");
        val3 = entrada.nextInt();

        //ahor avamos a mandar a llamar un metodo que se encargue
        //de conocer cual es el mayor y el menor
        //envio los valores o los parametros
        System.out.println("¬¬");
        mayor = calcularMayor(val1, val2, val3);
        System.out.println("kok");
        menor = calcularmenor(val1, val2, val3);

        



        //ahora vamos a imprimir el resultado
        System.out.println("El valor mayor es: "+ mayor);
        System.out.println("El valor menor es: "+ menor);
    }

    //recibir los parametros
    public int calcularMayor(int v1, int v2, int v3){

        //vamos a realizar las operaciones
        //para saber quien es el mas grande
        //necesitamos retornar el valor mas grande
        //int m;
        if(v1>v2 && v1>v3){
            //asigno v1 a m
            m = v1;
        }else{
            if(v2>v3){
                m = v2;
            }
            else{
                m = v3;
            }
        }
        return m;

    }

    public int calcularmenor(int v1, int v2, int v3){

        //vamos a realizar las operaciones
        //para saber quien es el mas chiquito
        //necesitamos retornar el valor mas chiquito
        //int m;
        if(v1<v2 && v1<v3){
            //asigno v1 a m
            m = v1;
        }else{
            if(v2<v3){
                m = v2;
            }
            else{
                m = v3;
            }
        }
        return m;

    }

}