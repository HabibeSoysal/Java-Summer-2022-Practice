package day38_exceptıon;

public class C02_Exception {
    public static void main(String[] args) {
        int a = 1000;
        int b = 500;
        int sayac = 0;

        while (sayac < 100) {
            /*
            try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
            islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
            turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
            Java'nin yapmasini istedigimiz islem
                    */
        }

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("payda 0 oldu dikkatli olmalısınız");
        }
        b--;
        sayac++;


    }
}
