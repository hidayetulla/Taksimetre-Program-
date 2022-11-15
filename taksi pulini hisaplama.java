import java.util.Scanner;


public class pratik4 {
    public static void main(String[] args) {
        
       int km;
       double perkm=2.20, total=10;

       Scanner input = new Scanner(System.in);

       System.out.print("mesafeyi giriniz:");
       km = input.nextInt();

       total += perkm*km;
       total = total < 20 ? 20 : total;

       System.out.print("toplam ucret;" + total);


     /*   int km;
       double perkm=2.20, total, startprice=10;

       Scanner input = new Scanner(System.in);
       System.out.print("mesafeyi giriniz:");
       km = input.nextInt();

       total = perkm * km;
       total += startprice;

       total = total<20 ? 20 : total;

       System.out.print("toplam ucret:" + total);*/

      /*  int km;
       double perkm=2.20, total;

       Scanner input = new Scanner(System.in);

       System.out.print("mesafeyi giriniz:");
       km = input.nextInt();

       total = perkm*km;
       total += 10;

       System.out.print("toplam ucreti;" + total);*/
    }
}
