package com.process;

import com.DAO.EBikeData;
import com.DAO.FoldingData;
import com.DAO.SpeedelecData;
import com.ecoBike.EBike;
import com.ecoBike.Folding;
import com.ecoBike.Speedelec;

import java.io.*;
import java.util.Scanner;

public class ParserText {

    SpeedelecData speedelecData = new SpeedelecData();
    EBikeData eBikeData = new EBikeData();
    FoldingData foldingData = new FoldingData();

    Scanner in = new Scanner(System.in);
    public void customParser(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String s[] = sc.nextLine().split(";");

            if(s[0].contains("E-BIKE")){
                    System.out.println(s[0] + "with" + s[4] + "mAh " +
                            "battery and" + containsVal(s[3]) + " head/tail light.\n"
                            + "Price:" + s[6] + " euros.");
            } else if (s[0].contains("FOLDING BIKE")) {

                System.out.println(s[0] + " with" + s[2] + " gear(s) " +
                        "and" + containsVal(s[4]) + " head/tail light.\n"
                        + "Price:" + s[6] + " euros.");
            }else {
                System.out.println(s[0] +
                        " with" + s[4] + " mAh " +
                        "battery and" + containsVal(s[3]) + " head/tail light.\n"
                        + "Price:" + s[6] + " euros.");
            }
        }
    }


    private String containsVal(String str){
        if(str.contains("true")){
            return "";
        }else {
            return " no";
        }

    }

    public void printVal(){
        Thread ebikeThread = new Thread() {
            @Override
            public synchronized void run() {
                eBikeData.getAll();
            }
        };
        ebikeThread.start();
        Thread foldingThread = new Thread(){
            @Override
            public synchronized void run() {
                foldingData.getAll();
            }
        };
        foldingThread.start();
        Thread speedelecThread = new Thread(){
            @Override
            public synchronized void run() {
                speedelecData.getAll();
            }
        };
        speedelecThread.start();
    }


    public void newItem(String str) throws IOException {
        System.out.println("Enter type and brand");
        String fBrand = in.next();
        System.out.println("Enter size of the wheels (in inch)");
        int fSize = in.nextInt();
        System.out.println("Enter the number of gears");
        int fGears = in.nextInt();
        System.out.println("Enter the weight of the bike (in grams)");
        int fWeight = in.nextInt();
        System.out.println("Enter the availability of lights at front and back (TRUE/FALSE)");
        boolean fLights = in.nextBoolean();
        System.out.println("Enter a color");
        String fColor = in.next();
        System.out.println("Enter the price");
        int fPrice = in.nextInt();
        System.out.println("new item saved");
        ParserText parserText = new ParserText();

        String line = str + fBrand + "; "
                + fSize + "; "
                + fGears + "; "
                + fWeight + "; "
                + fLights + "; "
                + fColor + "; "
                + fPrice + "; ";

        FileWriter fw = new FileWriter("src/com/sourceTxt/ecobike.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(line);
        bw.newLine();
        bw.close();
    }
}
