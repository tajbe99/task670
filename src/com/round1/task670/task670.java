package com.round1.task670;


import java.io.*;
import java.io.IOException;

public class task670 {
    public static void main(String[] args){
        BufferedReader readBuff = null;
        try {
            readBuff = new BufferedReader(new FileReader("src\\com\\round1\\task670\\input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (true){
                String line = readBuff.readLine();
                if (line==null) break;
                try (BufferedWriter writeBuff = new BufferedWriter(new FileWriter("src\\com\\round1\\task670\\output.txt",false)))
                {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                readBuff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
