import java.util.Arrays;
import java.util.Random;
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

/*
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

 */
        /*
        //Bir sayi dizisinde tekrar eden çift sayıları bulan program
        int[] dizi = {2, 3, 4, 5, 6, 7, 8, 8, 3, 6, 2, 23};
        int[] doublenumber = new int[dizi.length];
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    if (!isFind(doublenumber, dizi[i])) {
                        doublenumber[sayac] = dizi[i];
                        sayac++;
                    }
                }
            }
        }

        for (int value : doublenumber) {
            if(value!=0)
            System.out.print(value + " ");
        }
    }

    public static boolean isFind(int[] dizi, int sayi) {
        for (int i = 0; i < dizi.length; i++) {
            if (sayi == dizi[i]) {
                return true;

            }

        }
        return false;
    }

         */

  /*

   //Dışarıdan girilen bir diziyi sıralama algoritması
     Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutu :");
        int boyut=scanner.nextInt();
        int[] dizi=new int[boyut];
        System.out.println("Dizinin elemanlarina giriniz :");
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". Eleman :");
            dizi[i]=scanner.nextInt();
        }
        selectionSort(dizi);
        }




   public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print("Sıralı :");
        for(int j=0;j<arr.length;j++) {

            System.out.print(arr[j]+" ");
        }

    }

   */
/*

//Dizideki elemanların frekansı
        int[] dizi={10,20,20,10,10,20,5,20};
        int tekrarSayisi=1,farkliDeger=0;
        Arrays.sort(dizi);
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]!=farkliDeger){
                for(int j=0;j<dizi.length;j++){
                    if((i!=j)&&dizi[i]==dizi[j]){
                        tekrarSayisi++;
                        farkliDeger=dizi[i];
                    }


                }
                System.out.println(dizi[i]+" sayisi "+tekrarSayisi+" kere tekrar edildi.");
                tekrarSayisi=1;
            }
        }


 */
        /*
        //bir dizinin tranpozunu bulan program
        int[][] dizi=new int[2][3];
        int[][] trandizi=new int[3][2];

        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
                dizi[i][j]= (int) (Math.random()*10);
            }
        }
        System.out.println("Matris :");

        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[0].length;j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpozu :");

        for(int i=0;i<trandizi.length;i++){
            for(int j=0;j<trandizi[0].length;j++){
                System.out.print(dizi[j][i]+" ");
            }
            System.out.println("");
        }





         */


        //sayi tahmin oyunu



                int number = (int) Math.random()*100;
                //int number = (int) (Math.random() * 100);

                Scanner scan = new Scanner(System.in);
                int hak = 0;
                int selected;
                int[] wrong = new int[5];
                boolean isWin = false;
                boolean isWrong = false;

                System.out.println(number);
                while (hak < 5) {
                    System.out.print("Lütfen tahmininizi giriniz : ");
                    selected = scan.nextInt();

                    if (selected < 0 || selected > 99) {
                        System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                        if (isWrong) {
                            hak++;
                            System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - hak));
                        } else {
                            isWrong = true;
                            System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                        }
                        continue;
                    }

                    if (selected == number) {
                        System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                        isWin = true;
                        break;
                    } else {
                        System.out.println("Hatalı bir sayı girdiniz !");
                        if (selected > number) {
                            System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                        } else {
                            System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                        }

                        wrong[hak++] = selected;
                        System.out.println("Kalan hakkı : " + (5 - hak));
                    }
                }

                if (!isWin) {
                    System.out.println("Kaybettiniz ! ");
                    if (!isWrong) {
                        System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                    }
                }

            }
        }



