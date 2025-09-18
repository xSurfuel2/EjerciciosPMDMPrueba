package Ejercicio2;

import java.util.Scanner;

public class Sumatorio {

    public void SumaSuma ()
    {
        int suma=0;
        int num;
        int contador=0;
        double media = 0;

        Scanner teclado =new Scanner(System.in);

        while(suma<1000)
        {
            System.out.println("Introduce número: ");
            num = teclado.nextInt();
            suma=suma+num;
            contador++;
            media=suma/contador;
        }
        System.out.println("Total acumulado: "+suma);
        System.out.println("Números introducidos: "+contador);
        System.out.println("La media de los números introducidos es: "+ media);

    }

}
