package ovning1;

import java.util.ArrayList;

public class MathConstans {
    static void main(String[] args) {
        ArrayList<Double> constans = new ArrayList<>();

        //Namn	Värde
        //pi		3.1415926535
        //e		2.7182818284
        //sqrt2	1.4142135623
        //phi		1.6180339887
        //ln10		2.3025850929

        constans.add(3.1415926535); //pi
        constans.add(2.7182818284); // e
        constans.add(1.4142135623); // sqrt2
        constans.add(1.6180339887); //phi
        constans.add(2.3025850929); //ln10

        for( Double value : constans) {
            System.out.println(value);
        }
    }
}
