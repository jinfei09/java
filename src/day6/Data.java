package day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by arika on 16/3/14.
 */
public class Data {
    public static void main(String [] args){
        String mDate = "20151106000000";
        Date mmDate = parseStockDate(mDate);
        System.out.println(mmDate);
    }

    private static Date parseStockDate(String mDate) {
        Date retDate = null;
        DateFormat format1 = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            retDate = format1.parse(mDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return retDate;
    }
}
