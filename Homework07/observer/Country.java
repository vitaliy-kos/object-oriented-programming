package Homework07.observer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Country {
    
    Россия,

    Америка,

    Англия,

    Франция, 

    Китай;

    private static final List<Country> values = Arrays.asList(values());
    private static final int size = values.size();
    
    private static final Random rnd = new Random();
    
    public static Country getRandom() {
        return values.get(rnd.nextInt(size));
    }
}
