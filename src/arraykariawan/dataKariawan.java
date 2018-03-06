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
public class dataKariawan {
    private String[] nik = new String[100];
    private String[] nama = new String[100];
    private int[]gapok = new int[100];
    public int n;
    private float max,min;
    
    public void setNIK(int i, String x)
    {
        this.nik[i] = x;
    }
    public void setNama (int i,String x)
    {
        this.nama[i] = x;
    }
    public void setGapok(int i, int x)
    {
        this.gapok[i]= x;
    }
    public void setJmlKariawan(int x)
    {
        this.n = x;
    }
    public float rerataGapok()
    {
        int sum = 0, i;
        for(i=0; i<this.n; i++)
        {
            sum += this.gapok[i];
        }
        return sum/this.n;
    }
    public float setGajiMax()
    {
        int i;
        this.max = this.gapok[0];
        for (i=0; i<this.n;i++)
        {
            if (this.max < this.gapok[i])
            {
                this.max = this.gapok[i];
            }
            else
            {
                this.max = this.max;
            }
        }
        return this.max;
    }
    public void tampilData()
    {
        int i;
        System.out.println("========================================================");
        System.out.println("NIK     NAMA KARIAWAN                       GAJI POKOK");
        System.out.println("========================================================");
        for (i=0; i<this.n; i++)
        {
            System.out.println(String.format("%-7s %-35s Rp.%6d", this.nik[i],this.nama[i],this.gapok[i]));
        }
        System.out.println("========================================================");
        System.out.println("Rata-rata gaji pokok dari "+this.n+" kariawan adalah Rp."+this.rerataGapok());
    }
}
