import java.util.Scanner;
class Prueba extends Gato{
//son 9 turnos, y quien haya completado al final de estos linea de 3, es el ganador

//primer metodo
Scanner entrada = new Scanner(System.in);
int j,i;
String jugador1,jugador2;
private int matriz[][] = new int [3][3];
public void caso1(){

try{
//imprimir todos los datos, 2 bucles for
System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz.length;j++){
System.out.println("Valor i="+i+"j="+j+" : "+ matriz[i][j]);

}
}

System.out.println("Ganador " + jugador1);
//un catch por si algun jugador quiere hacer lo que quiera :3
}catch(Exception e){
    System.out.println("Porfavor ingrese solo los valores posibles (ejemplo: 0,1,2) ");
}
}

//son 9 turnos, y quien haya completado al final de estos linea de 3, es el ganador

//segundo metodo
public void caso2(){
//lo mismo que el caso 1, pero al revez
try{
System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador1 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador1 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=1;

System.out.println("Ingresaras valores de 0,1,2 para la localizacion de tu resultado. :3");
System.out.println(jugador2 + " ingresa la columna donde colocaras X");
i=entrada.nextInt();
System.out.println(jugador2 + " ingresa la Fila donde colocaras X");
j=entrada.nextInt();
matriz[i][j]=2;
//impresor :3
for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz.length;j++){
System.out.println("Valor i="+i+"j="+j+" : "+ matriz[i][j]);

}
}
System.out.println("Ganador "+ jugador2 );
}catch(Exception e){

    System.out.println("Porfavor ingrese solo los valores posibles (ejemplo: 0,1,2) ");

}



}
}
