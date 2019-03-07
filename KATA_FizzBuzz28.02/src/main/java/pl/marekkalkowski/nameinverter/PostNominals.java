package pl.marekkalkowski.nameinverter;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostNominals {

    private static final List<String> postnominalsList = new ArrayList<>(Arrays.asList("Sr.","Jr.","Phd."));

    public boolean containsPostnominal(String str){
       return postnominalsList.contains(str);
    }
}
