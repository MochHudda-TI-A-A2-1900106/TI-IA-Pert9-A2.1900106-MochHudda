package Latihan6;
/*Mochammad Hudda
 *TI-IA
 *STMIK Sumedang
 */
public class KambingStatic {
    //nama_kambing sebagai konstata
    public static final String nama_kambing = "Midun";

    public static void main(String []args)
    {
        Mamalia.jumlahKambing = 485000;
        System.out.println(nama_kambing + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
}
