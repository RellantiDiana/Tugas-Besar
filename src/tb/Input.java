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
public Input (String namaruang,String lokasiruang,String fakultas,int panjang,
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
super ( namaruang,lokasiruang, fakultas, panjang,
 lebar, jumlahkursi, jumlahpintu, jumlahjendela, luas, rasio,
 bentuk, jumlahstopkontak, kondisistopkontak, posisistopkontak,
 jumlahkabellcd, kondisikabellcd, posisikabellcd, jumlahlampu,
 kondisilampu, posisilampu, jumlahkipasangin, kondisikipasangin,
 posisikipasangin, jumlahAC, kondisiAC, posisiAC, pilihSSID, bandwidth,
 jumlahCCTV, kondisiCCTV, posisiCCTV, kondisilantai,
 kondisidinding, kondisiatap, kondisipintu, kondisijendela,
 inputsirkulasiudara, pencahayaan, kelembapan, suhu,
 kebisingan, bau, kebocoran, kerusakan, keausan, kekokohan, kuncipintudanjendela, bahaya);}

public void Insert (){
Scanner in = new Scanner (System.in);
// inputan identitas ruang kelas
System.out.println("Masukkan nama ruang :");
this.namaruang=in.next();
System.out.println("Masukkan lokasi ruang :");
this.lokasiruang=in.next();
System.out.println("Masukkan fakultas :");
this.fakultas=in.next();
// inputan kondisi ruang kelas
System.out.println("Masukkan panjang ruang :");
this.panjang=in.nextInt();
System.out.println("Masukkan lebar ruang :");
this.lebar=in.nextInt();
System.out.println("Masukkan jumlah kursi :");
this.jumlahkursi=in.nextInt();
System.out.println("Masukkan jumlah pintu :");
this.jumlahpintu=in.nextInt();
System.out.println("Masukkan jumlah jendela :");
this.jumlahjendela=in.nextInt();
// inputan jumlah,kondisi,posisi sarana
System.out.println("Masukkan jumlah stopkontak :");
this.jumlahstopkontak=in.nextInt();
System.out.println("Masukkan kondisi stopkontak :");
this.kondisistopkontak=in.next();
System.out.println("Masukkan posisi stopkontak:");
this.posisistopkontak=in.next();
System.out.println("Masukkan jumlah kabellcd :");
this.jumlahkabellcd=in.nextInt();
System.out.println("Masukkan kondisi kabellcd:");
this.kondisikabellcd=in.next();
System.out.println("Masukkan posisi kabellcd:");
this.posisikabellcd=in.next();
System.out.println("Masukkan jumlah lampu :");
this.jumlahlampu=in.nextInt();
System.out.println("Masukkan kondisi lampu:");
this.kondisilampu=in.next();
System.out.println("Masukkan posisi lampu:");
this.posisilampu=in.next();
System.out.println("Masukkan jumlah kipasangin :");
this.jumlahkipasangin=in.nextInt();
System.out.println("Masukkan kondisi :");
this.kondisikipasangin=in.next();
System.out.println("Masukkan posisi :");
this.posisikipasangin=in.next();
System.out.println("Masukkan jumlah AC:");
this.jumlahAC=in.nextInt();
System.out.println("Masukkan kondisi AC:");
this.kondisiAC=in.next();
System.out.println("Masukkan posisi AC:");
this.posisiAC=in.next();
System.out.println("Masukkan SSID:");
this.pilihSSID=in.next();
System.out.println("Masukkan bandwidth :");
this.bandwidth=in.nextInt();
System.out.println("Masukkan jumlah CCTV:");
this.jumlahCCTV=in.nextInt();
System.out.println("Masukkan kondisi CCTV:");
this.kondisiCCTV=in.next();
System.out.println("Masukkan posisi CCTV:");
this.posisiCCTV=in.next();
//inputan lingkungan ruang kelas
System.out.println("Masukkan kondisi lantai:");
this.kondisilantai=in.next();
System.out.println("Masukkan kondisi dinding:");
this.kondisidinding=in.next();
System.out.println("Masukkan kondisi atap:");
this.kondisiatap=in.next();
System.out.println("Masukkan kondisi pintu:");
this.kondisipintu=in.next();
System.out.println("Masukkan kondisi jendela:");
this.kondisijendela=in.next();
//inputan kebersihan ruang kelas
System.out.println("Masukkan kondisi sirkulasiudara:");
this.inputsirkulasiudara=in.next();
System.out.println("Masukkan pencahayaan :");
this.pencahayaan=in.nextInt();
System.out.println("Masukkan kelembapan :");
this.kelembapan=in.nextInt();
System.out.println("Masukkan suhu :");
this.suhu=in.nextInt();
//inputan kenyamanan ruangkelas
System.out.println("Masukkan kebisingan :");
this.kebisingan=in.next();
System.out.println("Masukkan bau :");
this.bau=in.next();
System.out.println("Masukkan kebocoran :");
this.kebocoran=in.next();
System.out.println("Masukkan kerusakan :");
this.kerusakan=in.next();
System.out.println("Masukkan keausan :");
this.keausan=in.next();
//inputan keamanan ruangkelas
System.out.println("Masukkan kekokohan :");
this.kekokohan=in.next();
System.out.println("Masukkan kuncipintudankelas :");
this.kuncipintudanjendela=in.next();
System.out.println("Masukkan bahaya :");
System.out.println("1.Tidak aman");
System.out.println("2.Aman");
this.bahaya=in.next();
}

@Override
public void Cetak() {
System.out.println("Nama ruang: " + getNamaruang());
System.out.println("Lokasi ruang: " + getLokasiruang());
System.out.println("Fakultas: " + getFakultas());
System.out.println("Luas : " + luas);
System.out.println("Rasio luas : " + rasio);

}
}
