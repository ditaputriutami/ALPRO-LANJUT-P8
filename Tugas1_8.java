import java.util.Scanner;
public class Tugas1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jMhs = scanner.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jMatKul = scanner.nextInt();
        System.out.print("Masukkan Jumlah Ujian: ");
        int jUjian = scanner.nextInt();

        int[][][] nilaiMhs = new int[jMhs][jMatKul][jUjian];

        for (int i = 0; i < jMhs; i++) {
            System.out.println("\nMahasiswa Ke-" + (i + 1));
            for (int j = 0; j < jMatKul; j++) {
                System.out.println("Mata Kuliah " + (j + 1));
                for (int k = 0; k < jUjian; k++) {
                    System.out.print("Nilai Ujian " + (k + 1) + ": ");
                    nilaiMhs[i][j][k] = scanner.nextInt();
                }
            }
        }

        double[][] rataRataNilai = new double[jMhs][jMatKul];
        for (int i = 0; i < jMhs; i++) {
            for (int j = 0; j < jMatKul; j++) {
                int totalNilai = 0;
                for (int k = 0; k < jUjian; k++) {
                    totalNilai += nilaiMhs[i][j][k];
                }
                rataRataNilai[i][j] = (double) totalNilai / jUjian;
            }
        }

			System.out.println("\n====Rata-rata Nilai Mahasiswa====");
		    for (int i = 0; i < jMhs; i++) {
			    System.out.println("\nMahasiswa Ke-" + (i + 1) );
			    for (int j = 0; j < jMatKul; j++) {
			        System.out.println("Mata Kuliah " + (j + 1) + ": " + rataRataNilai[i][j]);
			    }
		    }
    }
}

