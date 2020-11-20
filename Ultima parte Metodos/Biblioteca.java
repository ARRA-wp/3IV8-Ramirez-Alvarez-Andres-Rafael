import java.util.Scanner;

public class Biblioteca{
    //objeto
    Scanner entrada = new Scanner(System.in);
//variables
String titulo,autor;
int ndep,opcion,ejemplares,total,subtotal;
int libros=10;
    //metodo
public void Libros(){


System.out.println("Bienvenido :3");
System.out.println("Que es lo que quiere hacer?");
System.out.println("1. Pedir prestado un libro porfavor");
System.out.println("2. Devolver un libro porfavor :3");
opcion=entrada.nextInt();
switch(opcion){

case 1:
System.out.println("Introduce el titulo del libro");
titulo=entrada.nextLine();
System.out.println("Introduce el Autor del libro");
autor=entrada.nextLine();
System.out.println("Cantidad disponible: " + libros);

try{

System.out.println("Cuantos ejemplares quieres del libro?");
ejemplares=entrada.nextInt();
total=libros-ejemplares;
System.out.println("Cantidad disponible: "+total);

}catch(Exception e){
    System.out.println("Porfavor solo ingresa cantidades disponibles");
}
System.out.println("Pase a recoger su(s) libros, buen dia :3");
break;

case 2:
System.out.println("Introduce el titulo del libro");
titulo=entrada.nextLine();
System.out.println("Introduce el Autor del libro");
autor=entrada.nextLine();

try{

System.out.println("Cantidad disponible: " + total);
System.out.println("Cuantos ejemplares vas a devolver del libro?");
ejemplares=entrada.nextInt();
total=libros-ejemplares;
subtotal=libros+ejemplares;
System.out.println("Cantidad disponible: "+ subtotal);
System.out.println("Gracias por su devolucion, se le cobrara por daños en recepcion ;)");
}catch(Exception e){

    System.out.println("Porfavor, si vas a donar libros, ve a otra parte :b");

}

break;



//switch
}
//metodo
}
//clase
}