package day7;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/15.
 */
public class TestLifeSupportSim {
    public static void main(String [] args){
        ArrayList alist = new ArrayList();
        V2Radiator v2 =new V2Radiator(alist);
        V3Radiator v3 = new V3Radiator(alist);
        for(int z = 0; z<20; z++){
            RetentionBot ret = new RetentionBot(alist);
        }
    }
}
