package proses;

import data.Data;

import java.util.LinkedList;
import java.util.List;

public class Operasi {
    private  static List<Data> data = new LinkedList<Data>();

    public void simpan(Data d){
        data.add(d);
        System.out.println("Data Telah Ditambahkan");
    }

    public void ubah(Data d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.set(idx, d);
            System.out.println("Data Telah Diubah");
        }else
            System.out.println("Tidak Ditemukan Data Yang Cocok dengan id surat");
    }

    public void hapus(Data d){
        int idx = data.indexOf(d);
        if (idx >=0){
            data.remove(idx);
            System.out.println("Data Telah Dihapush");
        }else
            System.out.println("Tidak Ditemukan Data Yang Cocok dengan id surat");
    }

    public void  tampilData(){
        System.out.println("Data surat keluar\n");
        int i = 1;
        for (Data d : data){
            System.out.println("Data Ke- "+ i++);
            System.out.println("id              : "+ d.getId());
            System.out.println("no surat        : "+ d.getNo_surat());
            System.out.println("tanggal         : "+ d.getTanggal());
            System.out.println("penerima surat  : "+ d.getPenerima_surat());
            System.out.println("pengirim surat  : "+ d.getPengirim_surat());
            System.out.println("sifat surat     : "+ d.getSifat_surat());
            System.out.println("jenis surat     : "+ d.getJenis_surat());
            System.out.println("perihal         : "+ d.getPerihal());
            System.out.println("arsip           : "+d.getArsip());
            System.out.println("\n");
        }
    }
}
