public class Helper {

    public static double harmonikHesap(int boyut){
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
}
