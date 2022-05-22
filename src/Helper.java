public class Helper {

   /* public static double harmonikHesap(int boyut){
        double sum=0.0;
        int[] dizi=new int[boyut];
        for(int i=1;i<=boyut;i++){
            dizi[i-1]=i;
        }
        for(int j=1;j<=boyut;j++){
            sum+=1.0/dizi[j-1];
        }
        return sum;

    }

    */


    public static void sayiBul(int[] arry, int sayi) {
        int mini=0, maxi=0;
        int sayac1=0,sayac2=0;
        int[] kucukdizi = new int[5];
        int[] buyukdizi = new int[3];
        for (int i = 0; i < arry.length; i++) {
            if (sayi < arry[i]) {

                buyukdizi[sayac1] = arry[i];
                sayac1++;
            } else {
                kucukdizi[sayac2] = arry[i];
                sayac2++;
            }

        }
        mini = buyukdizi[0];
        for (int j = 0; j < buyukdizi.length; j++) {

            if (mini > buyukdizi[j]) {
                mini = buyukdizi[j];
            }

        }
        maxi = kucukdizi[0];
        for (int k = 0; k < kucukdizi.length; k++) {

            if (maxi < kucukdizi[k]) {
                maxi = kucukdizi[k];
            }

        }

        System.out.println("Girilen Sayidan buyuk en yakin sayi :" + mini);
        System.out.println("Girilen Sayidan kucuk en yakin sayi :" + maxi);
    }
}