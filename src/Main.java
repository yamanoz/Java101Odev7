import java.util.Scanner;

public class Main {
    public static void main(String[] args){
/*
        Helper helper=new Helper();
        Scanner scan=new Scanner(System.in);
        System.out.print("Boyuta Giriniz :");
        int boyut=scan.nextInt();
        System.out.print("Harmonik Sayi :"+helper.harmonikHesap(boyut));

 */

        int[] dizi={15,12,788,1,-1,-778,2,0};

        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi :");
        int sayi=sc.nextInt();
        Helper helper=new Helper();
        helper.sayiBul(dizi,sayi);

    }
}
