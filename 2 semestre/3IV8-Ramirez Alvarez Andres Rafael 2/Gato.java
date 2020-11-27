import java.util.*;
class Gato extends Juego{
 public int Gato(){

    
        //objeto
        Scanner entrada = new Scanner(System.in);

        //arreglo bidimensional
         int matriz[][] = new int [3][3];
        //variables
         String jugador1,jugador2;
        int p,i,j;

System.out.println("Ingresa el nombre del primer jugador," );
jugador1=entrada.nextLine();
System.out.println("Ingresa el nombre del segundo jugador,");
jugador2=entrada.nextLine();
System.out.println("Quien va primero?");
System.out.println("1. Jugador "+jugador1);
System.out.println("2. Jugador "+jugador2);
p=entrada.nextInt();
switch(p){
case 1:
//llamo al metodo
Prueba objeto = new Prueba();
objeto.caso1();
break;

case 2:
//llamo al metodo
Prueba objeto = new Prueba();
objeto.caso2();
break;


}

    
}
}