package tb;

import java.util.Scanner;
public class ControlInput {
      void InsertData(){
       int a;
       Input [] tebe ; 
       tebe = new Input [1]; 
       for (a=0;a<tebe.length;a++){
       tebe [a] = new Input(); 
       Scanner in = new Scanner (System.in);
       
       // inputan identitas ruang kelas
       System.out.println("Masukkan nama ruang :");
       tebe[a].setNamaruang(in.next());
       System.out.println("Masukkan lokasi ruang :");
       tebe[a].setLokasiruang(in.next());
       System.out.println("Pilih Fakultas/program studi :");
       tebe[a].setFakultas(in.next());
       
       // inputan kondisi ruang kelas
       System.out.println("Masukkan panjang ruang :");
       tebe[a].setPanjang(in.nextInt());
       System.out.println("Masukkan lebar ruang :");
       tebe[a].setLebar(in.nextInt());
       System.out.println("Masukkan jumlah kursi :");
       tebe[a].setJumlahkursi(in.nextInt());
       System.out.println("Masukkan jumlah pintu :");
       tebe[a].setJumlahpintu(in.nextInt());
       System.out.println("Masukkan jumlah jendela:");
       tebe[a].setJumlahjendela(in.nextInt());
           
       
       
       // inputan jumlah,kondisi,posisi sarana
       
       System.out.println("Masukkan jumlah stop kontak :");
       tebe[a].setJumlahstopkontak(in.nextInt());
       
       System.out.println("Masukkan kondisi stop kontak :");
       tebe[a].setKondisistopkontak(in.next());
        
       System.out.println("Masukkan posisi stop kontak :");
       tebe[a].setPosisistopkontak(in.next());
       
       
       System.out.println("Masukkan jumlah kabel LCD :");
       tebe[a].setJumlahkabellcd(in.nextInt());
       
       System.out.println("Masukkan kondisi kabel LCD :");
       tebe[a].setKondisikabellcd(in.next());
       
       System.out.println("Masukkan posisi kabel LCD :");
       tebe[a].setPosisikabellcd(in.next());
       
       
       System.out.println("Masukkan jumlah lampu :");
       tebe[a].setJumlahlampu(in.nextInt());
       
       System.out.println("Masukkan kondisi lampu :");
       tebe[a].setKondisilampu(in.next());
       
       System.out.println("Masukkan posisi lampu :");
       tebe[a].setPosisilampu(in.next());
       
       
       System.out.println("Masukkan jumlah kipas angin :");
       tebe[a].setJumlahjendela(in.nextInt());
      
       System.out.println("Masukkan kondisi kipas angin :");
       tebe[a].setKondisikipasangin(in.next());
        
       System.out.println("Masukkan jumlah AC :");
       tebe[a].setJumlahAC(in.nextInt());
       
       System.out.println("Masukkan kondisi AC:");
       tebe[a].setKondisiAC(in.next());
       
       System.out.println("Masukkan posisi AC :");
       tebe[a].setPosisiAC(in.next());
       
       
       System.out.println("Masukkan SSID:");
       tebe[a].setPilihSSID(in.next());
       System.out.println("Masukkan bandwidth :");
       tebe[a].setBandwidth(in.nextInt());
       
       
       System.out.println("Masukkan jumlah CCTV:");
       tebe[a].setJumlahCCTV(in.nextInt());
       
       System.out.println("Masukkan kondisi CCTV:");
       tebe[a].setKondisiCCTV(in.next());
       
       System.out.println("Masukkan posisi CCTV:");
       tebe[a].setPosisiCCTV(in.next());
       
 //inputan  linngkungan ruang kelas 
       
       System.out.println("Masukkan kondisi lantai  :");
       tebe[a].setKondisilantai(in.next());
       System.out.println("Masukkan kondisi dinding:");
       tebe[a].setKondisidinding(in.next());
       System.out.println("Masukkan kondisi atap :");
       tebe[a].setKondisiatap(in.next());
       System.out.println("Masukkan kondisi pintu:");
       tebe[a].setKondisipintu(in.next());
       System.out.println("Masukkan kondisi jendela:");
       tebe[a].setKondisijendela(in.next());
       System.out.println("1.Baik");
       System.out.println("1.Kotor");
           
       
       //inputan kebersihan ruang kelas
       
       System.out.println("Masukkan sirkulasi udara :");
       tebe[a].setInputsirkulasiudara(in.next());
        
       System.out.println("Masukkan nilai pencahayaan:");
       tebe[a].setPencahayaan(in.nextInt());
       
       
       System.out.println("Masukkan kelembapan (%):");
       tebe[a].setKelembapan(in.nextInt());
      
      
       System.out.println("Masukkan suhu (celcius) :");
       tebe[a].setSuhu(in.nextInt());
       
       
       
//       tebe[a].setKeausan(in.next());
        }}
       
       //inputan keamanan ruang kelas
      double hitungluas(int panjang , int lebar, int luas){
        luas= panjang*lebar;
        return luas;
    }
    
    double hitungrasio(int rasio, int luas , int jumlahkursi){
        rasio= luas/jumlahkursi;
        return rasio;
    }
    
    double HitungBentukRuang(int panjang , int luas){
        if(panjang != luas){
            System.out.println("persegi panjang");
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double HitungBentukRuang=0;
        return HitungBentukRuang;
    }
    
    double HitungRasioLuas(int rasio){
        if (rasio>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        double HitungRasioLuas = 0;
        return HitungRasioLuas;
    }
       
       double Analisispintujendela(int jumlahpintu, int jumlahjendela){
           if (jumlahpintu>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }    
        if (jumlahjendela>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       double AnalisisPintudanJendela = 0;
        return AnalisisPintudanJendela;
       }
       
       double Analisiskelistrikan(int jumlahstopkontak , String kondisistopkontak, String posisistopkontak ){
            if (jumlahstopkontak>=4){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            if (jumlahstopkontak==4 &&kondisistopkontak.equals("baik")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            if (posisistopkontak.equals("pojok ruangan") && posisistopkontak.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisiskelistrikan=0;
        return Analisiskelistrikan;
       }
       
       double Analisislcd(int jumlahkabellcd, String kondisikabellcd , String posisikabellcd){
           if (jumlahkabellcd>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (kondisikabellcd.equals("Berfungsi")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (posisikabellcd.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisislcd=0;
        return Analisislcd;

       }
       double Analisislampu(int jumlahlampu ,String posisilampu){
           if (jumlahlampu>=18 ){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (posisilampu.equals("Atap ruangan")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisislampu=0;
        return Analisislampu;
       }
       double Analisiskipas(int jumlahkipasangin ,String kondisikipasangin){
            if (jumlahkipasangin>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            if (kondisikipasangin.equals("baik") && jumlahkipasangin==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisiskipas=0;
        return Analisiskipas;
       }
       
       double Analisisinternet(String pilihSSID ){
           if (pilihSSID.equals("UMM Hotspot")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       if (pilihSSID.equals("Bisa login")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisisinternet=0;
        return Analisisinternet;
       }
       double AnalisisCCTV(int jumlahCCTV , String posisiCCTV){
           if (jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (posisiCCTV.equals("Depan") && posisiCCTV.equals("Belakang")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double AnalisisCCTV=0;
        return AnalisisCCTV;
       }
       
       double Analisiskebersihan(int b){
          
           if (b==1){
               System.out.println("Sesuai");
           }
           if (b==2){
               System.out.println("Tidak sesuai");
           
           }
        double Analsiskebersihan=0;
        return Analsiskebersihan;
       }
       double Analisissirkulasiudara(String inputsirkulasiudara){
        if (inputsirkulasiudara.equals("Lancar")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisissirkulasiudara=0;
        return Analisissirkulasiudara;
       }
       double Analisispencahayaan(int pencahayaan){
           if (pencahayaan>=250 && pencahayaan<=350){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       double Analisispencahayaan=0;
        return Analisispencahayaan;
       }
       double Analisiskelembapan(int kelembapan){
            if (kelembapan>=70 && kelembapan<=80){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisiskelembapan=0;
        return Analisiskelembapan;
       }
        double Analisissuhu(int suhu){
        if (suhu>=25 && suhu<=35){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double Analisissuhu=0;
        return Analisissuhu;
       }
        //inputan kenyamanan ruang kelas
       double kebisingan (){
       int c=0;
        if (c==1){
            System.out.println("TIDAK SESUAI");
        }
        if (c==2){
            System.out.println("SESUAI");
        }
        double kebisingan=0;
        return kebisingan;
    }
//       tebe[a].setKebisingan(in.next());
       double bau(){
       int d=0;
        if (d==1){
            System.out.println("TIDAK SESUAI");
        }
        if (d==2){
            System.out.println("SESUAI");
        }
        double bau=0;
        return bau;
    }
//       tebe[a].setBau(in.next());
       double kebocoran(){
         int e=0;
        if (e==1){
            System.out.println("TIDAK SESUAI");
        }
        if (e==2){
            System.out.println("SESUAI");
        }
        double kebocoran=0;
        return kebocoran;
    }
//       tebe[a].setKebocaran(in.next());
       double kerusakan(){
       int f=0;
        if (f==1){
            System.out.println("TIDAK SESUAI");
        }
        if (f==2){
            System.out.println("SESUAI");
        }
        double Kerusakan=0;
        return Kerusakan;
    }
       
//       tebe[a].setKerusakan(in.next());
       double Keausan(){
        int g=0;
        if (g==1){
            System.out.println("TIDAK SESUAI");
        }
        if (g==2){
            System.out.println("SESUAI");
        }
        double Keausan=0;
        return Keausan;
       }
       
       double Kekokohan(){
        int h=0;
        if (h==1){
            System.out.println("TIDAK SESUAI");
        }
        if (h==2){
            System.out.println("SESUAI");
        }
        double Kekokohan=0;
        return Kekokohan;
    }
        
    double KunciPintudanJendela(){
        int d=0;
        if (d==1){
        System.out.println("TIDAK SESUAI");
        }
        if (d==2){
            System.out.println("SESUAI");
        }
        double KunciPintudanJendela=0;
        return KunciPintudanJendela;
    }
        
    double KeamananRuang(){
        int e=0;
        if (e==1){
            System.out.println("TIDAK SESUAI");
        }
        if (e==2){
            System.out.println("SESUAI");
        }
        double KeamananRuang=0;
        return KeamananRuang;
    }
      

      void CetakData(){
       Input [] tebe ; 
       int a;
       tebe = new Input [1]; 
       for (a=0;a<tebe.length;a++){
       tebe [a] = new Input(); 
       Scanner in = new Scanner (System.in);
       
       // Output identitas ruang kelas
       System.out.println("Masukkan nama ruang :");
       tebe[a].getNamaruang();
       System.out.println("Masukkan lokasi ruang :");
       tebe[a].getLokasiruang();
       System.out.println("Pilih Fakultas/program studi :");
       tebe[a].getFakultas();
       
       // Output kondisi ruang kelas
       System.out.println("Masukkan panjang ruang :");
       tebe[a].getPanjang();
       System.out.println("Masukkan lebar ruang :");
       tebe[a].getLebar();
       System.out.println("Masukkan jumlah kursi :");
       tebe[a].getJumlahkursi();
       System.out.println("Masukkan jumlah pintu :");
       tebe[a].getJumlahpintu();
       System.out.println("Masukkan jumlah jendela:");
       tebe[a].getJumlahjendela();
       
       // Output jumlah,kondisi,posisi sarana
       System.out.println("Masukkan jumlah stop kontak :");
       tebe[a].getJumlahstopkontak();
       System.out.println("Masukkan kondisi stop kontak :");
       tebe[a].getKondisistopkontak();
       System.out.println("Masukkan posisi stop kontak :");
       tebe[a].getPosisistopkontak();
       System.out.println("Masukkan jumlah kabel LCD :");
       tebe[a].getJumlahkabellcd();
       System.out.println("Masukkan kondisi kabel LCD :");
       tebe[a].getKondisikabellcd();
       System.out.println("Masukkan posisi kabel LCD :");
       tebe[a].getPosisikabellcd();
       System.out.println("Masukkan jumlah lampu :");
       tebe[a].getJumlahlampu();
       System.out.println("Masukkan kondisi lampu :");
       tebe[a].getKondisilampu();
       System.out.println("Masukkan posisi lampu :");
       tebe[a].getPosisilampu();
       System.out.println("Masukkan jumlah kipas angin :");
       tebe[a].getJumlahkipasangin();
       System.out.println("Masukkan kondisi kipas angin :");
       tebe[a].getKondisikipasangin();
       System.out.println("Masukkan jumlah AC :");
       tebe[a].getJumlahAC();
       System.out.println("Masukkan kondisi AC:");
       tebe[a].getKondisiAC();
       System.out.println("Masukkan posisi AC :");
       tebe[a].getPosisiAC();
       System.out.println("Masukkan SSID:");
       tebe[a].getPilihSSID();
       System.out.println("Masukkan banwidth :");
       tebe[a].getBandwidth();
       System.out.println("Masukkan jumlah CCTV:");
       tebe[a].getJumlahCCTV();
       System.out.println("Masukkan kondisi CCTV:");
       tebe[a].getKondisiCCTV();
       System.out.println("Masukkan posisi CTV:");
       tebe[a].getPosisiCCTV();
       
       //Ouput lingkungan ruang kelas
       System.out.println("Masukkan kondisi lantai  :");
       tebe[a].getKondisilantai();
       System.out.println("Masukkan kondisi dinding:");
       tebe[a].getKondisidinding();
       System.out.println("Masukkan kondisi atap :");
       tebe[a].getKondisiatap();
       System.out.println("Masukkan kondisi pintu:");
       tebe[a].getKondisipintu();
       System.out.println("Masukkan jendela:");
       tebe[a].getKondisijendela();
       
       //Output kebersihan ruang kelas
       System.out.println("Masukkan sirkulasi udara :");
       tebe[a].getInputsirkulasiudara();
       System.out.println("Masukkan nilai pencahayaan:");
       tebe[a].getPencahayaan();
       System.out.println("Masukkan kelembapan (%):");
       tebe[a].getKelembapan();
       System.out.println("Masukkan suhu (celcius) :");
       tebe[a].getSuhu();
       
       //Ouput kenyamanan ruang kelas
       System.out.println("Masukkan kebisingan:");
       tebe[a].getKebisingan();
       System.out.println("Masukkan bau:");
       tebe[a].getBau();
       System.out.println("Masukkan kebocoran:");
       tebe[a].getKebocaran();
       System.out.println("Masukkan kerusakan:");
       tebe[a].getKerusakan();
       System.out.println("Masukkan keausan:");
       tebe[a].getKeausan();
       
       //Output keamanan ruang kelas
       System.out.println("Masukkan kekokohan:");
       tebe[a].getKekokohan();
       System.out.println("Masukkan kunci pintu dan jendela:");
       tebe[a].getKuncipintudanjendela();
       System.out.println("Masukkan bahaya:");
       tebe[a].getBahaya();
       
    
}
}
}
