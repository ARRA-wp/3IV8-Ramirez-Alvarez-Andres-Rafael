import java.util.Scanner;

class 3IV8RamirezAlvarez{

    /*
    vamos a crear un programa que se encargue de realizar
    un menu en el cual se pueda elegir entre calcular
    el area o el perimetro de las siguientes figuras
    triangulo
    cuadrado
    circulo
    actualizacion, ahora quiero que se repita todo el programa
    para volver a calcular otra area,
    como trabajo
    ustedes deben agregar las opciones del perimetro
    y dos figuras mas
    rectangulo pentagono
    */

    public static void main(String[] args){

        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base,base,suma1, suma2, resta1, resta2, multi1, multi2,divi1,divi2,opcion, altura, altura,nombre, numeros, opcion,edad,Total,descuento,decimal,modulo,opc,aux;
        char letra;
        String nombre,respuesta,binario;
            Float precio,grados,gradosF,aux;
        double resultado,precio,total,impuesto,descuento,subt;
        
        

        
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Tienda departamental y asociados ");
        System.out.println("2.- Cambiar entero a binario ");
        System.out.println("3.- Temperatura ");
        System.out.println("4.- Contar Numeros ");
        System.out.println("5.- Factura ");
        System.out.println("6.- Figuras clasicas ");
        System.out.println("7.- Calcular el area de un cuadrado ");
        System.out.println("8.- Calcular el area de un triangulo ");
        System.out.println("9.- Calcular el area de un circulo ");
        System.out.println("10.- Calcular el area de un cuadrado ");
        System.out.println("11.- Calcular el area de un triangulo ");
        System.out.println("12.- Calcular el area de un triangulo ");
        System.out.println("13.- Calculadora ");
        System.out.println("14.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
            
            
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
                break;












            case 2:
            
            System.out.println("Ingresa el numero decimal");
            decimal = leer.nextInt();
            aux=decimal;
            while (decimal > 0){
                modulo = (decimal*1%2);
                binario = modulo + binario;
                decimal = (decimal*1/2);
            }
            System.out.println("El Numero"+aux+"base 10 es"+binario+"en base dos :3");
                break;











            case 3:
            
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
              
               
                break;

                case 4:
                String nombre,letras;


System.out.println("Introduce el texto");
letras=Entrada.nextLine();
 for(int x=0; x< letras.lenght(); x++)
If (Character.isDigit(letras.charAt(x)));
{
numeros++;

    if(letras.charAt(x) != (char)32)
    letras ++;
}
System.out.println("Texto tiene"+ letras+ "letras");
System.out.println("Texto tiene"+ numeros+ "numeros");
break;


case 5:

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

break;


case 6:

    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area de un cuadrado ");
        System.out.println("2.- Calcular el area de un triangulo ");
        System.out.println("3.- Calcular el area de un circulo ");
        System.out.println("4.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;

                System.out.println("El area del triangulo es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                System.out.println("El area del circulo es de: "+resultado);
                break;

            default:
                System.out.println("Gracias por participar unu nwn/ ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');
        

break;
case 7:

break;
case 8:

break;
case 9:

break;
case 10:

break;
case 11:

break;
case 12:

break;
case 13:

    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Sumar ");
        System.out.println("2.- Restar ");
        System.out.println("3.- Multiplicar ");
        System.out.println("4.- Dividir ");
        System.out.println("5.- Salir ");

        //asignar la opcion

        opcion = entrada.nextInt();

        //segun, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingresa el primer valor");
                suma1 = entrada.nextInt();
                System.out.println("Ingresa el segundo valor");
                suma2 = entrada.nextInt();

                resultado = suma1+suma2;

                System.out.println("La suma fue de: "+resultado);
                break;

            case 2:
            System.out.println("Ingresa el primer valor");
            resta1 = entrada.nextInt();
            System.out.println("Ingresa el segundo valor");
            resta2 = entrada.nextInt();

            resultado = resta1-resta2;

            System.out.println("El residuo fue de: "+resultado);
                
                break;

            case 3:
            System.out.println("Ingresa el primer valor a multiplicar");
            multi1 = entrada.nextInt();
            System.out.println("Ingresa el segundo valor a multiplicar");
            multi2 = entrada.nextInt();

            resultado = multi1*multi2;

            System.out.println("El producto fue de: "+resultado);
                break;
                case 4:
                System.out.println("Ingresa el dividendo");
            divi1 = entrada.nextInt();
            System.out.println("Ingresa el divisor");
            divi2 = entrada.nextInt();

            resultado = divi1/divi2;

            System.out.println("El cociente fue de: "+resultado);
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
        

break;












            default:
                System.out.println("Gracias por participar unu nwn/ ");
        

            
                
                
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