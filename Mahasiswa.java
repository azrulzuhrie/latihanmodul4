package lat1modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("putri", "3H","Struktur Data",2820000));
        mhs.put("2", new Mahasiswa("agus", "3A","Matematika",2820012));
        mhs.put("3", new Mahasiswa("arro", "3O","Pemrograman",2820017));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " +data.nim);
        }
    }
}