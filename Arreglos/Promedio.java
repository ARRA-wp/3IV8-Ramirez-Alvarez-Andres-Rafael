public void Promedio(){
    Scanner entrada = new Scanner(System.in);

    //variables
    int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;
    int promedio;

    System.out.println("Ingresa el primer numero ");
    val1 = entrada.nextInt();
    System.out.println("Ingresa el segundo numero ");
    val2 = entrada.nextInt();
    System.out.println("Ingresa el tercero numero ");
    val3 = entrada.nextInt();
    System.out.println("Ingresa el cuarto numero");
    val4 = entrada.nextInt();
    System.out.println("Ingresa el quinto numero ");
    val5 = entrada.nextInt();
    System.out.println("Ingresa el sexto numero");
    val6 = entrada.nextInt();
    System.out.println("Ingresa el sexto numero ");
    val7 = entrada.nextInt();
    System.out.println("Ingresa el septimo numero");
    val8 = entrada.nextInt();
    System.out.println("Ingresa el octavo numero");
    val9 = entrada.nextInt();
    System.out.println("Ingresa el noveno numero");
    val10 = entrada.nextInt();

    promedio = (val1+val2+val3+val4+val5+val6+val7+val8+val9+val10)/10

   



    //ahora vamos a imprimir el resultado
    System.out.println("El promedio es: "+ promedio);
    
}