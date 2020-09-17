package Montayev_Chingis;

import java.util.TreeMap;

public class CreationRomanNumber {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, Enum.C.getKey());
        map.put(90, Enum.XC.getKey());
        map.put(50, Enum.L.getKey());
        map.put(40, Enum.XL.getKey());
        map.put(10, Enum.X.getKey());
        map.put(9, Enum.IX.getKey());
        map.put(5, Enum.V.getKey());
        map.put(4, Enum.IV.getKey());
        map.put(1, Enum.I.getKey());

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

}