package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("Eng.txt");

        writer.write("1: Aa\n");
        writer.write("2: Bb\n");
        writer.write("3: Cc\n");
        writer.write("4: Dd\n");
        writer.write("5: Ee\n");
        writer.write("6: Ff\n");
        writer.write("7: Gg\n");
        writer.write("8: Hh\n");
        writer.write("9: Ii\n");
        writer.write("10: Jj\n");
        writer.write("11: Kk\n");
        writer.write("12: Ll\n");
        writer.write("13: Mm\n");
        writer.write("14: Nn\n");
        writer.write("15: Oo\n");
        writer.write("16: Pp\n");
        writer.write("17: Qq\n");
        writer.write("18: Rr\n");
        writer.write("19: Ss\n");
        writer.write("20: Tt\n");
        writer.write("21: Uu\n");
        writer.write("22: Vv\n");
        writer.write("23: Ww\n");
        writer.write("24: Xx\n");
        writer.write("25: Yy\n");
        writer.write("26: Zz\n");
        writer.write("0\n");
        writer.write("1\n");
        writer.write("2\n");
        writer.write("3\n");
        writer.write("4\n");
        writer.write("5\n");
        writer.write("6\n");
        writer.write("7\n");
        writer.write("8\n");
        writer.write("9\n");
        writer.close();

        FileReader reader = new FileReader("Eng.txt");
        Scanner scanner = new Scanner(reader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }
}