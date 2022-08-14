import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        double armut, elma, domat, muz, patli;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac kilo armut aldiniz ? :");
        armut = input.nextDouble();
        System.out.print("Kac kilo Elma aldiniz ? :");
        elma = input.nextDouble();
        System.out.print("Kac kilo Domates aldiniz ? :");
        domat = input.nextDouble();
        System.out.print("Kac kilo Muz aldiniz ? :");
        muz = input.nextDouble();
        System.out.print("Kac kilo Patlican aldiniz ? :");
        patli = input.nextDouble();



        double farmut = armut * 2.14;
        double felma = elma * 3.67;
        double fdomat = domat * 1.11;
        double fmuz = muz * 0.95;
        double fpatli = patli * 5.00;
        double tutar = (farmut + felma + fdomat + fmuz + fpatli);


        System.out.println("Toplam Tutar : "+tutar " TL" );
        System.out.println("Alisverisinizde bizi tercih ettiginiz icin tesekkur eder Saglikli gunler dileriz");






        }





    }

