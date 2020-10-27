import java.util.Scanner;

class Pokedex{

   //https://github.com/ARRA-wp/3IV8-Ramirez-Alvarez-Andres-Rafael

    public static void main(String[] args){

        
        Scanner entrada = new Scanner(System.in);

       
        int vida, defensa, id,fuerza, opcion;
        char letra;
        String ataqueprincipal,ataquesecundaio,nombre;
        
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija la pokemon que quiera visualizar :3: ");
        System.out.println("1.- Charmander ");
        System.out.println("2.- Bulbasaur ");
        System.out.println("3.- Squartle ");
        System.out.println("4.- Batalla Pokemon ");
        System.out.println("5.- Salir ");

        

        opcion = entrada.nextInt();

       

        switch (opcion) {
            case 1:
                
                System.out.println("Id:23");
                System.out.println("Defensa:24");
                System.out.println("Fuerza:34");
                System.out.println("vida:145 ps");
                System.out.println("Ataque principal:Fuego");
                System.out.println("Ataque secundario:Coletazo");
                
                
                break;

            case 2:
                System.out.println("Bulbasaur");
                System.out.println("Id:44");
                System.out.println("Defensa:43");
                System.out.println("Fuerza:21");
                System.out.println("vida:160 ps");
                System.out.println("Ataque principal: Planticida :3");
                System.out.println("Ataque secundario:Agarre de mollejas");
                break;

            case 3:
                System.out.println("Squartle");
                System.out.println("Id:16");
                System.out.println("Defensa:35");
                System.out.println("Fuerza:35");
                System.out.println("vida:155 ps");
                System.out.println("Ataque principal:Chapotaso");
                System.out.println("Ataque secundario:Mojadera");
                break;
            case 4:
            do{
                
                System.out.println("Elija la opcion deseada: ");
                System.out.println("1.- Pelear con un pokemon ");
                System.out.println("2.- Pelear con dos pokemones ");
                System.out.println("3.- Pelear con 3 pokemones ");
                System.out.println("4.- Salir ");
        
               
        
                opcion = entrada.nextInt();
        
             
        
                switch (opcion) {
                    case 1:
                        
                        System.out.println("Entrenador machoman te ha desafiado:");
                        System.out.println("Entrenador machoman te saca a bulbasaur:");
                        System.out.println("Tu sacas a:");
                        System.out.println("1. Bulbasaur");
                        System.out.println("2. Charmanger");
                        System.out.println("3. Squartle");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                            System.out.println("Bulbasaur, yo te eligo!!!:");
                            System.out.println("Entrenador machoman usa Rafaga polar en bulbasaur:");
                            System.out.println("Tu bulbasaur se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");

                            case 2:
                            System.out.println("Charmander, yo te eligo!!!:");
                    System.out.println("Entrenador machoman usa Rafaga polar en Charmanger:");
                    System.out.println("Tu Charmanger se siente frio, no se tapo bien hoy :c");
                    System.out.println("Pierde 35 ps");
                    System.out.println("Tu usas:");
                    System.out.println("Tu usas Fuego, al ser tipo plantas, los quemas, Fin. :3");

                    System.out.println("Charmanger - Enfermo - Ps:110");
                        break;
                            case 3:
                            System.out.println("Squartle, yo te eligo!!!:");
                    System.out.println("Entrenador machoman usa Rafaga polar en Squartle:");
                    System.out.println("Tu Squartle se siente frio, es poco efectivo :c");
                    System.out.println("Pierde 10 ps");
                    System.out.println("Tu usas:");
                    System.out.println("Tu usas chapotaso, al ser tipo plantas, lo absorbe");
                    System.out.println("Entrenador machoman usa absorver como popote  en Squartle:");
                    System.out.println("Tu Squartle es absorvido por esa bestia, ya no lo recuperaras :c");
                    System.out.println("Squartle - En un lugar mejor XD - Ps:0");
                        break;
        



                        }
                        
                        break;
        
                    case 2:
                    System.out.println("Entrenador machoman te ha desafiado:");
                        System.out.println("Entrenador machoman te saca a bulbasaur y charmanger:");
                        System.out.println("Tu sacas a:");
                        System.out.println("1. Bulbasaur y charmanger");
                        System.out.println("2. Charmanger y squirtle");
                        System.out.println("3. Squartle y bulbasaur");
                        
                        opcion = entrada.nextInt();
                        
                        switch(opcion){
                            case 1:
                            System.out.println("Bulbasaur y charmanger, yo los eligo!!!:");
                            System.out.println("Entrenador machoman usa Rafaga polar en bulbasaur:");
                            System.out.println("Tu bulbasaur se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");

                            System.out.println("Entrenador machoman usa volar en Bulbasaur:");
                    System.out.println("Tu Bulbasaur esta perfecto ;)");
                    System.out.println("Pierde 15 ps");
                    System.out.println("Tu usas:");
                    System.out.println("Tu usas Coletazo, es super efectivo");

                    System.out.println("Charmanger - Enfermo - Ps:110");
                    System.out.println("Bulbasaur - Cansado - Ps:0");
                            case 2:
                            System.out.println("Charmanger y Squirtle, yo los eligo!!!:");
                            System.out.println("Entrenador machoman usa Rafaga polar en bulbasaur:");
                            System.out.println("Tu charmanger se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");

                            System.out.println("Entrenador machoman usa volar en Squirtle:");
                    System.out.println("Tu Squirtle esta perfecto ;)");
                    System.out.println("Pierde 15 ps");
                    System.out.println("Tu usas:");
                    System.out.println("Tu usas Coletazo, es super efectivo");

                    System.out.println("Charmanger - Enfermo - Ps:110");
                    System.out.println("Bulbasaur - Cansado - Ps:0");
                        break;
                            case 3:
                            System.out.println("Bulbasaur y charmanger, yo los eligo!!!:");
                            System.out.println("Entrenador machoman usa Rafaga polar en bulbasaur:");
                            System.out.println("Tu bulbasaur se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");

                            System.out.println("Entrenador machoman usa volar en Bulbasaur:");
                    System.out.println("Tu Bulbasaur esta perfecto ;)");
                    System.out.println("Pierde 15 ps");
                    System.out.println("Tu usas:");
                    System.out.println("Tu usas Coletazo, es super efectivo");

                    System.out.println("Charmanger - Enfermo - Ps:110");
                    System.out.println("Bulbasaur - Cansado - Ps:0");
                        break;
        



                        }
        
                    case 3:
                    System.out.println("Bulbasaur y charmanger y Squirtle, yo los eligo!!!:");
                            System.out.println("Entrenador machoman usa Rafaga polar en bulbasaur:");
                            System.out.println("Tu bulbasaur se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");

                            System.out.println("Tu usas:");
                    System.out.println("Tu usas chapotaso, al ser tipo plantas, lo absorbe");
                    System.out.println("Entrenador machoman usa absorver como popote  en Squartle:");
                    System.out.println("Tu Squartle es absorvido por esa bestia, ya no lo recuperaras :c");
                    System.out.println("Squartle - En un lugar mejor XD - Ps:0");

                    
                            System.out.println("Entrenador machoman usa Rafaga polar en Charmanger:");
                            System.out.println("Tu charmanger se siente frio, pero contento");
                            System.out.println("Pierde 0 ps");
                            System.out.println("Tu usas:");
                            System.out.println("Tu usas planticida, al ser ambos plantas, se cansan, Fin. :3");

                            System.out.println("Bulbasaur - Exausto - Ps:0");
                            System.out.println("Charmanger - Enfermo - Ps:110");
                            System.out.println("Bulbasaur - Cansado - Ps:0");
                            break;
        
                    default:
                        System.out.println("Gracias por participar unu nwn/ ");
                
        
                    
                        
                        
                }
        
                System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
                
                letra = entrada.next().charAt(0);
    
        
            }while(letra == 's');
                 
            break;

            default:
                System.out.println("Gracias por participar ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        
        letra = entrada.next().charAt(0);

        

    }while(letra == 's');
        
        
        
    }
}
