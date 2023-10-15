package Homework07.observer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum WorkType {
    
    hr,

    финансист,

    водитель,

    разнорабочий;

    private static final List<WorkType> values = Arrays.asList(values());
    private static final int size = values.size();

    private static final Random rnd = new Random();
    
    public static WorkType getRandom() {
        return values.get(rnd.nextInt(size));
    }

}
