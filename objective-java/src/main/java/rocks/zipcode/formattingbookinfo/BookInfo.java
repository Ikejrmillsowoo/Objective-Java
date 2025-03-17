package rocks.zipcode.formattingbookinfo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInfo {

    public static void main(String[] args) throws IOException {

        String path = "books.txt";
        String outPath = "./src/main/out.txt";
        //File file = new File(path);

//        FileReader fr = new FileReader(path);
//        int i;
//        while ((i=fr.read())!= -1){
//            System.out.println((char) i);
//        }
        StringBuilder sb = new StringBuilder();
       try{
           File file = new File(path);
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()){
               String line = sc.nextLine();
               System.out.println(line);
           }
           sc.close();
       } catch (Exception e){
           e.printStackTrace();
       }

    }

    public static String formatLine(String line) {
        System.out.println(line);
        String formattedLine = null;

        return formattedLine;
    }

    public static ArrayList filetoList(String path) throws IOException {
        ArrayList list = new ArrayList();

        return list;
    }

    public static void listToFile(ArrayList<String> list, String path) throws IOException {

    }

    public static String convertPriceToEuros(double price) {
        String priceEuros = null;

        return priceEuros;

    }

    public static String formatToDollars(Double price) {
        String priceUSD = null;

        return priceUSD;

    }

}
