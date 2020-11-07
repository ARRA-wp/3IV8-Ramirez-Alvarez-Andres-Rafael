
int mayor, menor;
        mayor = menor = calif[0];
       
        for (int i = 0; i < calif.length; i++) {
            if(calif[i] > mayor) {
                mayor = calif[i];
            }
            if(calif[i]<menor) {
                menor = calif[i];
            }
        }
        System.out.println("El mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);
