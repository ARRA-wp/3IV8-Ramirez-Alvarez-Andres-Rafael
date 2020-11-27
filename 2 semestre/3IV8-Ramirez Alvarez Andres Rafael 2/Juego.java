import java.util.Scanner;

public class Juego{

    

    //variables globales
    public int n;
    //encapsulada
    

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        public int n;
        //este es el cuerpo principal
        //aqui es donde se ejecuta
        //tengo que crear un objeto de la clase, para asi
        //mandar a llamar a sus metodos
        Gato objeto = new Gato();
        //mando a llamar a su metodo
        // un do-while para por si quiere volver a hacer o ejecutar el programa.
        do{
           
        objeto.Gato();

        System.out.println("Deseas jugar otra vez?: 0.No   1.Si");
        n=entrada.nextInt();
        }while(n!=0);


    }
}