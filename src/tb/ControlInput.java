
package tb;

import java.util.Scanner;
public class ControlInput extends RuangKelas {
      
      double hitungluas(int panjang , int lebar, int luas){
        luas = panjang*lebar;
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
      

      
      }

