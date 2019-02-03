/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import java.util.Scanner;
import mobil.source.Base;

/**
 *
 * @author dela
 */
public class Main {
    static boolean isRunning = true;
    
    
    public static void main(String[] args) {
        Base sedan = new Base();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Yang bisa dilakukan:");
            System.out.println("1 => Start\t 4 => Ganti Transmisi");
            System.out.println("2 => Gas\t 5 => Stop");
            System.out.println("3 => Rem\t 6 => Exit");
            
            System.out.println("Masukan opsi pilihan anda:");
            int opsi = input.nextInt();
            switch(opsi){
                case 1:
                    sedan.start();
                    break;
                case 2:
                    if(sedan.isHidup() == false){
                        System.out.println("Mobil masih dalam kondisi mati!");
                    } else {
                        sedan.gas();
                    }
                    break;
                case 3:
                    if(sedan.isHidup() == false){
                        System.out.println("Mobil masih dalam kondisi mati!");
                    } else {
                        sedan.rem();
                    }
                    break;
                case 4:
                    if(sedan.isHidup() == false){
                        System.out.println("Mobil masih dalam kondisi mati!");
                    } else {
                        System.out.println("Masukan transmisi:");
                        int gigi = input.nextInt();
                        sedan.gantiGigi(gigi);
                    }
                    break;
                case 5:
                    sedan.stop();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Perintah salah!");
            }
        } while(isRunning);
    }
}
