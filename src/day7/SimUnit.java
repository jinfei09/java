package day7;

/**
 * Created by arika on 16/3/15.
 */
public class SimUnit {
    String botType;

    public SimUnit(String type) {
        botType = type;
        System.out.println("SimUnit");
    }

    int powerUse(){
        if("Retention".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}
