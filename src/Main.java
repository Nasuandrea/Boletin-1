import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int t;
        System.out.println("Dime la cantidad de segundos que quieres convertir");
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int horas, minutos, segundos;
        horas = t / 3600;
        minutos = (t % 3600) / 60;
        segundos = t % 60;
        System.out.println(t + " segundos son: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");


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
                importe=sobrante;
            }
        }
        System.out.println(contador200+ " billetes de 200 ");
        System.out.println(+contador100 +"billetes de 100 ");
        System.out.println(+contador50+" billetes de 50 ");
        System.out.println(+contador20+" billetes de 20 ");
        System.out.println(+contador10+" billetes de 10 ");
        System.out.println(+contador5+" billetes de 5 ");
        System.out.println("Sobran "+sobrante+" euros");
    }
}