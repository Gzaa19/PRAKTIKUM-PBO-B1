/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author hp
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        int total = senjata.getPeluru() + jumlah;
        senjata.setPeluru(total);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");

        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
        }

        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println(">> Siap menusuk");
        } else {
            System.out.println(">> Belum bisa menusuk");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}