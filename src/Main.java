import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Helper helper=new Helper();
        Scanner scan=new Scanner(System.in);
        System.out.print("Boyuta Giriniz :");
        int boyut=scan.nextInt();
        System.out.print("Harmonik Sayi :"+helper.harmonikHesap(boyut));
    }
}
