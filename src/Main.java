import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yaricap;
        double pi=3.14,yarimalan,alan,cevre;
        System.out.print("Daire yaricapini giriniz:");
        Scanner input = new Scanner(System.in);
        yaricap = input.nextInt();

        alan = pi*yaricap*yaricap;
        cevre = 2*pi*yaricap;

        //yarım daire alan
        yarimalan = (pi * (yaricap*yaricap) * 90) / 360;

        System.out.println("Daire Yaricap:"+yaricap);
        System.out.println("Daire Alani:"+alan);
        System.out.println("Daire cevre:"+cevre);
        System.out.println("Yarım Daire Alani:"+yarimalan);


    }

}
