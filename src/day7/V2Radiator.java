package day7;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/15.
 */
public class V2Radiator {
    V2Radiator(ArrayList list){
        for(int x= 0; x<5; x++){
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
