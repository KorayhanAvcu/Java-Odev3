import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kenari Giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci Kenari Giriniz : ");
        b = inp.nextInt();
        System.out.print("Ucuncu Kenari Giriniz : ");
        c = inp.nextInt();
        double u = (a+b+c)/2.0;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Alan : "+alan);
    }
}