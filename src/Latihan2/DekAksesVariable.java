package Latihan2;
/*Mochammad Hudda
 *TI-IA
 *STMIK Sumedang
 */
public class DekAksesVariable {
    public static void main(String[]args)
    {
        //deklarasi
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLog;
        char nilaiKar;

        //memberi nilai ke var
        nilaiInt = 78;
        nilaiLog = false;
        nilaiKar = 'D';

        //menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLog);
        System.out.println("Isi variabel karakter = " + nilaiKar);
    }
}
