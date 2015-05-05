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
import java.util.Scanner;
    public class Tubes extends Input {
        Input[] tebe = new Input[2];
        
        public Tubes(){
        tebe[0]=new Input();
        tebe[1]=new Input();
    }
        double InsertData(){
            int a;
            for (a=0;a<tebe.length;a++){
            
       //Insert identitas ruang kelas
       Scanner in = new Scanner (System.in);
       System.out.println("Masukkan nama ruang :");
       tebe[a].setNamaruang(in.next());
       System.out.println("Masukkan lokasi ruang :");
       tebe[a].setLokasiruang(in.next());
       System.out.println("Pilih Fakultas/program studi :");
       tebe[a].setFakultas(in.next());
       //Insert kondisi ruang kelas
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
       //Insert jumlah, kondisi, posisi sarana
       System.out.println("Masukkan jumlah stop kontak :");
       tebe[a].setJumlahstopkontak(in.nextInt());
       System.out.println("Masukkan kondisi stop kontak :");
       tebe[a].setKondisistopkontak(in.next());
       System.out.println("Masukkan posisi stop kontak :");
       System.out.println("1.Pojok");
       System.out.println("2.Dekat Dosen");
       tebe[a].setPosisistopkontak(in.next());
       System.out.println("Masukkan jumlah kabel LCD :");
       tebe[a].setJumlahkabellcd(in.nextInt());
       System.out.println("Masukkan kondisi kabel LCD :");
       System.out.println("1.Berfungsi");
       System.out.println("2.Tidak Berfungsi");
       tebe[a].setKondisikabellcd(in.next());
       System.out.println("Masukkan posisi kabel LCD :");
       System.out.println("1.Dekat Dosen");
       System.out.println("2.Lain");
       tebe[a].setPosisikabellcd(in.next());
       System.out.println("Masukkan jumlah lampu :");
       tebe[a].setJumlahlampu(in.nextInt());
       System.out.println("Masukkan kondisi lampu :");
       tebe[a].setKondisilampu(in.next());
       System.out.println("Masukkan posisi lampu :");
       System.out.println("1.Atap Ruangan");
       System.out.println("2.Lain");
       tebe[a].setPosisilampu(in.next());
       System.out.println("Masukkan jumlah kipas angin :");
       tebe[a].setJumlahjendela(in.nextInt());
       System.out.println("Masukkan kondisi kipas angin :");
       tebe[a].setKondisikipasangin(in.next());
       System.out.println("Masukkan posisi kipas angin :");
       System.out.println("1.Atap Ruangan");
       System.out.println("2.Lain");
       tebe[a].setPosisikipasangin(in.next());
       System.out.println("Masukkan jumlah AC :");
       tebe[a].setJumlahAC(in.nextInt());
       System.out.println("Masukkan kondisi AC:");
       tebe[a].setKondisiAC(in.next());
       System.out.println("Masukkan posisi AC :");
       System.out.println("1.Belakang/Samping");
       System.out.println("2.Lain");
       tebe[a].setPosisiAC(in.next());
       System.out.println("Pilih SSID:");
       System.out.println("1.UMM Hotspot");
       System.out.println("2.Lain");
       tebe[a].setPilihSSID(in.next());
       System.out.println("Masukkan bandwidth :");
       System.out.println("1.Bisa Login");
       System.out.println("2.Tidak Bisa Login");
       tebe[a].setBandwidth(in.nextInt());
       System.out.println("Masukkan jumlah CCTV:");
       tebe[a].setJumlahCCTV(in.nextInt());
       System.out.println("Masukkan kondisi CCTV:");
       tebe[a].setKondisiCCTV(in.next());
       System.out.println("Masukkan posisi CCTV:");
       System.out.println("1.Depan");
       System.out.println("2.Belakang");
       tebe[a].setPosisiCCTV(in.next());
       //Insert lingkungan ruang kelas
       System.out.println("Masukkan kondisi lantai  :");
       System.out.println("1.Baik");
       System.out.println("2.Kotor");
       tebe[a].setKondisilantai(in.next());
       System.out.println("Masukkan kondisi dinding:");
       System.out.println("1.Baik");
       System.out.println("2.Kotor");
       tebe[a].setKondisidinding(in.next());
       System.out.println("Masukkan kondisi atap :");
       System.out.println("1.Baik");
       System.out.println("2.Kotor");
       tebe[a].setKondisiatap(in.next());
       System.out.println("Masukkan kondisi pintu:");
       System.out.println("1.Baik");
       System.out.println("2.Kotor");
       tebe[a].setKondisipintu(in.next());
       System.out.println("Masukkan kondisi jendela:");
       System.out.println("1.Baik");
       System.out.println("2.Kotor");
       tebe[a].setKondisijendela(in.next());
       //Insert kebersihan ruang kelas
       System.out.println("Masukkan sirkulasi udara :");
       System.out.println("1.Lancar");
       System.out.println("2.Tidak Lancar");
       tebe[a].setInputsirkulasiudara(in.next());
       System.out.println("Masukkan nilai pencahayaan:");
       tebe[a].setPencahayaan(in.nextInt());
       System.out.println("Masukkan kelembapan (%):");
       tebe[a].setKelembapan(in.nextInt());
       System.out.println("Masukkan suhu (celcius) :");
       tebe[a].setSuhu(in.nextInt());
       //Insert kenyamanan ruang kelas
       int c,d,e,f,g;
       System.out.println("Masukkan kebisingan:");
       System.out.println("1.Bising");
       System.out.println("2.Tidak Bising");
       c = in.nextInt();

       System.out.println("Masukkan bau:");
       System.out.println("1.Bau");
       System.out.println("2.Tidak Bau");
       d = in.nextInt();

       System.out.println("Masukkan kebocoran:");
       System.out.println("1.Bocor");
       System.out.println("2.Tidak Bocor");
       e = in.nextInt();

       System.out.println("Masukkan kerusakan:");
       System.out.println("1.Rusak");
       System.out.println("2.Tidak Rusak");
       f = in.nextInt();

       System.out.println("Masukkan keausan:");
       System.out.println("1.Aus");
       System.out.println("2.Tidak Aus");
       g = in.nextInt();
       //Insert keamanan ruang kelas
       int h,i,j;
       System.out.println("Masukkan kekokohan:");
       System.out.println("1.Kokoh");
       System.out.println("2.Tidak Kokoh");
       h = in.nextInt();
       
       System.out.println("Masukkan kunci pintu dan jendela:");
       System.out.println("1.Ada");
       System.out.println("2.Tidak ada");
       i = in.nextInt();

       System.out.println("Masukkan bahaya:");
       System.out.println("1.Aman");
       System.out.println("2.Tidak Aman");   
       j = in.nextInt();
       }
        return 0;
    }
    double hitungluas(){
        luas = panjang*lebar;
        return luas;
    }
    double hitungrasio(){
        rasio = luas/jumlahkursi;
        return rasio;
        
    }
    double hitungbentuk(){
        if (panjang!=lebar){
            System.out.println("Persegi panjang");
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double hitungbentuk=0;
        return hitungbentuk;
    }
    double hitungrasioluas(){
        if (rasio>=0.5){
            System.out.println("SESUAI");
        }
        else {
            System.out.println("TIDAK SESUAI");
        }
        double hitungrasioluas=0;
        return hitungrasioluas;
    }
      
    double AnalisisPintudanJendela(){
        if (jumlahpintu>=2){ 
            System.out.println("SESUAI");
        }
        else {
            System.out.println("TIDAK SESUAI");
        }   
          if (jumlahjendela>=1){ 
            System.out.println("SESUAI");
        }
        else {
            System.out.println("TIDAK SESUAI");
    }
          double AnalisisPintudanJendela=0;
          return AnalisisPintudanJendela; 
    }
    double AnalisisKelistrikan(){
        if (jumlahstopkontak>=4){ 
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            
        if (jumlahstopkontak==4 && kondisistopkontak.equals("baik")){
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
           double AnalisisKelistrikan=0;
           return AnalisisKelistrikan;
    }
    double AnalisisLCD(){
        if (jumlahkabellcd>=1){
            System.out.println("Sesuai");
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
        double AnalisisLCD=0;
        return AnalisisLCD;
    }
    double AnalisisLampu(){
        if (jumlahlampu>=18 ){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
    if (kondisilampu.equals("baik") && jumlahlampu==18){
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
             double AnalisisLampu=0;
             return AnalisisLampu;
    }
        double AnalisisKipasAngin(){
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
           double AnalisisKipasAngin=0;
           return AnalisisKipasAngin;
        }  
        double analisisAC(){
             if (jumlahAC>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           if (kondisiAC.equals("baik")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            if (posisiAC.equals("Atap ruangan")){
            System.out.println("Sesuai");
        }
            double AnalisisAC=0;
            return AnalisisAC;
        }
        double AnalisisInternet(){
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
       double AnalisisInternet=0;
       return AnalisisInternet;
        }
        double AnalisisCCTV(){
            if (jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
          
       if (kondisiCCTV.equals("Baik") && jumlahCCTV==2){
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
        double AnalisisKebersihan(){
            int x=0;
            if (x==1){
                System.out.println("SESUAI");
            }
            if (x==2){
                System.out.println("TIDAK SESUAI");
            }
        double AnalisisKebersihan=0;
        return AnalisisKebersihan;
        }
         double AnalisisSirkulasiUdara(){
             if (inputsirkulasiudara.equals("Lancar")){ 
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
             double AnalisisSirkulasiUdara=0;
             return AnalisisSirkulasiUdara;
         }   
         double AnalisisPencahayaan(){
              if (pencahayaan>=250 && pencahayaan<=350){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
              double AnalisisPencahayaan=0;
              return AnalisisPencahayaan;
         }
         double AnalisisKelembapan(){
         
           if (kelembapan>=70 && kelembapan<=80){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           double AnalisisKelembapan=0;
           return AnalisisKelembapan;
         }
         double AnalisisSuhu(){ 
         
        if (suhu>=25 && suhu<=35){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        double AnalisisSuhu=0;
        return AnalisisSuhu;
        }
        double Kebisingan(){
            int c=0;
            if (c==1){
                System.out.println("TIDAK SESUAI");
            }
        if (c==2){
            System.out.println("SESUAI");
        }
        double Kebisingan=0;
        return Kebisingan;
        }
        double Bau(){
        int d=0;
            if (d==1){
                System.out.println("TIDAK SESUAI");
            }
        if (d==2){
            System.out.println("SESUAI");
        }
        double Bau=0;
        return Bau;
         }
        double Kebocoran(){
        int e=0;
            if (e==1){
                System.out.println("TIDAK SESUAI");
            }
        if (e==2){
            System.out.println("SESUAI");
        }
        double Kebocoran=0;
        return Kebocoran;
} 
double Kerusakan(){
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
double Keausan (){
int g=0;
            if (g==1){
                System.out.println("TIDAK SESUAI");
            }
        if (g==2){
            System.out.println("SESUAI");
        }
        double Kebocoran=0;
        return Kebocoran;
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
double KunciPintudanjendela(){
int i=0;
            if (i==1){
                System.out.println("TIDAK SESUAI");
            }
        if (i==2){
            System.out.println("SESUAI");
        }
        double KunciPintudanjendela=0;
        return KunciPintudanjendela;
}
double KeamananRuang(){
int j=0;
            if (j==1){
                System.out.println("TIDAK SESUAI");
            }
        if (j==2){
            System.out.println("SESUAI");
        }
        double KeamananRuang=0;
        return KeamananRuang;
}
}
        
    

