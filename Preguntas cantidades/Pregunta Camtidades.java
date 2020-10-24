import java.util.*;

class Factura{

    

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opc,cantidad,opcion;
         String nombre,producto;
        double precio,total,impuesto,descuento,subt;
        do{
        System.out.println("Ingrese su nombre.");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad.");
        edad = entrada.nextLine();
        System.out.println("Ingrese la cantidad de productos.");
        opc = entrada.nextLine();

        while(opc!=2)

        System.out.println("Ingrese el producto");
        producto = entrada.nextInt();
        System.out.println("Ingrese el precio");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        cantidad = entrada.nextInt();

        subt=cantidad * precio;
        impuesto = subt * 0.15;
        if(edad >= 60 && edad =<90){
descuento=subt * 0.10;
        }
else{
        descuento=0;
}
total=(subt+impuesto)-descuento;
System.out.print("Su subtototal es de:"+subt);
System.out.print("Su impuesto es de:"+impuesto);
System.out.print("Su descuento es de:"+descuento);
System.out.print("Su total es de:"+total);

System.out.print("Desea ingresar otro producto?   1.Si       2.No");
opcion= entrada.nextInt();
        }while(opcion ==1);

    }
}