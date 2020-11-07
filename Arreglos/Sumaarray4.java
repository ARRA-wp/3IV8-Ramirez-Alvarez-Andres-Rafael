import java.util.Scanner;

 class sumasrColumnasFilasMatriz {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         int matriz[][]= new int[10][10];
         int i,j,sumfila=0;
         int sumcolumna=0;
         int fila,columna;   
         int numaleatorio;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matriz[i][j]=numaleatorio=(int)Math.floor(Math.random()*(9-1+1)+1);
            }   
        }
        System.out.println("La matriz ingresada es ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }   
            System.out.println();
        }
        System.out.println("Que fila desea sumar ");
        fila=lector.nextInt();
        for(i=0;i<3;i++){
            sumfila=sumfila+matriz[fila-1][i];             
        }
        System.out.println("La suma de la fila "+fila+" es = "+sumfila);
        System.out.println("\nQue columna desea sumar ");
        columna=lector.nextInt();
        for(i=0;i<3;i++){
            sumcolumna=sumcolumna+matriz[i][columna-1];              
        }
        System.out.println("La suma de la columna "+columna+" es = "+sumcolumna);
    }
}


