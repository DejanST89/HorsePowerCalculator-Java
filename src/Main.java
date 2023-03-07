import java.util.Scanner;

public class Main {
    public static void main(String[] args){



   Scanner s = new Scanner(System.in);
        System.out.print("Unesite snagu automobila u Kw:");//Program za izracunavanje konjske snage automobila

    int snagaKw = s.nextInt();
    double snagaKS = snagaKw * 2.90;

        System.out.println("snaga automobila u konjskim snagama"+snagaKS);
       System.out.println("Program je zavrsio svoj rad");

    }
}