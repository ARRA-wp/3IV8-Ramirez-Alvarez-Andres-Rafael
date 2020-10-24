import java.util.*;


public class Entradadatosusuario{



    //Metodo principal
    public static void main(String[ ] args){


Scanner Entrada = new Scanner(Sistem.in);

//Variable
String nombre,respuesta;
int edad,Total,descuento;
Float precio;

System.out.println("Escribe tu nombre");
nombre = entrada.nextLine();
System.out.println("Escribe tu Edad");
edad = entrada.nextInt();
System.out.println("Escribe el monto total");
precio = entada.nextFloat();

If(edad>=65){

descuento=precio*.40;
System.out.println("Tu descuento es de:"+descuento);
Total=precio-descuento;
System.out.println("Tu Total es de:"+Total);

If(edad<=21){

System.out.println("Tus padres son socios?      1.Si 2.No");
respuesta = entrada.nextString();

switch (respuesta) {
    case 1:
        

        descuento=precio*.45;
System.out.println("Tu descuento es de:"+descuento);
Total=precio-descuento;
System.out.println("Tu Total es de:"+Total);

        break;

    case 2:
    escuento=precio*.25;
    System.out.println("Tu descuento es de:"+descuento);
    Total=precio-descuento;
    System.out.println("Tu Total es de:"+Total);

        break;


    else:
        System.out.println("Gracias por su compra :3 ");


    
        
        
}
}
}


   
    }
    

}