// Crearemos un archivo para la entrada de 
// texto

class EntradaTexto{

     public static void main(String[] args){

         //Primero variables

         String nombre;

         System.out.println("Porfavor dime tu nombre");

         //Queremos obtener el nobre de la entrada estandar de la computadora
         //Primera forma para obtener un texto
         nombre = System.console().readLine();

         System.out.print("Hola " +nombre+ " Bienvenido Come champiñones");
     }
    }
