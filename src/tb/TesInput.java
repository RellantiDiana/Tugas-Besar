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
public class TesInput extends ControlInput {
    
public static void main (String [] args){
public TesInput (String namaruang,String lokasiruang,String fakultas,int panjang,
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
    
    super.AnalisisLogininternet(pilihSSID, jumlahstopkontak);
    super.Analisisinternet(pilihSSID, jumlahpintu);
    super.AnalisisjumlahCCTV(jumlahCCTV, jumlahCCTV);
    super.Analisisjumlahkabellcd(jumlahkabellcd, jumlahkabellcd);
    super.Analisisjumlahkipas(jumlahkipasangin, jumlahpintu);
    super.Analisisjumlahlampu(jumlahlampu, jumlahlampu);
    super.Analisiskebersihan(suhu, kelembapan);
    super.Analisiskelembapan(kelembapan, kelembapan);
    super.Analisiskondisikabellcd(kondisikabellcd, jumlahkabellcd);
    super.Analisiskondisikipasangin(jumlahkipasangin, kondisikipasangin, jumlahkipasangin);
    super.Analisiskondisistopkontak(jumlahstopkontak, kondisistopkontak, jumlahstopkontak);
    super.Analisispencahayaan(pencahayaan, pencahayaan);
    super.Analisispintu(jumlahpintu, jumlahpintu);
    super.AnalisisposisiCCTV(posisiCCTV, jumlahCCTV);
    super.Analisisposisikabellcd(posisikabellcd, jumlahkabellcd);
    super.Analisisposisilampu(posisilampu, jumlahlampu);
    super.Analisisposisistopkontak(posisistopkontak, jumlahstopkontak);
    super.Analisissirkulasiudara(inputsirkulasiudara, jumlahkursi);
    super.Analisisstopkontak(jumlahstopkontak, jumlahstopkontak);
    super.Analisissuhu(suhu, suhu);
    super.Bau();
    super.HitungBentukRuang(panjang, luas, bentuk);
    super.HitungRasioLuas(rasio, rasio);
    super.Keausan();
    super.Keausan(rasio);
    super.Kebisingan();
    super.Kebocoran();
    super.Kekokohan();
    super.Kekokohan();
    super.Kekokohan(kelembapan);
    super.Kerusakan();
    super.KunciPintudanJendela(jumlahjendela);
    super.bau(suhu);
    super.hitungluas(panjang, lebar, luas);
    super.hitungrasio(rasio, luas, jumlahkursi);
    super.kebisingan(kelembapan);
    super.kebocoran(kelembapan);
    super.kerusakan(kelembapan);
      
}
}
}


