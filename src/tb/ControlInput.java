
package tb;

import java.util.Scanner;
public class ControlInput extends RuangKelas implements Interfes  {
      
       //inputan keamanan ruang kelas
      double hitungluas(int panjang , int lebar, int luas){
        luas=panjang*lebar;
        return luas;
    }
    
    double hitungrasio(int rasio, int luas , int jumlahkursi){
        rasio= luas/jumlahkursi;
        return rasio;
    }
    
    double HitungBentukRuang(int panjang , int luas, double HitungBentukRuang){
        if(panjang != luas){
            System.out.println("persegi panjang");
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        return HitungBentukRuang;
    }
    
    double HitungRasioLuas(int rasio, double HitungRasioLuas){
        if (rasio>=2){
            System.out.println("SESUAI");
        }else{
            System.out.println("TIDAK SESUAI");
        }
        
        return HitungRasioLuas;
    }
       
       double Analisispintu(int jumlahpintu, double Analisispintu){
           if (jumlahpintu>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        } 
               return Analisispintu;
       }
       
       double Analisisjendela(int jumlahjendela, double AnalisisPintudanJendela){
        if (jumlahjendela>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return AnalisisPintudanJendela;
       }
       
       double Analisisstopkontak(int jumlahstopkontak, double Analisisstopkontak ){
            if (jumlahstopkontak>=4){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisisstopkontak;
       }
       
       double Analisiskondisistopkontak(int jumlahstopkontak, String kondisistopkontak, double Analisiskondisistopkontak){
            if (jumlahstopkontak==4 &&kondisistopkontak.equals("baik")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
            return Analisiskondisistopkontak;
       }
       double Analisisposisistopkontak(String posisistopkontak, double Analisisposisistopkontak ){
            if (posisistopkontak.equals("pojok ruangan") && posisistopkontak.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisisposisistopkontak;
       }
       
       double Analisisjumlahkabellcd(int jumlahkabellcd, double Analisisjumlahkabellcd){
           if (jumlahkabellcd>=1){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           return Analisisjumlahkabellcd;
       }
       double Analisiskondisikabellcd(String kondisikabellcd, double Analisiskondisikabellcd){
           if (kondisikabellcd.equals("Berfungsi")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           return  Analisiskondisikabellcd;
       }
       
       double Analisisposisikabellcd(String posisikabellcd, double Analisisposisikabellcd){
           if (posisikabellcd.equals("Dekat dosen")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisisposisikabellcd;

       }
       double Analisisjumlahlampu(int jumlahlampu, double Analisisjumlahlampu ){
           if (jumlahlampu>=18 ){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           return Analisisjumlahlampu;
       }
       double Analisisposisilampu(String posisilampu, double Analisisposisilampu){
           if (posisilampu.equals("Atap ruangan")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
       
        return Analisisposisilampu;
       }
       
       double Analisisjumlahkipas(int jumlahkipasangin, double Analisisjumlahkipas ){
            if (jumlahkipasangin>=2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        } 
            return Analisisjumlahkipas;
       }
       double Analisiskondisikipasangin(int jumlahkipasangin, String kondisikipasangin, double Analisiskondisikipasangin){
            if (kondisikipasangin.equals("baik") && jumlahkipasangin==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisiskondisikipasangin;
       }
       //internet
       double Analisisinternet(String pilihSSID, double Analisisinternet ){
           if (pilihSSID.equals("UMM Hotspot")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           return Analisisinternet;
       }
           double AnalisisLogininternet(String pilihSSID, double AnalisisLogininternet){
       if (pilihSSID.equals("Bisa login")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return AnalisisLogininternet ;
       }
       
       double AnalisisjumlahCCTV(int jumlahCCTV, double AnalisisjumlahCCTV){
           if (jumlahCCTV==2){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
           return AnalisisjumlahCCTV;
        }
       double AnalisisposisiCCTV(String posisiCCTV, double AnalisisposisiCCTV){
           if (posisiCCTV.equals("Depan") && posisiCCTV.equals("Belakang")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return AnalisisposisiCCTV;
       }
       
       double Analisiskebersihan(int b, double Analsiskebersihan){
          
           if (b==1){
               System.out.println("Sesuai");
           }
           if (b==2){
               System.out.println("Tidak sesuai");
           
           }
        return Analsiskebersihan;
       }
       
       double Analisissirkulasiudara(String inputsirkulasiudara, double Analisissirkulasiudara){
        if (inputsirkulasiudara.equals("Lancar")){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisissirkulasiudara;
       }
       
       double Analisispencahayaan(int pencahayaan, double Analisispencahayaan){
           if (pencahayaan>=250 && pencahayaan<=350){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisispencahayaan;
       }
       double Analisiskelembapan(int kelembapan, double Analisiskelembapan){
            if (kelembapan>=70 && kelembapan<=80){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisiskelembapan;
       }
       
        double Analisissuhu(int suhu, double Analisissuhu){
        if (suhu>=25 && suhu<=35){
            System.out.println("Sesuai");
        }
        else {
            System.out.println("Tidak sesuai");
        }
        return Analisissuhu;
       }
        //inputan kenyamanan ruang kelas
       double kebisingan (double kebisingan){
       int c=0;
        if (c==1){
            System.out.println("TIDAK SESUAI");
        }
        if (c==2){
            System.out.println("SESUAI");
        }
        return kebisingan;
    }
//       tebe[a].setKebisingan(in.next());
       double bau(double bau){
       int d=0;
        if (d==1){
            System.out.println("TIDAK SESUAI");
        }
        if (d==2){
            System.out.println("SESUAI");
        }
        return bau;
    }
//       tebe[a].setBau(in.next());
       double kebocoran(double kebocoran){
         int e=0;
        if (e==1){
            System.out.println("TIDAK SESUAI");
        }
        if (e==2){
            System.out.println("SESUAI");
        }
        return kebocoran;
    }
//       tebe[a].setKebocaran(in.next());
       double kerusakan(double Kerusakan){
       int f=0;
        if (f==1){
            System.out.println("TIDAK SESUAI");
        }
        if (f==2){
            System.out.println("SESUAI");
        }
        return Kerusakan;
    }
       
//       tebe[a].setKerusakan(in.next());
       double Keausan(double Keausan){
        int g=0;
        if (g==1){
            System.out.println("TIDAK SESUAI");
        }
        if (g==2){
            System.out.println("SESUAI");
        }
        return Keausan;
       }
       
       double Kekokohan(double Kekokohan){
        int h=0;
        if (h==1){
            System.out.println("TIDAK SESUAI");
        }
        if (h==2){
            System.out.println("SESUAI");
        }
        return Kekokohan;
    }
        
    double KunciPintudanJendela(double KunciPintudanJendela){
        int i=0;
        if (i==1){
        System.out.println("TIDAK SESUAI");
        }
        if (i==2){
            System.out.println("SESUAI");
        }
        return KunciPintudanJendela;
    }
        
    double KeamananRuang(double KeamananRuang){
        int j=0;
        if (j==1){
            System.out.println("TIDAK SESUAI");
        }
        if (j==2){
            System.out.println("SESUAI");
        }
        return KeamananRuang; 
        
      @Override
      //kenyamanan ruang kelas
      public String Kebisingan(){
      int c==0
      if(c==1){
            System.out.println("TIDAK SESUAI");
      }
      if(c==2){
            System.out.println("SESUAI");
      }}
      
      public String Bau(){
      int d==0
      if (d==1){
            System.out.println("TIDAK SESUAI");
      }
      if (d==2){
            System.out.println("SESUAI");
      }}
      
      public String Kebocoran(){
      int e==0
      if (e==1){
            System.out.println("TIDAK SESUAI");
      }
      if (e==2){
            System.out.println("SESUAI");
      }}
      
      public String Kerusakan(){
      int f==0
      if (f==1){
            System.out.println("TIDAK SESUAI");
      }
      if (f==2){
            System.out.println("SESUAI");
      }}
      
      public String Keausan(){
      int g==0
      if (g==1){
            System.out.println("TIDAK SESUAI");
      }
      if (g==2){
            System.out.println("SESUAI");
      }}

      public String Kekokohan(){
      int h==0
      if (h==1){
            System.out.println("TIDAK SESUAI");
      }
      if (h==2){
            System.out.println("SESUAI");
      }}
      
      public String KunciPintudanJendela(){
      int i==0
      if (i==1){
            System.out.println("TIDAK SESUAI");
      }
      if (i==2){
            System.out.println("SESUAI");
      }}

      public String KeamananRuang(){
      int j==0
      if (j==1){
      System.out.println("TIDAK SESUAI");
      }
      if (j==2){
      System.out.println("SESUAI");
      }

      }
    } }
