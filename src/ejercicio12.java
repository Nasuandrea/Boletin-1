import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        //Realiza un programa que dado un importe en euros nos indique el mínimo número de billetes y
        // la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
        int importe= 232;
        int sobrante=importe;
        int contador200=0;
        int contador100=0;
        int contador50=0;
        int contador20=0;
        int contador10=0;
        int contador5=0;


        for (int i = 0; i<(sobrante=5); i++) {
            if (importe>=200){
                sobrante = importe-200;
                contador200 ++;
                importe=sobrante;
            }
            if (importe>=100){
                sobrante= importe-100;
                contador100++;
                importe=sobrante;
            }
            if (importe>=50)
            {sobrante = importe -50;
                contador50++;
                importe=sobrante;
            }
            if (importe>=20){
                sobrante = importe - 20;
                contador20++;
                importe=sobrante;
            }
            if (importe>=10){
                sobrante = importe - 10;
                contador10++;
                importe=sobrante;
            }
            if (importe>=5){
                sobrante = importe - 5;
                contador5++;
            }
        }
        System.out.println(contador200+ " billetes de 200 ");
        System.out.println(+contador100+" billetes de 100 ");
        System.out.println(+contador50+" billetes de 50 ");
        System.out.println(+contador20+" billetes de 20 ");
        System.out.println(+contador10+" billetes de 10 ");
        System.out.println(+contador5+" billetes de 5 ");
        System.out.println("Sobran "+importe+" euros");

// Otra forma mas eficiente de hacerlo:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el importe: ");
        int importe2 = scanner.nextInt();

        int[] denominaciones = {200, 100, 50, 20, 10, 5};
        int[] contador = new int[6];

        for (int i = 0; i < denominaciones.length; i++) {
            while (importe2 >= denominaciones[i]) {
                importe2 -= denominaciones[i];
                contador[i]++;
            }
        }

        for (int i = 0; i < denominaciones.length; i++) {
            System.out.println(contador[i] + " billetes de " + denominaciones[i]);
        }

        System.out.println("Sobran " + importe + " euros");
        scanner.close();
    }
}
