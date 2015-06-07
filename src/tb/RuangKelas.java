/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package TB;
/**
*
* @author flora fauna
*/
public abstract class RuangKelas {
// deklarasi variabel identitas ruangkelas
 String namaruang;
 String lokasiruang;
 String fakultas;

//deklarasi variabel kondisi ruangkelas
 int panjang;
 int lebar;
 int jumlahkursi;
 int jumlahpintu;
 int jumlahjendela;
 int luas;
 int rasio;
//deklarasi variabel jumlah kondisi dan posisi sarana
 int jumlahstopkontak;
 String kondisistopkontak;
 String posisistopkontak;
 int jumlahkabellcd;
 String kondisikabellcd;
 String posisikabellcd;
 int jumlahlampu;
 String kondisilampu;
 String posisilampu;
 int jumlahkipasangin;
 String kondisikipasangin;
 String posisikipasangin;
 int jumlahAC;
 String kondisiAC;
 String posisiAC;
 String pilihSSID;
 int bandwidth;
 int jumlahCCTV;
 String kondisiCCTV;
 String posisiCCTV;
//deklarasi variabel lingkungan ruangkelas
 String kondisilantai;
 String kondisidinding;
 String kondisiatap;
 String kondisipintu;
 String kondisijendela;
//deklarasi variabel kebersihan ruangkelas
 String sirkulasiudara;
 int pencahayaan;
 int kelembapan;
 int suhu;
//deklarasi variabel kenyamanan ruangkelas
 String kebisingan;
 String bau;
 String kebocoran;
 String kerusakan;
 String keausan;
//deklarasi variabel keamanan ruangkelas
 String kekokohan;
 String kuncipintudanjendela;
 String bahaya;
//public RuangKelas (String namaruang,String lokasiruang,String fakultas,int panjang,
//int lebar,int jumlahkursi,int jumlahpintu,int jumlahjendela,int luas,int rasio,
//int bentuk,int jumlahstopkontak,String kondisistopkontak,String posisistopkontak,
//int jumlahkabellcd,String kondisikabellcd,String posisikabellcd,int jumlahlampu,
//String kondisilampu,String posisilampu,int jumlahkipasangin,String kondisikipasangin,
//String posisikipasangin,int jumlahAC,String kondisiAC,String posisiAC,String pilihSSID,int bandwidth,
//int jumlahCCTV,String kondisiCCTV,String posisiCCTV,String kondisilantai,
//String kondisidinding,String kondisiatap,String kondisipintu,String kondisijendela,
//String sirkulasiudara,int pencahayaan,int kelembapan,int suhu,
//String kebisingan,String bau,String kebocoran,String kerusakan,String keausan,
//String kekokohan,String kuncipintudanjendela,String bahaya){
//this.bahaya=bahaya;
//this.bandwidth=bandwidth;
//this.bau=bau;
//this.fakultas=fakultas;
//this.sirkulasiudara=sirkulasiudara;
//this.jumlahAC=jumlahAC;
//this.jumlahCCTV=jumlahCCTV;
//this.jumlahjendela=jumlahjendela;
//this.jumlahkabellcd=jumlahkabellcd;
//this.jumlahkipasangin=jumlahkipasangin;
//this.jumlahkursi=jumlahkursi;
//this.jumlahlampu=jumlahlampu;
//this.jumlahpintu=jumlahpintu;
//this.jumlahstopkontak=jumlahstopkontak;
//this.keausan=keausan;
//this.kebisingan=kebisingan;
//this.kebocoran=kebocoran;
//this.kekokohan=kekokohan;
//this.kelembapan=kelembapan;
//this.kerusakan=kerusakan;
//this.kondisiAC=kondisiAC;
//this.kondisiCCTV=kondisiCCTV;
//this.kondisiatap=kondisiatap;
//this.kondisidinding=kondisidinding;
//this.kondisijendela=kondisijendela;
//this.kondisikabellcd=kondisikabellcd;
//this.kondisikipasangin=kondisikipasangin;
//this.kondisilampu=kondisilampu;
//this.kondisilantai=kondisilantai;
//this.kondisipintu=kondisipintu;
//this.kondisistopkontak=kondisistopkontak;
//this.kuncipintudanjendela=kuncipintudanjendela;
//this.lebar=lebar;
//this.lokasiruang=lokasiruang;
//this.luas=luas;
//this.namaruang=namaruang;
//this.panjang=panjang;
//this.pencahayaan=pencahayaan;
//this.pilihSSID=pilihSSID;
//this.posisiAC=posisiAC;
//this.posisiCCTV=posisiCCTV;
//this.posisikabellcd=posisikabellcd;
//this.posisikipasangin=posisikipasangin;
//this.posisilampu=posisilampu;
//this.posisistopkontak=posisistopkontak;
//this.rasio=rasio;
//this.suhu=suhu;
//}

    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public void setJumlahjendela(int jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public void setRasio(int rasio) {
        this.rasio = rasio;
    }

    public void setJumlahstopkontak(int jumlahstopkontak) {
        this.jumlahstopkontak = jumlahstopkontak;
    }

    public void setKondisistopkontak(String kondisistopkontak) {
        this.kondisistopkontak = kondisistopkontak;
    }

    public void setPosisistopkontak(String posisistopkontak) {
        this.posisistopkontak = posisistopkontak;
    }

    public void setJumlahkabellcd(int jumlahkabellcd) {
        this.jumlahkabellcd = jumlahkabellcd;
    }

    public void setKondisikabellcd(String kondisikabellcd) {
        this.kondisikabellcd = kondisikabellcd;
    }

    public void setPosisikabellcd(String posisikabellcd) {
        this.posisikabellcd = posisikabellcd;
    }

    public void setJumlahlampu(int jumlahlampu) {
        this.jumlahlampu = jumlahlampu;
    }

    public void setKondisilampu(String kondisilampu) {
        this.kondisilampu = kondisilampu;
    }

    public void setPosisilampu(String posisilampu) {
        this.posisilampu = posisilampu;
    }

    public void setJumlahkipasangin(int jumlahkipasangin) {
        this.jumlahkipasangin = jumlahkipasangin;
    }

    public void setKondisikipasangin(String kondisikipasangin) {
        this.kondisikipasangin = kondisikipasangin;
    }

    public void setPosisikipasangin(String posisikipasangin) {
        this.posisikipasangin = posisikipasangin;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    public void setKondisiAC(String kondisiAC) {
        this.kondisiAC = kondisiAC;
    }

    public void setPosisiAC(String posisiAC) {
        this.posisiAC = posisiAC;
    }

    public void setPilihSSID(String pilihSSID) {
        this.pilihSSID = pilihSSID;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setJumlahCCTV(int jumlahCCTV) {
        this.jumlahCCTV = jumlahCCTV;
    }

    public void setKondisiCCTV(String kondisiCCTV) {
        this.kondisiCCTV = kondisiCCTV;
    }

    public void setPosisiCCTV(String posisiCCTV) {
        this.posisiCCTV = posisiCCTV;
    }

    public void setKondisilantai(String kondisilantai) {
        this.kondisilantai = kondisilantai;
    }

    public void setKondisidinding(String kondisidinding) {
        this.kondisidinding = kondisidinding;
    }

    public void setKondisiatap(String kondisiatap) {
        this.kondisiatap = kondisiatap;
    }

    public void setKondisipintu(String kondisipintu) {
        this.kondisipintu = kondisipintu;
    }

    public void setKondisijendela(String kondisijendela) {
        this.kondisijendela = kondisijendela;
    }

    public void setSirkulasiudara(String sirkulasiudara) {
        this.sirkulasiudara = sirkulasiudara;
    }

    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    public void setKuncipintudanjendela(String kuncipintudanjendela) {
        this.kuncipintudanjendela = kuncipintudanjendela;
    }

    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }

   
 
public String getNamaruang() {
return namaruang;
}
public String getLokasiruang() {
return lokasiruang;
}
public String getFakultas() {
return fakultas;
}

public int getPanjang() {
return panjang;
}
public int getLebar() {
return lebar;
}
public int getJumlahkursi() {
return jumlahkursi;
}
public int getJumlahpintu() {
return jumlahpintu;
}
public int getJumlahjendela() {
return jumlahjendela;
}
public int getJumlahstopkontak() {
return jumlahstopkontak;
}
public String getKondisistopkontak() {
return kondisistopkontak;
}
public String getPosisistopkontak() {
return posisistopkontak;
}
public int getJumlahkabellcd() {
return jumlahkabellcd;
}
public String getKondisikabellcd() {
return kondisikabellcd;
}
public String getPosisikabellcd() {
return posisikabellcd;
}
public int getJumlahlampu() {
return jumlahlampu;
}
public String getKondisilampu() {
return kondisilampu;
}
public String getPosisilampu() {
return posisilampu;
}
public int getJumlahkipasangin() {
return jumlahkipasangin;
}
public String getKondisikipasangin() {
return kondisikipasangin;
}
public String getPosisikipasangin() {
return posisikipasangin;
}
public int getJumlahAC() {
return jumlahAC;
}
public String getKondisiAC() {
return kondisiAC;
}
public String getPosisiAC() {
return posisiAC;
}
public String getPilihSSID() {
return pilihSSID;
}
public int getBandwidth() {
return bandwidth;
}
public int getJumlahCCTV() {
return jumlahCCTV;
}
public String getKondisiCCTV() {
return kondisiCCTV;
}
public String getPosisiCCTV() {
return posisiCCTV;
}
public String getKondisilantai() {
return kondisilantai;
}
public String getKondisidinding() {
return kondisidinding;
}
public String getKondisiatap() {
return kondisiatap;
}
public String getKondisipintu() {
return kondisipintu;
}
public String getKondisijendela() {
return kondisijendela;
}
public String getSirkulasiudara() {
return sirkulasiudara;
}
public int getPencahayaan() {
return pencahayaan;
}
public int getKelembapan() {
return kelembapan;
}
public int getSuhu() {
return suhu;
}
public String getKebisingan() {
return kebisingan;
}
public String getBau() {
return bau;
}
public String getKebocoran() {
return kebocoran;
}
public String getKerusakan() {
return kerusakan;
}
public String getKeausan() {
return keausan;
}
public String getKekokohan() {
return kekokohan;
}
public String getKuncipintudanjendela() {
return kuncipintudanjendela;
}
public String getBahaya() {
return bahaya;
}

public int getLuas() {
return luas;
}

public int getRasio() {
return rasio;
}
public abstract void Cetak ();


}
