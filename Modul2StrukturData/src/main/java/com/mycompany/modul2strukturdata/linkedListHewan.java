/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul2strukturdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class linkedListHewan {

    ArrayList<String> namaHewan = new ArrayList<>(
            List.of("Sapi", "Kelinci", "Kambing", "Unta", "Domba")
    );

    public void hapusHewan(String del) {
        namaHewan.remove(del);
    }

    public void tambahHewan(String add) {
        namaHewan.add(add);
    }

    public void tampilHewan() {
        for (String hewan : namaHewan) {
            System.out.print(hewan + " ");
        }
    }

    public static void main(String[] args) {
        linkedListHewan linkedList = new linkedListHewan();
        linkedList.tampilHewan();

        Scanner scn = new Scanner(System.in);
        System.out.print("\nMasukkan nama hewan yang ditambah: ");
        String addHewan = scn.nextLine();

        linkedList.tambahHewan(addHewan);
        linkedList.tampilHewan();

        System.out.print("\nMasukkan nama hewan yang dihapus: ");
        String delHewan = scn.nextLine();

        linkedList.hapusHewan(delHewan);
        linkedList.tampilHewan();
    }
}
