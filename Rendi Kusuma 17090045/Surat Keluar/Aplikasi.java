import data.Data;
import proses.Operasi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplikasi {
    private static Scanner scn;
    private static Operasi op;

    public static void main(String args[]){
        int m;
        scn = new Scanner(System.in);
        op = new Operasi();


        do {
            menu();
            try {
                scn = new Scanner(System.in);
                m = scn.nextInt();
                pilih(m);
            }catch (InputMismatchException e){
                System.out.println("Masukan pilihan 1 - 5");
                m=0;
            }
        }while (m !=5);
    }
    private static void pilih(int p){
        if (p==1) {
            tambah();
        }
        else if (p==2){
            ubah();

        }
        else if (p==3){
            hapus();

        }
        else if (p==4){
            op.tampilData();

        }
    }
    private static void ubah(){
        scn = new Scanner(System.in);
        String id, no_surat, tanggal, penerima_surat, pengirim_surat, sifat_surat, jenis_surat, perihal, arsip;



            System.out.println("Ubah Data\n");
            System.out.print("id : ");
            id = scn.nextLine();
            System.out.print("no surat              : ");
            no_surat = scn.nextLine();
            System.out.print("tanggal               : ");
            tanggal = scn.nextLine();
            System.out.print("penerima surat        : ");
            penerima_surat = scn.nextLine();
            System.out.print("pengirim surat        : ");
            pengirim_surat = scn.nextLine();
            System.out.print("sifat surat           : ");
            sifat_surat = scn.nextLine();
            System.out.print("jenis surat           : ");
            jenis_surat = scn.nextLine();
            System.out.print("perihal               : ");
            perihal = scn.nextLine();
            System.out.println("arsip               : ");
            arsip = scn.nextLine();
            op.ubah(new Data(id, no_surat, tanggal, penerima_surat, pengirim_surat, sifat_surat, jenis_surat, perihal, arsip));


    }
    private static void hapus(){
        scn = new Scanner(System.in);
        String id, no_surat = null, tanggal = null, penerima_surat = null, pengirim_surat = null, sifat_surat = null, jenis_surat = null, perihal = null, arsip = null;

        System.out.println("Hapus Data\n");
        System.out.print("id : ");
        id = scn.nextLine();
        op.hapus(new Data(id, no_surat, tanggal, penerima_surat, pengirim_surat, sifat_surat, jenis_surat, perihal, arsip));
    }

    private static void tambah(){
        scn = new Scanner(System.in);
        String id, no_surat, tanggal, penerima_surat, pengirim_surat, sifat_surat, jenis_surat, perihal, arsip;

        System.out.println("Ubah Data\n");
        System.out.print("id : ");
        id = scn.nextLine();
        System.out.print("no surat              : ");
        no_surat = scn.nextLine();
        System.out.print("tanggal               : ");
        tanggal = scn.nextLine();
        System.out.print("penerima surat        : ");
        penerima_surat = scn.nextLine();
        System.out.print("pengirim surat        : ");
        pengirim_surat = scn.nextLine();
        System.out.print("sifat surat           : ");
        sifat_surat = scn.nextLine();
        System.out.print("jenis surat           : ");
        jenis_surat = scn.nextLine();
        System.out.print("perihal               : ");
        perihal = scn.nextLine();
        System.out.println("arsip               : ");
        arsip = scn.nextLine();
        op.simpan(new Data(id, no_surat, tanggal, penerima_surat, pengirim_surat, sifat_surat, jenis_surat, perihal, arsip));

    }

    private static void menu(){
        System.out.println("Aplikasi surat keluar\n");
        System.out.println("Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar\n");
        System.out.print("Pilih Menu >");

    }
}
