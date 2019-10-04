/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan29;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan29 {

    /**
     */
    
    //Text
    public static final String TXT_MERAH    = "\u001B[31m";
    public static final String TXT_HIJAU  = "\u001B[32m";
    public static final String TXT_KUNING = "\u001B[33m";
    public static final String TXT_BIRU   = "\u001B[34m";
    public static final String TXT_UNGU = "\u001B[35m";
    public static final String TXT_CYAN = "\u001B[46m";
    public static final String TXT_PUTIH  = "\u001B[37m";
    public static final String DEFAULT  = "\u001B[0m";
    
    //Background
    public static final String BG_MERAH = "\u001B[41m";
    public static final String BG_HIJAU = "\u001B[42m";
    public static final String BG_KUNING = "\u001B[43m";
    public static final String BG_BIRU = "\u001B[44m";
    public static final String BG_UNGU = "\u001B[45m";
    public static final String BG_PUTIH = "\u001B[47m";
    
    public static final String pribadi_merah[] = {
        "Periang,","Pemberani,","Berani mengambil resiko dalam setiap langkah,","Menyukai tantangan,","Kurang sabar,","Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,","Memiliki energi kehangatan dan cinta."
    };
    
    public static final String pribadi_hijau[] = {
        "Romantis,","Menyukai hal yang berbau alami dan keindahan,","Teguh pada prinsip,","Menginginkan kesempurnaan,","Mudah cemburu,","Mudah merasa iri,","Menjunjung tinggi suatu nilai toleransi dan kepercayaan."
    };
    
    public static final String pribadi_kuning[] = {
        "Optimis,","Suka bergaul,","Periang,","Senang menolong,","Lincah dan aktif,","Tidak suka meremehkan kekurangan orang lain,","Loyal,","Hangat,","Meskipun karakternya optimis dan idealis, sering kali goyah dan tidak stabil,","Cenderung penakut."
    };
    
    public static final String pribadi_biru[] = {
        "Menyenangkan,","Bijaksana,","Pembawaan diri tenang saat menghadapi masalah,","Dinamis,","Senang Berbagi,","Bersahabat,","Tidak terlalu suka menjadi sorotan banyak orang,","Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."
    };
    
    public static final String pribadi_ungu[] = {
        "Optimis,","Tidak pernah ragu,","Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,","Memiliki ambisi yang besar,","Memiliki empati yang besar,","Memiliki sisi misterius sebab seringkali menutup perasaannya,","Terkadang bersikap keras kepala dan angkuh."
    };
    
    public static void kepribadian(String[] warna){
        int jml = warna.length;
        for (int i = 0; i < jml; i++) {
            System.out.println((i+1)+". "+warna[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(TXT_MERAH+"YUK "+TXT_HIJAU+"CEK "+TXT_KUNING+"KEPRIBADIANMU "+TXT_CYAN+"DARI "+TXT_UNGU+"WARNA "+TXT_BIRU+"FAVORITMU");
        System.out.println(DEFAULT+TXT_PUTIH);
        System.out.println(BG_MERAH+"       MERAH      ");
        System.out.println(BG_HIJAU+"       HIJAU      ");
        System.out.println(BG_KUNING+"      KUNING      ");
        System.out.println(BG_BIRU+"       BIRU       ");
        System.out.println(BG_UNGU+"       UNGU       "+DEFAULT);
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warna = sc.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        String nama = sc.next();
        System.out.println("\n===HASIL TEST KEPRIBADIAN "+nama+"===");
        switch (warna.toLowerCase()) {
            case "merah":
                System.out.println("Warna Favoritmu adalah "+TXT_MERAH+warna+DEFAULT);
                kepribadian(pribadi_merah);
                break;
            case "hijau":
                System.out.println("Warna Favoritmu adalah "+TXT_HIJAU+warna+DEFAULT);
                kepribadian(pribadi_hijau);
                break;
            case "kuning":
                System.out.println("Warna Favoritmu adalah "+TXT_KUNING+warna+DEFAULT);
                kepribadian(pribadi_kuning);
                break;
            case "biru":
                System.out.println("Warna Favoritmu adalah "+TXT_BIRU+warna+DEFAULT);
                kepribadian(pribadi_biru);
                break;
            case "ungu":
                System.out.println("Warna Favoritmu adalah "+TXT_UNGU+warna+DEFAULT);
                kepribadian(pribadi_ungu);
                break;
            default:
                System.out.println(DEFAULT+"Oops... Belum Teridentifikasi");
                break;
        }
    }
    
}
