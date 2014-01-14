/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

created by achmad sayfudin pens 2012 |luntas ilmu
 */

package Penjadwalan_Cpu;
import java.io.*;
 import java.util.Scanner;
class OperasiIO {
  
   

   public static void main(String[] args) throws IOException{
       Scanner scan = new Scanner(System.in);
       String nama,line,alamat;
   
    try
    {
        String filename= "MyFile.txt";
        FileWriter fw = new FileWriter(filename,true); //true digunakan untuk metode file append
        System.out.print("nama = ");
        nama = scan.nextLine();
        System.out.print("alamat = ");
        alamat = scan.next();
        fw.write(nama);//appends apa string yang disimpan
        fw.write("\t" +alamat+ "\n");
        fw.close();
        //untuk baca file
        System.out.println("-----------------------");
        System.out.println("nama\t alamat");
        FileReader fr =new FileReader(filename);
        BufferedReader bf = new BufferedReader(fr);
        while((line=bf.readLine()) != null){
            System.out.println(line);
        }
    }
    catch(IOException ioe)
    {
        System.err.println("IOException: " + ioe.getMessage());
    }
          
    }
}
