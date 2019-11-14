package Latihan4;
/*Mochammad Hudda
 *TI-IA
 *STMIK Sumedang
 */
public class Kambing {
    public void tambahKambing()
    {
        //deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : "+jumlahKambing);
    }
    public static void main(String[]args)
    {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
