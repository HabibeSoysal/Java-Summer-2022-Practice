package day33_encapsulatıon;

import day26_constructor.Ogretmen;

public class C04_OgretmenRunner {
    public static void main(String[] args) {
        C03_Ogretmen ogr1= new C03_Ogretmen();
        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());

        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
    }
}
