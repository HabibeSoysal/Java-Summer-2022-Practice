package day37_overriding;

public class EToyota extends DAraba {
    /* super.marka();
          eger hem overridden hem de overridding method'un calismasini istersek
          ilk satira super.marka() yazabiliriz
         */

    void marka(){
        System.out.println("markamiz Toyota");
    }
    void motor(){
        System.out.println("Toyota marka araçların Toyota marka motor kullanir");
    }
}
