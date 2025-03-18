package rocks.zipcode.formattingbookinfo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class BookInfo {

    public static void main(String[] args) throws IOException {

        String path = "./src/main/books.txt";
        String outPath = "./src/main/out.txt";

        String content = "";
        try {

            content = Files.readString(Path.of(path));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        formatLine(content);
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
