package TugasAkhir;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class tugasAkhir {

    // Program sortir data stok gudang
    public static void main(String[] args) {
        int ulangi = 0;
        String konfirmasi;
        ucapanSelamat();
        do {
            kategoriBarang();
            konfirmasi = JOptionPane.showInputDialog(null, "Mengecek lagi? (iya/tidak)");
            if (konfirmasi.equalsIgnoreCase("Tidak")) {
                ulangi = 1;
            }

        } while (ulangi == 0);
        JOptionPane.showMessageDialog(null, "terimakasih");

    }

    private static void ucapanSelamat() {
        String nama;
        nama = JOptionPane.showInputDialog(null, "Masukkan nama anda: ");
        JOptionPane.showMessageDialog(null, "== Selamat datang di gudang 1, " + nama + " ==");
    }

    private static void kategoriBarang() {
        String tipeBarang;
        String pilihbarang;
        int kembali = 0;
        String melanjutkan;
        tipeBarang = JOptionPane.showInputDialog(null,
                "Pilih kategori barang anda: " + "\n 1. Part Motor" + "\n 2. Part Mobil" + "\n 3. Part kapal");
        switch (tipeBarang) {
            case "1":

                do {
                    String arrayMotor[] = {
                            "Busi",
                            "Aki",
                            "Ban",
                    };
                    pilihbarang = JOptionPane.showInputDialog(null,
                            Arrays.toString(arrayMotor) + "\n pilih barang anda: ");

                    if (pilihbarang.equalsIgnoreCase("busi")) {
                        JOptionPane.showMessageDialog(null, "Harga busi 15.000/buah \nstok: 160");
                    } else if (pilihbarang.equalsIgnoreCase("aki")) {
                        JOptionPane.showMessageDialog(null, "Harga aki 60.000/buah \nstok: 87");
                    } else if (pilihbarang.equalsIgnoreCase("ban")) {
                        JOptionPane.showMessageDialog(null, "Harga ban 100.000/buah \nstok: 24");
                    }
                    melanjutkan = JOptionPane.showInputDialog(null, "ulangi? (iya/tidak)");
                    if (melanjutkan.equalsIgnoreCase("tidak")) {
                        kembali++;
                    }
                } while (kembali == 0);
                break;
            case "2":
                do {
                    String arrayMobil[] = {
                            "Busi",
                            "Aki",
                            "Ban",
                    };
                    pilihbarang = JOptionPane.showInputDialog(null,
                            Arrays.toString(arrayMobil) + "\n pilih barang anda: ");

                    if (pilihbarang.equalsIgnoreCase("busi")) {
                        JOptionPane.showMessageDialog(null, "Harga busi 67.000/buah \nstok: 170");
                    } else if (pilihbarang.equalsIgnoreCase("aki")) {
                        JOptionPane.showMessageDialog(null, "Harga aki 125.000/buah \nstok: 60");
                    } else if (pilihbarang.equalsIgnoreCase("ban")) {
                        JOptionPane.showMessageDialog(null, "Harga ban 1.200.000/buah \nstok: 25");
                    }
                    melanjutkan = JOptionPane.showInputDialog(null, "ulangi? (iya/tidak)");
                    if (melanjutkan.equalsIgnoreCase("tidak")) {
                        kembali++;
                    }
                } while (kembali == 0);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Belum tersedia");
                break;
        }

    }

    // program ini InsyaAllah akan saya tambahkan lagi di dalam GitHub...
}
