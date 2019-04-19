package data;

public class Data {
    private String id;
    private String no_surat;
    private String tanggal;
    private String penerima_surat;
    private String pengirim_surat;
    private String sifat_surat;
    private String jenis_surat;
    private String perihal;
    private String arsip;

    public Data(String id, String no_surat, String tanggal, String penerima_surat, String pengirim_surat, String sifat_surat, String jenis_surat, String perihal, String arsip) {
        this.id = id;
        this.no_surat = no_surat;
        this.tanggal = tanggal;
        this.penerima_surat = penerima_surat;
        this.pengirim_surat = pengirim_surat;
        this.sifat_surat = sifat_surat;
        this.jenis_surat = jenis_surat;
        this.perihal = perihal;
        this.arsip = arsip;
    }

    @Override
    public boolean equals(Object o) {
        Data dt = (Data) o;
        return id.equals(dt.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo_surat() {
        return no_surat;
    }

    public void setNo_surat(String no_surat) {
        this.no_surat = no_surat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPenerima_surat() {
        return penerima_surat;
    }

    public void setPenerima_surat(String penerima_surat) {
        this.penerima_surat = penerima_surat;
    }

    public String getPengirim_surat() {
        return pengirim_surat;
    }

    public void setPengirim_surat(String pengirim_surat) {
        this.pengirim_surat = pengirim_surat;
    }

    public String getSifat_surat() {
        return sifat_surat;
    }

    public void setSifat_surat(String sifat_surat) {
        this.sifat_surat = sifat_surat;
    }

    public String getJenis_surat() {
        return jenis_surat;
    }

    public void setJenis_surat(String jenis_surat) {
        this.jenis_surat = jenis_surat;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public String getArsip() {
        return arsip;
    }

    public void setArsip(String arsip) {
        this.arsip = arsip;
    }
}