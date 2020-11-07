import java.util.Scanner;

public class Calificaciones
{
    public static void main(String[] args){

Scanner s=new Scanner(System.in);
int calif[]=new int[11];
int suma = 0;
int mayor=0;
int menor=0;
float promedio;

System.out.println("Calificaciones");
System.out.println("Ingresa la calificacion  : ");
calif[0]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[1]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[2]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[3]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[4]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[5]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[6]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[7]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[8]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[9]=s.nextInt();

System.out.println("Ingresa la calificacion : ");
calif[10]=s.nextInt();

for(int i=0; i<calif.length; i++){
suma=calif[i];
}
promedio=(suma/calif.length);
System.out.println("El promedio del grupo es de : " + promedio);

for (int i = 0; i < calif.length; i++) {
    if(calif[i] > mayor=5) {
        mayor = calif[i];
        System.out.println("Aprobado");
    }
    if(calif[i] < menor=5) {
        menor = calif[i];
        System.out.println("Reprobado");
    }
}
System.out.println("El mayor valor es: "+ mayor);
System.out.println("El menor valor es: "+ menor);


    }




}