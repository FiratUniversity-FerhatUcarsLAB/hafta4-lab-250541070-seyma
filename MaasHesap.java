/*
 * Ad Soyad: ŞEYMA NUR KATAR
 * Ogrenci No: 250541070
 * Tarih: 06.11.2025
 * Aciklama: Gorev 3 - Maas Hesaplama
 * 
 * Bu program kullanicidan brut maasi alir,
 * vergi ve zam hesaplayarak net maasi ekrana yazdirir.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAS HESAPLAYICI ===");
        System.out.print("Brut maasi girin (TL): ");

        double brutMaas = input.nextDouble();

        // Hesaplamalar
        double vergi = brutMaas * 0.20;      // %20 vergi
        double zam = brutMaas * 0.10;        // %10 zam
        double netMaas = brutMaas - vergi + zam;

        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Brut Maas : %.2f TL\n", brutMaas);
        System.out.printf("Vergi     : %.2f TL\n", vergi);
        System.out.printf("Zam       : %.2f TL\n", zam);
        System.out.printf("Net Maas  : %.2f TL\n", netMaas);

        input.close();
    }
}

