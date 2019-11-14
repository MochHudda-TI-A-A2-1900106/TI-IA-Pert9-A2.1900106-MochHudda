package Latihan5;
/*Mochammad Hudda
 *TI-IA
 *STMIK Sumedang
 */
public class KambingGlobal {
    //Variable jemlahKambing menjadi variable intstance
    int jumlahKambing = 88;

    //method untuk menampilkan jumlahKambing
    public void getJumlahKambing()
    {
        System.out.println("Jumlah kambing : "+jumlahKambing);
    }
    public void tambahKambing()
    {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+jumlahKambing);
    }
    public static void main(String[]args)
    {
        KambingGlobal kambingSusu = new KambingGlobal();

        //menampilkan jumlah kambing yang ada saat pertama x berjalan
        kambingSusu.getJumlahKambing();

        //menambah satu kambing
        kambingSusu.tambahKambing();

        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}