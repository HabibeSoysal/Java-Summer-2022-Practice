package day21_Arrays;

import java.util.Arrays;

public class C05inçalışması {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

  String[]sinifList={"Ali","Veli","Ayse","Ahmet"}  ;
  String eklenecekIsim="Habibe Soysal";
  sinifList=elemanEkleSinifListesi(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));

    }

    private static String[] elemanEkleSinifListesi(String[] sinifList, String eklenecekIsim) {
   String[]yeniSinifList=new String[sinifList.length+1];
        for (int i = 0; i < sinifList.length ; i++) {
            yeniSinifList[i]=sinifList[i];
        }

   yeniSinifList[yeniSinifList.length-1]=eklenecekIsim;
        return yeniSinifList;


    }
}
