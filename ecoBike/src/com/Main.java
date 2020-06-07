package com;

import com.DAO.EBikeData;
import com.DAO.FoldingData;
import com.DAO.SpeedelecData;
import com.ecoBike.EBike;
import com.ecoBike.Folding;
import com.ecoBike.Speedelec;
import com.process.ParserText;
import com.threadProcess.EBikeThread;
import com.threadProcess.FoldingThread;
import com.threadProcess.SpeedelecThread;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        ParserText parserText = new ParserText();

        final Scanner in = new Scanner(System.in);
        SpeedelecData speedelecData = new SpeedelecData();
        EBikeData eBikeData = new EBikeData();
        FoldingData foldingData = new FoldingData();

        File file = new File("src/com/sourceTxt/ecobike.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String s[] = sc.nextLine().split(";");

            if (s[0].contains("SPEEDELEC")) {
                speedelecData.setSpeedelecList(new Speedelec(s[0]
                        , Integer.parseInt(s[1].trim())
                        , Integer.parseInt(s[2].trim())
                        , Boolean.parseBoolean(s[3].trim())
                        , Integer.parseInt(s[4].trim())
                        , s[5]
                        , Integer.parseInt(s[6].trim())));
            } else if (s[0].contains("E-BIKE")) {
                eBikeData.seteBikeList(new EBike(s[0]
                        , Integer.parseInt(s[1].trim())
                        , Integer.parseInt(s[2].trim())
                        , Boolean.parseBoolean(s[3].trim())
                        , Integer.parseInt(s[4].trim())
                        , s[5],
                        Integer.parseInt(s[6].trim())));
            } else {
                foldingData.setFoldingList(new Folding(s[0]
                        , Integer.parseInt(s[1].trim())
                        , Integer.parseInt(s[2].trim())
                        , Integer.parseInt(s[3].trim())
                        , Boolean.parseBoolean(s[4].trim())
                        , s[5], Integer.parseInt(s[6].trim())));
            }
        }

        int choice = 1;

        while (choice != 7){
            System.out.println("1 - Show the entire EcoBike catalog\n" +
                    "2 – Add a new folding bike\n" +
                    "3 – Add a new speedelec\n" +
                    "4 – Add a new e-bike\n" +
                    "5 – Find the first item of a particular brand 6 – Write to file\n" +
                    "7 – Stop the program");

            choice = in.nextInt();
            switch (choice) {
                case 1:

                    parserText.customParser("src/com/sourceTxt/ecobike.txt");
                case 2:
//                    System.out.println("Enter type and brand");
//                    String fBrand = in.next();
//                    System.out.println("Enter size of the wheels (in inch)");
//                    int fSize = in.nextInt();
//                    System.out.println("Enter the number of gears");
//                    int fGears = in.nextInt();
//                    System.out.println("Enter the weight of the bike (in grams)");
//                    int fWeight = in.nextInt();
//                    System.out.println("Enter the availability of lights at front and back (TRUE/FALSE)");
//                    boolean fLights = in.nextBoolean();
//                    System.out.println("Enter a color");
//                    String fColor = in.next();
//                    System.out.println("Enter the price");
//                    int fPrice = in.nextInt();
//                    System.out.println("new item saved");
//                    ParserText parserText = new ParserText();

//                    ParserText parserText = new ParserText();
//                    parserText.newItem("FOLDING BIKE");
                    break;

                case 3:


                    break;
                case 4:


                    break;
                default:
                    System.out.println("error");

            }



        }


        }


    }

