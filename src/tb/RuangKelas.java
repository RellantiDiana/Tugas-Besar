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
     private String namaruang;
     private String lokasiruang;
     private String fakultas;
    
    //deklarasi variabel kondisi ruangkelas
    private int panjang;
    private int lebar;
    private int jumlahkursi;
    private int jumlahpintu;
    private int jumlahjendela;
    private int luas;
    private int rasio;
  
    
    //deklarasi variabel jumlah kondisi dan posisi sarana
    private int jumlahstopkontak;
    private String kondisistopkontak;
    private String posisistopkontak;
    
    private int jumlahkabellcd;
    private String kondisikabellcd;
    private String posisikabellcd;
    
   private  int jumlahlampu;
    private String kondisilampu;
    private String posisilampu;
    
    private int jumlahkipasangin;
    private String kondisikipasangin;
    private String posisikipasangin;
    
    private int jumlahAC;
    private String kondisiAC;
    private String posisiAC;
    
    private String pilihSSID;
    private  int bandwidth;
    
    private int jumlahCCTV;
    private  String kondisiCCTV;
    private String posisiCCTV;
    
    //deklarasi variabel lingkungan ruangkelas
     private String kondisilantai;
     private String kondisidinding;
     Sprivate tring kondisiatap;
     private String kondisipintu;
     private String kondisijendela;
    
    //deklarasi variabel kebersihan ruangkelas
    private String inputsirkulasiudara;
    private int pencahayaan;
    private int kelembapan;
    private int suhu;
    
    //deklarasi variabel kenyamanan ruangkelas
     private String kebisingan;
     private String bau;
     private String kebocoran;
     private String kerusakan;
     private String keausan;
    
    //deklarasi variabel keamanan ruangkelas
     private String kekokohan;
     private String kuncipintudanjendela;
     private String bahaya;
    
    
    
    public RuangKelas (String namaruang,String lokasiruang,String fakultas,int panjang,
    int lebar,int jumlahkursi,int jumlahpintu,int jumlahjendela,int luas,int rasio,
    int bentuk,int jumlahstopkontak,String kondisistopkontak,String posisistopkontak,
    int jumlahkabellcd,String kondisikabellcd,String posisikabellcd,int jumlahlampu,
    String kondisilampu,String posisilampu,int jumlahkipasangin,String kondisikipasangin,
    String posisikipasangin,int jumlahAC,String kondisiAC,String posisiAC,String pilihSSID,int bandwidth,
    int jumlahCCTV,String kondisiCCTV,String posisiCCTV,String kondisilantai,
    String kondisidinding,String kondisiatap,String kondisipintu,String kondisijendela,
    String inputsirkulasiudara,int pencahayaan,int kelembapan,int suhu,
    String kebisingan,String bau,String kebocoran,String kerusakan,String keausan,
    String kekokohan,String kuncipintudanjendela,String bahaya){
     
        this.bahaya=bahaya;
        this.bandwidth=bandwidth;
        this.bau=bau;
        this.fakultas=fakultas;
        this.inputsirkulasiudara=inputsirkulasiudara;
        this.jumlahAC=jumlahAC;
        this.jumlahCCTV=jumlahCCTV;
        this.jumlahjendela=jumlahjendela;
        this.jumlahkabellcd=jumlahkabellcd;
        this.jumlahkipasangin=jumlahkipasangin;
        this.jumlahkursi=jumlahkursi;
        this.jumlahlampu=jumlahlampu;
        this.jumlahpintu=jumlahpintu;
        this.jumlahstopkontak=jumlahstopkontak;
        this.keausan=keausan;
        this.kebisingan=kebisingan;
        this.kebocoran=kebocoran;
        this.kekokohan=kekokohan;
        this.kelembapan=kelembapan;
        this.kerusakan=kerusakan;
        this.kondisiAC=kondisiAC;
        this.kondisiCCTV=kondisiCCTV;
        this.kondisiatap=kondisiatap;
        this.kondisidinding=kondisidinding;
        this.kondisijendela=kondisijendela;
        this.kondisikabellcd=kondisikabellcd;
        this.kondisikipasangin=kondisikipasangin;
        this.kondisilampu=kondisilampu;
        this.kondisilantai=kondisilantai;
        this.kondisipintu=kondisipintu;
        this.kondisistopkontak=kondisistopkontak;
        this.kuncipintudanjendela=kuncipintudanjendela;
        this.lebar=lebar;
        this.lokasiruang=lokasiruang;
        this.luas=luas;
        this.namaruang=namaruang;
        this.panjang=panjang;
        this.pencahayaan=pencahayaan;
        this.pilihSSID=pilihSSID;
        this.posisiAC=posisiAC;
        this.posisiCCTV=posisiCCTV;
        this.posisikabellcd=posisikabellcd;
        this.posisikipasangin=posisikipasangin;
        this.posisilampu=posisilampu;
        this.posisistopkontak=posisistopkontak;
        this.rasio=rasio;
        this.suhu=suhu;   
    
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


    public String getInputsirkulasiudara() {
        return inputsirkulasiudara;
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


    public String getKebocaran() {
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
public abstract void cetak ();    

}
        
    

