package day5;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/11.
 */
public class DotComEnd {
   private ArrayList<String> locationCells;
   private String name;

   public ArrayList<String> getLocationCells() {
      return locationCells;
   }

   public void setLocationCells(ArrayList<String> locationCells) {
      this.locationCells = locationCells;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String checkYourSelf(String userInput){
      String result = "miss";
      int index = locationCells.indexOf(userInput);
      if(index>=0){
         locationCells.remove(index);

         if(locationCells.isEmpty()){
            result = "kill";
            System.out.println("Ouch! You sunk " + name + " :( ");
         } else {
            result = "hit";
         }
      }
      return result;
   }
}
