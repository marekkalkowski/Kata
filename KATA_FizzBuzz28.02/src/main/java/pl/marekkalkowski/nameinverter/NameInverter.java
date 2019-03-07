package pl.marekkalkowski.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NameInverter {

    private Honorific honorific = new Honorific();

    public String invert(String name) {

        if (name == null) {
            throw new NullPointerException("Null not allow");
        }

        if (name == "" || name == "    ") {
            throw new IllegalArgumentException("no names added");
        }

        List<String> nameList = splitGivenStringIntoList(name);
        List<String> listWithOutHonorifics = withOutHonorifics(nameList);
        String result = "";


        if (listWithOutHonorifics.size() == 1) {
            result = name.trim();
        } else {
            result = mergeAllStrings(listWithOutHonorifics).trim();
        }

        return result;
    }

    private String mergeAllStrings(List<String> list) {
        String surname = list.get(1).trim();
        String name = list.get(0).trim();
        String postnominal = getAndMergePostnominals(list).trim();

        return String.format("%s, %s %s", surname, name, postnominal);
    }

    private String getAndMergePostnominals(List<String> list) {
        String result = "";
        for (String str : list.subList(2, list.size())
        ) {
            result += str + " ";
        }
        return result;
    }

    private List<String> splitGivenStringIntoList(String name) {
        List<String> result = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        return result;
    }

    private List<String> withOutHonorifics(List<String> list) {
        if (honorific.isHonorific(list.get(0))) {
            list.remove(0);
        }
        return list;
    }
}

