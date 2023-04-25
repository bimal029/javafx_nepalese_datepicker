/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nepalicalendar;

import java.util.List;

/**
 *
 * @author Dell
 */
public class NepaliCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();

        Converter converter = new Converter();

        List<NepaliDate> nepaliDateList = converter.getFullNepaliMonthOf(1952, 3, 10);

        for (NepaliDate nepaliDate: nepaliDateList){
            System.out.println(nepaliDate.toString());
        }

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        Common.log("Time taken: " + totalTime + " ms", true);
        System.out.println(converter.getNepaliMonthName(1990, 2, 19));
        System.out.println(converter.getEnglishDate(2089, 11, 30));
    }
    
}
