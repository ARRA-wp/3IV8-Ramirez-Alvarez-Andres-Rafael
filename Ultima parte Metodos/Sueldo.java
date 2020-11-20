import java.util.Scanner;

public class Sueldo{
    //variables
String nombre;
int ID,sueldo_quincenal,horas_extras,extra,total,grande,respuesta,puesto;
double SGM,infonavit,ISR,total1;

Scanner entrada=new Scanner(System.in);

public void trabajadores(){

System.out.println("Cual es su ID?"); 
ID=entrada.nextInt(); 

System.out.println("Cual es tu nombre?");
nombre=entrada.nextLine();

System.out.println("Cual es tu Puesto en la empresa? 1.Empleado  0.Supervisor");
puesto=entrada.nextInt();

if(puesto!=0){

System.out.println("Cuanto ganas quincenalmente?");
sueldo_quincenal=entrada.nextInt();

System.out.println("Trabajaste horas extra? 1.Si 0.No");
horas_extras=entrada.nextInt();

if(horas_extras!=0){

    System.out.println("Fueron horas extras: 1.Diurnas o 0.nocturnas?");
    respuesta=entrada.nextInt();

    if(respuesta!=0){

    System.out.println("Cuantas horas fueron?");
    horas_extras=entrada.nextInt();

    extra=horas_extras*50;
    total=extra+sueldo_quincenal;

    System.out.println("Se te pasara a pagar: "+total);
    

    }else{

        System.out.println("Cuantas horas fueron?");
        horas_extras=entrada.nextInt();

        extra = horas_extras *  60;
        total = extra + sueldo_quincenal;

        System.out.println("Se te pasara a pagar " + total + " $ ");

    }

}else{

System.out.println("Se te pagara : " + sueldo_quincenal + " $ ");

}

}else{
    System.out.println("Cuanto ganas quincenalmente?");
    sueldo_quincenal=entrada.nextInt();
    infonavit = sueldo_quincenal * .20;
    SGM = sueldo_quincenal * .10;
    ISR = sueldo_quincenal * .16;
    total1 = sueldo_quincenal - infonavit - SGM - ISR;

    System.out.println("Se te pagara : " + total1 + " $ ");
    
    
}

}

}