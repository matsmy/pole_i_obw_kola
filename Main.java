import java.util.Scanner;
import java.lang.Math;
class Main
  {
  public static void main(String[] args)
    {
    System.out.println("OBLICZANIE OBWODU I POLA KOLA\nPODAJ PROMIEN KOLA");
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    int potega = 2;
    System.out.println("Podales promien rowny " + r);
    double rkwadrat = Math.pow(r, potega);
    double pole = 3.14 * rkwadrat;
    System.out.println("Pole jest rowne " + pole);

    double obwod = 3.14 * 2 * r;
    System.out.println("Obwod jest rowny " + obwod);
    }
}