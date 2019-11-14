package Latihan3;

import java.util.Scanner;

/*Mochammad Hudda
 *TI-IA
 *STMIK Sumedang
 */
public class LatihanPBO2Input {
    public static void main(String[]args)
    {
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
}
