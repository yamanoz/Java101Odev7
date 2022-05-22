import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        //harmonik sayi hesaplama programi
        Helper helper=new Helper();
        Scanner scan=new Scanner(System.in);
        System.out.print("Boyuta Giriniz :");
        int boyut=scan.nextInt();
        System.out.print("Harmonik Sayi :"+helper.harmonikHesap(boyut));

         //Odev7-Girilen sayıdan kucuk en yakın sayi bulan program
        int[] dizi={15,12,788,1,-1,-778,2,0};
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi :");
        int sayi=sc.nextInt();
        Helper helper=new Helper();
        helper.sayiBul(dizi,sayi);

 */


        //Cok boyutlu dizilerler A harfi olusturm
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 ||i==6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }

        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    }
