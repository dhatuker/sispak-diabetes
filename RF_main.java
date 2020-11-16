/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diabetproject;

import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;
/**
 *
 * @author Robot
 */
public class RF_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "diabetes_data_upload.csv";
        String line = "";
        /*ArrayList 1 dimensi*/ 
        ArrayList<String> data_tr = new ArrayList<String>( );
        /*Scanner tidak bisa baca whitespace, whitespace dianggap pemotong*/
//        File file = new File(filename);
//        try {
//            Scanner inputData = new Scanner(file);
//            while (inputData.hasNext()){
//                String data = inputData.next();                
//                data.split(",");
//                System.out.println(data);
//            }
//            inputData.close();
//            // TODO code application logic here
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
        /*Pakai BufferedReader agar spasi bisa dimasukkan*/
        try {
            BufferedReader read = new BufferedReader(new FileReader(filename));
            while((line = read.readLine()) != null) {
                System.out.println(line);
                data_tr.add(line);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        /*Coba cek arraylist data_tr ke 5*/
        System.out.println("");
        System.out.println(data_tr.get(5));
    }
    
}
