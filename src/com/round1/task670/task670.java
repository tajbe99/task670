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
                Integer[] finalArray = CreateArray(line);
                try (BufferedWriter writeBuff = new BufferedWriter(new FileWriter("src\\com\\round1\\task670\\output.txt",false)))
                {
                    writeBuff.write(finalArray[Integer.parseInt(line)-1].toString());
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

    public static Integer[] CreateArray(String length){
        boolean checkDigit = true;
        Integer inputToArray = 1;
        Integer[] finalArray = new Integer[Integer.parseInt(length)];
        for (int i=0;i<finalArray.length;i++) {
            while (true) {
                for (int j=0;j<inputToArray.toString().length();j++){
                    for (int v=j+1;v<inputToArray.toString().length();v++) {
                        checkDigit= (inputToArray.toString().charAt(j) == inputToArray.toString().charAt(v)) ?false :true;
                        if (checkDigit==false) break;
                    }
                    if (checkDigit==false) break;
                }
                if (checkDigit == true) {
                    finalArray[i] = inputToArray;
                    inputToArray++;
                    break;
                }
                inputToArray++;
            }
        }
        return finalArray;
    }
    }

