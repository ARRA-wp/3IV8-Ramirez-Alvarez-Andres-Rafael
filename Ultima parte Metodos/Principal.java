import java.util.Scanner;
class Principal{

    //al metodo principal de todo el programa
    public static void main(String[] args){
        //variables
        int opcion,letra;


        //ahora vamos a realizar los objetos de las clases y sus invocaciones

        Sueldo empleado = new Sueldo();
        Proveedor dinero = new Proveedor();
        Biblioteca objeto= new Biblioteca();
        //hasta aqui, los objetos con los que vamos a llamar los metodos
       Scanner entrada=new Scanner(System.in);

    do{

       System.out.println("Que desea hacer? ");
       System.out.println("1. Calcular su sueldo. ");
       System.out.println("1. Calcular lo existente con los proveedores. ");
       System.out.println("1. Vengo a la biblioteca. :3 ");
       opcion=entrada.nextInt();
        
       switch(opcion){
        case 1:
        //los metodos
       empleado.trabajadores();
        break;
        
        case 2:
        //metodo
        dinero.Clientes();
        break;
        
        case 3:
        objeto.Libros();
        break;

        }
        
        System.out.println("Desea hacer otra cosa mas? 1.Si  0.No ");
        letra=entrada.nextInt();
    }while(letra!=0);
        
        
        
        
    }




}