package chap30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SteamSample {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple, Banana, Melon, Grape, Straberry"));
        System.out.println(list);

        list.stream().map(String :: toUpperCase).forEach(s -> System.out.println(s)); //map, foreach
        System.out.println(list.stream().filter(t->t.length() > 5).collect(Collectors.toList())); //filter
    }

}
