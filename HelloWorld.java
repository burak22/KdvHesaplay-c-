import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdv = 0.18;
        System.out.print("Ürünün Ham Fiyatını Giriniz: ");
        double hamFyt = input.nextDouble();
        double kdvFyt = hamFyt * kdv + hamFyt;

        System.out.println("İşleniyor..\n");
        System.out.println("Ürünün Kdvli Fiyatı: " + kdvFyt);
        System.out.println("Kdv tutarı: " + (kdvFyt - hamFyt));

    }

}