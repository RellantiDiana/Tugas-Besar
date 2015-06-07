
package TB;

import java.util.Scanner;
public class ControlInput extends RuangKelas implements Interfes {
//
//    public ControlInput(String namaruang, String lokasiruang, String fakultas, String prodi,int panjang, int lebar, int jumlahkursi, int jumlahpintu, int jumlahjendela, int luas, int rasio, int bentuk, int jumlahstopkontak, String kondisistopkontak, String posisistopkontak, int jumlahkabellcd, String kondisikabellcd, String posisikabellcd, int jumlahlampu, String kondisilampu, String posisilampu, int jumlahkipasangin, String kondisikipasangin, String posisikipasangin, int jumlahAC, String kondisiAC, String posisiAC, String pilihSSID, int bandwidth, int jumlahCCTV, String kondisiCCTV, String posisiCCTV, String kondisilantai, String kondisidinding, String kondisiatap, String kondisipintu, String kondisijendela, String sirkulasiudara, int pencahayaan, int kelembapan, int suhu, String kebisingan, String bau, String kebocoran, String kerusakan, String keausan, String kekokohan, String kuncipintudanjendela, String bahaya) {
//        super(namaruang, lokasiruang, fakultas, panjang, lebar, jumlahkursi, jumlahpintu, jumlahjendela, luas, rasio, bentuk, jumlahstopkontak, kondisistopkontak, posisistopkontak, jumlahkabellcd, kondisikabellcd, posisikabellcd, jumlahlampu, kondisilampu, posisilampu, jumlahkipasangin, kondisikipasangin, posisikipasangin, jumlahAC, kondisiAC, posisiAC, pilihSSID, bandwidth, jumlahCCTV, kondisiCCTV, posisiCCTV, kondisilantai, kondisidinding, kondisiatap, kondisipintu, kondisijendela, sirkulasiudara, pencahayaan, kelembapan, suhu, kebisingan, bau, kebocoran, kerusakan, keausan, kekokohan, kuncipintudanjendela, bahaya);
//    }

    
double hitungluas(int panjang , int lebar){
luas=panjang*lebar;
return luas;
}

double hitungrasio(int luas , int jumlahkursi){
rasio= luas/jumlahkursi;
return rasio;
}

//double hitungbentukruang(){
//if(panjang != luas){
//System.out.println("persegi panjang");
//System.out.println("SESUAI");
//}else{
//System.out.println("TIDAK SESUAI");
//}
//return hitungbentukruang;
//}

//double hitungrasioluas(int rasio, double hitungrasioLuas){
//if (rasio>=2){
//System.out.println("SESUAI");
//}else{
//System.out.println("TIDAK SESUAI");
//}
//return hitungrasioLuas;
//}

double Analisisjumlahpintu(int jumlahpintu, double Analisisjumlahpintu){
if (jumlahpintu>=2){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisisjumlahpintu;
}

double Analisisjumlahjendela(int jumlahjendela, double Analisisjumlahjendela){
if (jumlahjendela>=1){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisisjumlahjendela;
}

double Analisisjumlahstopkontak(int jumlahstopkontak, double Analisisjumlahstopkontak ){
if (jumlahstopkontak>=4){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisisjumlahstopkontak;
}

double Analisiskondisistopkontak(int jumlahstopkontak, String kondisistopkontak, double Analisiskondisistopkontak){
if (jumlahstopkontak==4 &&kondisistopkontak.equals("Baik")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisiskondisistopkontak;
}

double Analisisposisistopkontak(String posisistopkontak, double Analisisposisistopkontak ){
if (posisistopkontak.equals("Pojok ruangan") && posisistopkontak.equals("Dekat dosen")){
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
return Analisiskondisikabellcd;
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

double Analisiskondisilampu(String kondisilampu, double Analisiskondisilampu){
if (kondisilampu.equals("Baik")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisiskondisilampu;
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

double Analisisjumlahkipasangin(int jumlahkipasangin, double Analisisjumlahkipasangin ){
if (jumlahkipasangin>=2){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisisjumlahkipasangin;
}
double Analisiskondisikipasangin(int jumlahkipasangin, String kondisikipasangin, double Analisiskondisikipasangin){
if (kondisikipasangin.equals("Baik") && jumlahkipasangin==2){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisiskondisikipasangin;
}

double Analisisposisikipasangin(String posisikipasangin, double Analisisposisikipasangin){
if (posisilampu.equals("Atap ruangan")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisisposisikipasangin;
}

double AnalisisjumlahAC(int jumlahAC,double AnalisisjumlahAC ){
if (jumlahAC>=1){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return AnalisisjumlahAC;
}

double AnalisiskondisiAC(int jumlahAC, String kondisiAC, double AnalisiskondisiAC){
if (kondisiAC.equals("Baik") && jumlahAC==2){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return AnalisiskondisiAC;
}

double AnalisisposisiAC(String posisiAC, double AnalisisposisiAC){
if (posisilampu.equals("Belakang") && posisilampu.equals("Samping")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return AnalisisposisiAC;
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

double Analisislogininternet(String pilihSSID, double Analisislogininternet){
if (pilihSSID.equals("Bisa login")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return Analisislogininternet ;
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

double AnalisiskondisiCCTV(String kondisiCCTV, double AnalisiskondisiCCTV){
if (kondisiCCTV.equals("Baik")){
System.out.println("Sesuai");
}
else {
System.out.println("Tidak sesuai");
}
return AnalisiskondisiCCTV;
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

double Analisissirkulasiudara(String sirkulasiudara, double Analisissirkulasiudara){
if (sirkulasiudara.equals("Lancar")){
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
double Analisiskebisingan (double Analisiskebisingan){
int c=0;
if (c==1){
System.out.println("Tidak Sesuai");
}
if (c==2){
System.out.println("Sesuai");
}
return Analisiskebisingan;
}


double Analisisbau(double Analisisbau){
int d=0;
if (d==1){
System.out.println("Tidak Sesuai");
}
if (d==2){
System.out.println("Sesuai");
}
return Analisisbau;
}

double Analisiskebocoran(double Analisiskebocoran){
int e=0;
if (e==1){
System.out.println("Tidak Sesuai");
}
if (e==2){
System.out.println("Sesuai");
}
return Analisiskebocoran;
}

double Analisiskerusakan(double Analisiskerusakan){
int f=0;
if (f==1){
System.out.println("Tidak Sesuai");
}
if (f==2){
System.out.println("Sesuai");
}
return Analisiskerusakan;
}

double Analisiskeausan(double Analisiskeausan){
int g=0;
if (g==1){
System.out.println("Tidak Sesuai");
}
if (g==2){
System.out.println("Sesuai");
}
return Analisiskeausan;
}

//keamanan
double Analisiskekokohan(double Analisiskekokohan){
int h=0;
if (h==1){
System.out.println("Tidak Sesuai");
}
if (h==2){
System.out.println("Sesuai");
}
return Analisiskekokohan;
}
double Analisiskuncipintudanjendela(double Analisiskuncipintudanjendela){
int i=0;
if (i==1){
System.out.println("Tidak Sesuai");
}
if (i==2){
System.out.println("Sesuai");
}
return Analisiskuncipintudanjendela;
}
double Analisiskeamananruang(double Analisiskeamananruang){
    int j=0;
    if (j==1){
        System.out.println("Tidak Sesuai");
    }
    if (j==2){
        System.out.println("Sesuai");
    }
    return Analisiskeamananruang;
}

@Override
public String kebisingan(){
int c = 0;
if(c==1){
System.out.println("TIDAK SESUAI");
}
if(c==2){
System.out.println("SESUAI");
}
return kebisingan;
}
@Override
public String bau(){
int d=0;
if (d==1){
System.out.println("TIDAK SESUAI");
}
if (d==2){
System.out.println("SESUAI");
}
return bau;
}
@Override
public String kebocoran(){
int e=0;
if (e==1){
System.out.println("TIDAK SESUAI");
}
if (e==2){
System.out.println("SESUAI");
}
return kebocoran;
}
@Override
public String kerusakan(){
int f=0;
if (f==1){
System.out.println("TIDAK SESUAI");
}
if (f==2){
System.out.println("SESUAI");
}
return kerusakan;
}
@Override
public String keausan(){
int g=0;
if (g==1){
System.out.println("TIDAK SESUAI");
}
if (g==2){
System.out.println("SESUAI");
}
return keausan;
}

    @Override
    public void Cetak() {
        
    }
} 
