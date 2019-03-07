package pl.marekkalkowski.nameinverter;

import java.util.Arrays;
import java.util.List;

public class Honorific {

    private static final List<String> honorificsList = Arrays.asList("Mr.","Mrs.");

    public boolean isHonorific(String str){
        return honorificsList.contains(str);
    }
}
