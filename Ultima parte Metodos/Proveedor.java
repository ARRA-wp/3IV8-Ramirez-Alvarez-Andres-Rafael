import java.util.Scanner;

public class Proveedor {
    //objeto, para que me reciba los datos del teclado, o del usuario.
    Scanner entrada = new Scanner(System.in);
//variables
String nombre_cliente;
int i,mayor,menor;
int suma=0;
double promedio;
String[] producto = new String[11];
int[] costo = new int[11];
int[] cantidad = new int[11];
/*
 NOMBRE_CLIENTE (CADENA), PRODUCTO(CADENA ARREGLO DE 10
ELEMENTOS), COSTO (ENTERO ARREGLO DE  10
ELEMENTOS) CANTIDAD DE PRODUCTO EXISTENTE(ENTERO ARREGLO DE 10 ELEMEMENTOS), 
EL PROGRMA DEBE OBTENER LA SUMA TOTAL DE COSTOS, 
EL COSTO MAYOR Y EL COSTO MENOR, EL COSTO PROMEDIO DE LOS
PRODUCTOS,EL COSTO TOTAL DE PRODUCTO *LA CANTIDAD EXISTENTE. 
DESPLEGAR EL PANTALLA EL NOMBRE DEL PROVEEDOR LOS PRODUCTOS  
LA CANTIDAD EXISTENTE Y EL COSTO DE CADA UNO DE ELLOS. 

*/
public void Clientes(){
//para los productos
    for(i=0; i<producto.length; i++){

        System.out.println("Introduzca los productos: "+ i+1);
        producto[i] = entrada.nextLine();
    }

    for(i=0; i<producto.length; i++){

        System.out.println(producto[i]);
    }
    //Costos
    for(i=0; i<costo.length; i++){

        System.out.println("Introduzca los costos: " + i+1);
        costo[i] = entrada.nextInt();
    }

    for(i=0; i<costo.length; i++){

        System.out.println(costo[i]);
        suma = suma + costo[i] ;
        System.out.println("La suma de los costos es de: "+ suma );
        //sacar promedio de los productos  :,3
         
        promedio = suma/costo.length;
       System.out.println("El promedio del costo de sus productos es de" + promedio);

        //Sacar mayor y el menor.
        mayor = menor = costo [0];
        
        for (int i = 0; i < costo.length; i++) {
            if(costo[i] > mayor) {
                mayor = costo[i];
            }
            if(costo[i]<menor) {
                menor = costo[i];
            }
        }
        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);

    }
       
    
    // Cantidad
       for(i=0; i<cantidad.length; i++){

        System.out.println("Introduzca las cantidades: "+ i+1);
        cantidad[i] = entrada.nextInt();
    }

    for(i=0; i<cantidad.length; i++){

        System.out.println(cantidad[i]);
    }


}

}