/*
 * Ad Soyad: ŞEYMA NUR KATAR
 * Ogrenci No: 250541070
 * Tarih: 06.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan dairenin yaricapini alir ve
 * daire ve kure ile ilgili matematiksel hesaplamalari yaparak ekrana yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        
        // Sabit tanimlama
        final double PI = 3.14159;

        // Scanner olusturma
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        
        // Yarıçapı kullanıcıdan alma
        double r = input.nextDouble();

        // Hesaplamalar
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;

        System.out.println("\nSONUCLAR:");
        System.out.println("----------");

        // Formatli cikti
        System.out.printf("Daire Alani        : %.2f cm²\n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm\n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm\n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm³\n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²\n", kureYuzeyAlani);

        // Scanner kapatma
        input.close();
    }
}

