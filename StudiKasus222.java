package PraktikumDaspro22;
// StudiKasus222.java
import java.util.Scanner;

public class StudiKasus222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int dokumen, peringkat, statusPkm;

        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim();

        // Cabang 1: perlombaan (BELMAWA, BAKORMA, atau Mandiri)
        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {            // tingkat 2: juara 1, 2, atau 3
                if (dokumen == 4) {                             // tingkat 3: dokumen lengkap
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkat + ").");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        // Cabang 2: Program Kreativitas Mahasiswa (PKM)
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen  : ");
            dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPkm = sc.nextInt();

            if (statusPkm == 1) {                               // tingkat 2: lolos pendanaan
                if (dokumen == 4) {                             // tingkat 3: dokumen lengkap
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        // Cabang 3: Lainnya
        } else if (jenis.equalsIgnoreCase("Lainnya")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");

        // Jenis kegiatan di luar pilihan
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        sc.close();
    }
}
