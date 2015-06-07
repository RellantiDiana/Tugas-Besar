/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package TB;
/**
*
* @author putri
*/
import java.util.Scanner;
public class Input extends RuangKelas {
//public Input (String namaruang,String lokasiruang,String fakultas,int panjang,
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
// super ( namaruang,lokasiruang, fakultas,panjang,
// lebar, jumlahkursi, jumlahpintu, jumlahjendela, luas, rasio,
// bentuk, jumlahstopkontak, kondisistopkontak, posisistopkontak,
// jumlahkabellcd, kondisikabellcd, posisikabellcd, jumlahlampu,
// kondisilampu, posisilampu, jumlahkipasangin, kondisikipasangin,
// posisikipasangin, jumlahAC, kondisiAC, posisiAC, pilihSSID, bandwidth,
// jumlahCCTV, kondisiCCTV, posisiCCTV, kondisilantai,
// kondisidinding, kondisiatap, kondisipintu, kondisijendela, sirkulasiudara, pencahayaan, kelembapan, suhu,
// kebisingan, bau, kebocoran, kerusakan, keausan, kekokohan, kuncipintudanjendela, bahaya);}

public void Insert (){
Scanner in = new Scanner (System.in);
// inputan identitas ruang kelas
System.out.println("Masukkan Nama ruang :");
this.namaruang=in.next();
System.out.println("Masukkan Lokasi ruang :");
this.lokasiruang=in.next();
System.out.println("Fakultas");
this.fakultas=in.next();

// inputan kondisi ruang kelas
System.out.println("Masukkan Panjang ruang :");
this.panjang=in.nextInt();
System.out.println("Masukkan Lebar ruang :");
this.lebar=in.nextInt();
System.out.println("Masukkan Jumlah kursi :");
this.jumlahkursi=in.nextInt();
System.out.println("Masukkan Jumlah pintu :");
this.jumlahpintu=in.nextInt();
System.out.println("Masukkan Jumlah jendela :");
this.jumlahjendela=in.nextInt();
// inputan jumlah,kondisi,posisi sarana
System.out.println("Masukkan Jumlah stop kontak :");
this.jumlahstopkontak=in.nextInt();
System.out.println("Masukkan Kondisi stopkontak :");
System.out.println("1.Baik");
System.out.println("2.Tidak Baik");
this.kondisistopkontak=in.next();
System.out.println("Masukkan Posisi stopkontak:");
System.out.println("1.Pojok Ruangan dan Dekat Dosen");
System.out.println("2.Lainya");
this.posisistopkontak=in.next();
System.out.println("Masukkan Jumlah kabellcd :");
this.jumlahkabellcd=in.nextInt();
System.out.println("Masukkan Kondisi kabellcd:");
System.out.println("1.Berfungsi");
System.out.println("2.Tidak Berfungsi");
this.kondisikabellcd=in.next();
System.out.println("Masukkan Posisi kabellcd:");
System.out.println("1.Dekat Dosen");
System.out.println("2.Lainya");
this.posisikabellcd=in.next();
System.out.println("Masukkan Jumlah lampu :");
this.jumlahlampu=in.nextInt();
System.out.println("Masukkan Kondisi lampu:");
System.out.println("1.Baik");
System.out.println("2.Tidak Baik");

this.kondisilampu=in.next();
System.out.println("Masukkan Posisi lampu:");
System.out.println("1.Atap ruangan");
System.out.println("2.Lainya");
this.posisilampu=in.next();
System.out.println("Masukkan Jumlah kipasangin :");
this.jumlahkipasangin=in.nextInt();
System.out.println("Masukkan Kondisi kipasangin :");
System.out.println("1.Baik");
System.out.println("2.Tidak Baik");
this.kondisikipasangin=in.next();
System.out.println("Masukkan posisi kipasangin :");
System.out.println("1.Atap Ruangan");
System.out.println("2.Lainya");
this.posisikipasangin=in.next();

System.out.println("Masukkan Jumlah AC:");
this.jumlahAC=in.nextInt();

System.out.println("Masukkan Kondisi AC:");
System.out.println("1.Baik");
System.out.println("2.Tidak Baik");
this.kondisiAC=in.next();

System.out.println("Masukkan Posisi AC:");
System.out.println("1.Belakang dan Samping");
System.out.println("2.Lainya");
this.posisiAC=in.next();

System.out.println("Masukkan SSID:");
System.out.println("1.UMM Hotspot");
System.out.println("2.Lainya");
this.pilihSSID=in.next();

System.out.println("Masukkan Bandwidth :");
System.out.println("1.Bisa Login");
System.out.println("2.Tidak bisa Login");
this.bandwidth=in.nextInt();
System.out.println("Masukkan Jumlah CCTV:");
this.jumlahCCTV=in.nextInt();
System.out.println("Masukkan Kondisi CCTV:");
System.out.println("1.Baik");
System.out.println("2.Tidak Baik");
this.kondisiCCTV=in.next();
System.out.println("Masukkan Posisi CCTV:");
System.out.println("1.Depan dan Belakang");
System.out.println("2.Lainya");
this.posisiCCTV=in.next();
//inputan lingkungan ruang kelas
System.out.println("Masukkan Kondisi lantai:");
System.out.println("1.Bersih");
System.out.println("2.Tidak Bersih");
this.kondisilantai=in.next();
System.out.println("Masukkan Kondisi dinding:");
System.out.println("1.Bersih");
System.out.println("2.Tidak Bersih");
this.kondisidinding=in.next();
System.out.println("Masukkan Kondisi atap:");
System.out.println("1.Bersih");
System.out.println("2.Tidak Bersih");
this.kondisiatap=in.next();
System.out.println("Masukkan Kondisi pintu:");
System.out.println("1.Bersih");
System.out.println("2.Tidak Bersih");
this.kondisipintu=in.next();
System.out.println("Masukkan Kondisi jendela:");
System.out.println("1.Bersih");
System.out.println("2.Tidak Bersih");
this.kondisijendela=in.next();

//inputan kebersihan ruang kelas
System.out.println("Masukkan sirkulasiudara:");
System.out.println("1.Lancar");
System.out.println("2.Tidak Lancar");
this.sirkulasiudara=in.next();
System.out.println("Masukkan Pencahayaan :");
this.pencahayaan=in.nextInt();
System.out.println("Masukkan Kelembapan :");
this.kelembapan=in.nextInt();
System.out.println("Masukkan Suhu :");;
this.suhu=in.nextInt();
//inputan kenyamanan ruangkelas
System.out.println("Masukkan Kebisingan :");
System.out.println("1.Tidak Bising");
System.out.println("2.Bising");
this.kebisingan=in.next();
System.out.println("Masukkan Bau :");
System.out.println("1.Tidak Bau");
System.out.println("2.Bau");
this.bau=in.next();
System.out.println("Masukkan Kebocoran :");
System.out.println("1.Tidak Bocor");
System.out.println("2.Bocor");
this.kebocoran=in.next();
System.out.println("Masukkan Kerusakan :");
System.out.println("1.Tidak Rusak");
System.out.println("2.Rusak");
this.kerusakan=in.next();
System.out.println("Masukkan Keausan :");
System.out.println("1.Tidak Aus");
System.out.println("2.Aus");
this.keausan=in.next();
//inputan keamanan ruangkelas
System.out.println("Masukkan Kekokohan :");
System.out.println("1.Kokoh");
System.out.println("2.Tidak kokoh");
this.kekokohan=in.next();
System.out.println("Masukkan KunciPintudanJendela :");
System.out.println("1.Ada");
System.out.println("2.Tidak ada");
this.kuncipintudanjendela=in.next();
System.out.println("Masukkan Bahaya :");
System.out.println("1.Aman");
System.out.println("2.Tidak Aman");
this.bahaya=in.next();
}

@Override
public void Cetak() {
System.out.println("Nama ruang: " + getNamaruang());
System.out.println("Lokasi ruang: " + getLokasiruang());
System.out.println("Fakultas: " + getFakultas());
System.out.println("Panjang :"+ getPanjang());
System.out.println("Lebar :"+ getLebar());
System.out.println("Jumlah Kursi :"+ getJumlahkursi());
System.out.println("Jumlah Pintu : " + getJumlahpintu());
System.out.println("Jumlah Jendela : " + getJumlahjendela());
System.out.println("Luas : " + luas);
System.out.println("Rasio luas : " + rasio);
System.out.println("Jumlah Stopkontak : " + getJumlahstopkontak());
System.out.println("Kondisi Stopkontak : " + getKondisistopkontak());
System.out.println("Posisi Stopkontak : " + getPosisistopkontak());
System.out.println("Jumlah Kabel LCD : " + getJumlahkabellcd());
System.out.println("Kondisi Kabel LCD : " + getKondisikabellcd());
System.out.println("Posisi Kabel LCD : " + getPosisikabellcd());
System.out.println("Jumlah Lampu : " + getJumlahlampu());
System.out.println("Kondisi Lampu : " + getKondisilampu());
System.out.println("Posisi Lampu : " + getPosisilampu());
System.out.println("Jumlah AC : " + getJumlahAC());
System.out.println("Kondisi AC : " + getKondisiAC());
System.out.println("Posisi AC : " + getPosisiAC());
System.out.println("SSID: " + getPilihSSID());
System.out.println("Bandwidth : " + getBandwidth());
System.out.println("Jumlah CCTV : " + getJumlahCCTV());
System.out.println("Kondisi CCTV : " + getKondisiCCTV());
System.out.println("Posisi CCTV : " + getPosisiCCTV());
System.out.println("Kondisi Lantai : " + getKondisilantai());
System.out.println("Kondisi Dinding : " + getKondisidinding());
System.out.println("Kondisi Atap : " + getKondisiatap());
System.out.println("Kondisi Pintu : " + getKondisipintu());
System.out.println("Kondisi Jendela : " + getKondisijendela());
System.out.println("Sirkulasi Udara : " + getSirkulasiudara());
System.out.println("Pencahayaab : " + getPencahayaan());
System.out.println("Kelembapan : " + getKelembapan());
System.out.println("Suhu : " + getSuhu());
System.out.println("Kebisingan : " + getKebisingan());
System.out.println("Bau : " + getBau());
System.out.println("Kebocoran : " + getKebocoran());
System.out.println("Kerusakan : " + getKerusakan());
System.out.println("Keausan : " + getKeausan());
System.out.println("Kekokohan : " + getKekokohan());
System.out.println("Kunci Pintu dan Jendela : " + getKuncipintudanjendela());
System.out.println("Bahaya : " + getBahaya());
}

}
