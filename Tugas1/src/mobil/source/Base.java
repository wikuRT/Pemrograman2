/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil.source;

/**
 *
 * @author dela
 */
public class Base {
    private boolean hidup;
    private int kecAktual;
    private int percepatan;
    private final int kecMaks;

    public boolean isHidup() {
        return hidup;
    }
    
    public Base(){
        hidup = false;
        kecAktual = 0;
        percepatan = 0;
        kecMaks = 160;
    }
    
    public void start(){
        this.hidup = true;
        System.out.println("Mobil menyala!");
    }
    
    public void stop(){
        if(kecAktual == 0){
            this.hidup = false;
            System.out.println("Mobil berhenti dan dimatikan!");
        } else {
            System.out.println("Mobil masih bergerak!");
        }
    }
    
    public void rem(){
        if(kecAktual != 0){
            this.kecAktual = kecAktual/2;
            System.out.println("Direm -> Kecepatan saat ini: " + kecAktual);
        } else {
            System.out.println("Mobil dalam keadaan diam.");
        }
    }
    
    public void gantiGigi(int gigi){
        this.percepatan = gigi*10;
        System.out.println("Transmisi saat ini: " + gigi);
        System.out.println("Percepatan saat ini: " + percepatan);
    }
    
    public void gas(){
        if(percepatan != 0){
            if(kecAktual >= kecMaks){
                System.out.println("Kecepatan anda sudah maksimal!");
                System.out.println("Kecepatan saat ini: " + kecAktual);
            } else {
                this.kecAktual = kecAktual + percepatan;
                System.out.println("Digas -> Kecepatan saat ini: " + kecAktual);
            }
        } else {
            System.out.println("Masukan transmisi terlebih dahulu!");
        }
    }
}
