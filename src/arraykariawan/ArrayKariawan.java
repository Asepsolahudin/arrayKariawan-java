/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraykariawan;

/**
 *
 * @author Apsalboy
 */
public class ArrayKariawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        dataKariawan datakar = new dataKariawan();
        myinput input = new myinput();
        System.out.print("Berapa jumlah kariawan : ");
        datakar.setJmlKariawan(input.bacaInt());
        for (i=0; i<datakar.n; i++)
        {
            System.out.println("Kariawan ke-"+(i+1));
            System.out.print("Masukkan NIK : ");
            datakar.setNIK(i, input.bacaString());
            System.out.print("Masukkan Nama Kariawan : ");
            datakar.setNama(i,input.bacaString());
            System.out.print("Masukkan Gaji Pokok :");
            datakar.setGapok(i, input.bacaInt());
        }
        datakar.tampilData();
    }
    
}
