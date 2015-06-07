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
abstract public class TesInput extends ControlInput {

public TesInput (String namaruang,String lokasiruang,String fakultas,int panjang,
int lebar,int jumlahkursi,int jumlahpintu,int jumlahjendela,int luas,int rasio,
int bentuk,int jumlahstopkontak,String kondisistopkontak,String posisistopkontak,
int jumlahkabellcd,String kondisikabellcd,String posisikabellcd,int jumlahlampu,
String kondisilampu,String posisilampu,int jumlahkipasangin,String kondisikipasangin,
String posisikipasangin,int jumlahAC,String kondisiAC,String posisiAC,String pilihSSID,int bandwidth,
int jumlahCCTV,String kondisiCCTV,String posisiCCTV,String kondisilantai,
String kondisidinding,String kondisiatap,String kondisipintu,String kondisijendela,
String sirkulasiudara,int pencahayaan,int kelembapan,int suhu,
String kebisingan,String bau,String kebocoran,String kerusakan,String keausan,String kekokohan,String kuncipintudanjendela,String bahaya){

    super(namaruang, lokasiruang, fakultas, bau, panjang, lebar, jumlahkursi, jumlahpintu, jumlahjendela, luas, rasio, bentuk, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahkabellcd, kondisikabellcd, posisikabellcd, jumlahlampu, kondisilampu, posisilampu, jumlahkipasangin, kondisikipasangin, posisikipasangin, jumlahAC, kondisiAC, posisiAC, pilihSSID, bandwidth, jumlahCCTV, kondisiCCTV, posisiCCTV, kondisilantai, kondisidinding, kondisiatap, kondisipintu, kondisijendela, sirkulasiudara, pencahayaan, kelembapan, suhu, kebisingan, bau, kebocoran, kerusakan, keausan, kekokohan, kuncipintudanjendela, bahaya);
    
       
    super.hitungluas(panjang, lebar, luas);
    super.hitungrasio(rasio, luas, jumlahkursi);
    super.hitungbentukruang(panjang, luas, bentuk);
    super.hitungrasioluas(rasio, rasio);
    
    super.Analisisjumlahpintu(jumlahpintu, jumlahpintu);
    super.Analisisjumlahjendela(jumlahjendela, jumlahjendela);
            
    super.Analisisjumlahstopkontak(jumlahstopkontak, jumlahstopkontak);
    super.Analisiskondisistopkontak(jumlahstopkontak, kondisistopkontak, jumlahstopkontak);
    super.Analisisposisistopkontak(posisistopkontak, jumlahstopkontak);
        
    super.Analisisjumlahkabellcd(jumlahkabellcd, jumlahkabellcd);
    super.Analisiskondisikabellcd(kondisikabellcd, jumlahkabellcd);
    super.Analisisposisikabellcd(posisikabellcd, jumlahkabellcd);
   
    super.Analisisjumlahlampu(jumlahlampu, jumlahlampu);
    super.Analisiskondisilampu(kondisilampu, jumlahlampu);
    super.Analisisposisilampu(posisilampu, jumlahlampu);
    
    super.Analisisjumlahkipasangin(jumlahkipasangin, jumlahpintu);
    super.Analisiskondisikipasangin(jumlahkipasangin, kondisikipasangin, jumlahkipasangin);
    super.Analisisposisikipasangin(posisikipasangin, jumlahkipasangin);
    
    super.AnalisisjumlahAC(jumlahAC, jumlahAC);
    super.AnalisiskondisiAC(jumlahAC, kondisiAC, rasio);
    super.AnalisisposisiAC(posisiAC, rasio);
    
    super.Analisisinternet(pilihSSID, jumlahpintu);
    super.Analisislogininternet(pilihSSID, jumlahstopkontak);
    
    super.AnalisisjumlahCCTV(jumlahCCTV, jumlahCCTV);
    super.AnalisiskondisiCCTV(kondisiCCTV, jumlahCCTV);
    super.AnalisisposisiCCTV(posisiCCTV, jumlahCCTV);
    
    super.Analisiskebersihan(suhu, kelembapan);
    super.Analisissirkulasiudara(sirkulasiudara, jumlahkursi);
    super.Analisispencahayaan(pencahayaan, pencahayaan);
    super.Analisiskelembapan(kelembapan, kelembapan);
    super.Analisissuhu(suhu, suhu);
    super.Analisiskebisingan(jumlahkipasangin);
    super.Analisisbau(rasio);
    super.Analisiskebocoran(kelembapan);
    super.Analisiskerusakan(kelembapan);
    super.Analisiskeausan(kelembapan);
    
    super.Analisiskekokohan(kelembapan);
    super.Analisiskuncipintudanjendela(jumlahjendela);
    super.Analisiskeamananruang(kelembapan);  
    
    super.Analisissuhu(suhu, suhu);
    super.hitungbentukruang(panjang, luas, bentuk);
    super.hitungrasioluas(rasio, rasio);
    super.Analisiskeausan(rasio);
    super.Analisiskekokohan(kelembapan);
    super.Analisiskuncipintudanjendela(jumlahjendela);
    
    super.Analisiskebisingan(kelembapan);
    super.Analisiskebocoran(kelembapan);
    super.Analisiskerusakan(kelembapan);
      
}
}

