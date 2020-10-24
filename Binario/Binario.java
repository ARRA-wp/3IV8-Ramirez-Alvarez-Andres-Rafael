import java.util.*;

public class Binario{
    public static void main (String[] args){
Scanner leer = new Scanner(System.in);
int decimal,modulo,aux;
String binario;
System.out.println("Ingresa el numero decimal");
decimal = leer.nextInt();
aux=decimal;
while (decimal > 0){
    modulo = (decimal*1%2);
    binario = modulo + binario;
    decimal = (decimal*1/2);
}
System.out.println("El Numero"+aux+"base 10 es"+binario+"en base dos :3");
    }

}