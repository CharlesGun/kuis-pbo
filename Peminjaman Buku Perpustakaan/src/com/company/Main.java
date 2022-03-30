package com.company;

import java.time.LocalDate;
import java.util.Scanner;

class Buku{
    String judul;
    String noSeri;
    boolean tersedia;
    LocalDate tanggalSekarang = LocalDate.now();
    LocalDate tanggalPinjam;
    LocalDate tanggalPengembalian;

    Buku(String judul, String noSeri, boolean tersedia){
        this.judul = judul;
        this.noSeri = noSeri;
        this.tersedia = tersedia;
    }

    void cekPeminjaman(boolean tersedia){
        if(tersedia){
            System.out.println("JUDUL = " + judul);
            System.out.println("NO SERI = " + noSeri);
            System.out.printf("Tanggal peminjaman = ");
            System.out.println(this.tanggalPinjam = tanggalSekarang);
            System.out.printf("Batas pengembalian = ");
            System.out.println(this.tanggalPengembalian = tanggalPinjam.plusWeeks(1));
            this.tersedia = false;
        }
        else{
            System.out.println("Buku sedang dalam masa peminjaman");
            System.out.println("Buku akan tersedia pada : " + tanggalPengembalian);
        }
    }

    void cekPengembalian(boolean tersedia){
        if(!tersedia){
            if(this.tanggalSekarang.isAfter(tanggalPengembalian)){
                System.out.println("ANDA DIKENAI DENDA KARENA TELAT MENGEMBALIKAN");
                System.out.println("Terima kasih telah mengembalikan");
            }
            else{
                System.out.println("Anda tepat waktu");
                System.out.println("Terima kasih telah mengembalikan");
            }
            this.tersedia = true;
        }
        else{
            System.out.println("Buku masih tersedia");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int pilihBuku;
        int kembalikanBuku;

        Buku buku1 = new Buku("MATEMATIKA ILMU YANG MENYENANGKAN", "001", true);
        Buku buku2 = new Buku("KIMIA SANGAT MUDAH", "002", true);
        Buku buku3 = new Buku("BIOLOGI MENUJU KEDOKTERAN", "003", true);
        Buku buku4 = new Buku("FISIKA FAVORITKU", "004", true);
        Buku buku5 = new Buku("BUKU TUTORIAL DANCE TIKTOK DIJAMIN FYP", "005", true);

        do {
            System.out.println("HAI SELAMAT DATANG DI APLIKASI PEMINJAMAN BUKU");
            System.out.println("Apa yang ingin Anda lakukan?");
            System.out.println("1. Meminjam");
            System.out.println("2. Mengembalikan");
            System.out.println("3. Exit");
            System.out.print("Pilihhan = ");
            pilihan = sc.nextInt();
            garis();
            switch (pilihan) {
                case 1:
                    System.out.println("Buku apa yang ingin Anda pinjam?");
                    System.out.println("1. " + buku1.judul);
                    System.out.println("2. " + buku2.judul);
                    System.out.println("3. " + buku3.judul);
                    System.out.println("4. " + buku4.judul);
                    System.out.println("5. " + buku5.judul);
                    System.out.print("Pilihan = ");
                    pilihBuku = sc.nextInt();
                    garis();
                    switch (pilihBuku) {
                        case 1:
                            buku1.cekPeminjaman(buku1.tersedia);
                            garis();
                            break;
                        case 2:
                            buku2.cekPeminjaman(buku2.tersedia);
                            garis();
                            break;
                        case 3:
                            buku3.cekPeminjaman(buku3.tersedia);
                            garis();
                            break;
                        case 4:
                            buku4.cekPeminjaman(buku4.tersedia);
                            garis();
                            break;
                        case 5:
                            buku5.cekPeminjaman(buku5.tersedia);
                            garis();
                            break;
                        default:
                            System.out.println("Salah input");
                            garis();
                    }
                    break;

                case 2:
                    System.out.println("Buku apa yang ingin Anda kembalikan?");
                    System.out.println("1. " + buku1.judul);
                    System.out.println("2. " + buku2.judul);
                    System.out.println("3. " + buku3.judul);
                    System.out.println("4. " + buku4.judul);
                    System.out.println("5. " + buku5.judul);
                    System.out.print("Pilihan = ");
                    kembalikanBuku = sc.nextInt();
                    garis();
                    switch (kembalikanBuku) {
                        case 1:
                            buku1.cekPengembalian(buku1.tersedia);
                            garis();
                            break;
                        case 2:
                            buku2.cekPengembalian(buku2.tersedia);
                            garis();
                            break;
                        case 3:
                            buku3.cekPengembalian(buku3.tersedia);
                            garis();
                            break;
                        case 4:
                            buku4.cekPengembalian(buku4.tersedia);
                            garis();
                            break;
                        case 5:
                            buku5.cekPengembalian(buku5.tersedia);
                            garis();
                            break;
                        default:
                            System.out.println("Salah input");
                            garis();
                    }
                    break;

                case 3:
                    System.exit(1);

                default:
                    System.out.println("Salah input");
                    garis();
            }
        }
        while (true);
    }
    private static void garis () {
        System.out.println("======================================================================");
    }
}
