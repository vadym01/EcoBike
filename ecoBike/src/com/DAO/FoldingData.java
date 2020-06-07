package com.DAO;

import com.ecoBike.Folding;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FoldingData {

    List<Folding> foldingList = new ArrayList<>();



   public void setFoldingList(Folding folding){
       foldingList.add(folding);
   }

   public void getAll(){
       foldingList.forEach(System.out::println);
   }

   public void setFolding(Folding folding) throws IOException {
       FileWriter fw = new FileWriter("src/com/sourceTxt/ecobike.txt", true);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("FOLDING BIKE " + folding.getBrand() + "; "
       + folding.getSize() + "; "
       + folding.getnGears() + "; "
       + folding.getWeightB() + "; "
       + folding.isLightsFB() + "; "
       + folding.getColor() + "; "
       + folding.getPrice() + "; ");
       bw.newLine();
       bw.close();
   }



}
