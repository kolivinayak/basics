package udm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class strmTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Vinayak");
        names.add("Angel");
        names.add("Arradhya");
        names.add("Radhika");
        names.add("Koli");
        names.add("Samruddhi");
        
        Stream strm = names.stream();

//        long c = names.stream().filter(s->s.startsWith("A")).count();
//        System.out.println("The count start with A : " + c);
//        names.stream().filter(s->s.length() > 6).forEach(s-> System.out.println(s));
//        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
//        names.stream().sorted().forEach(s-> System.out.println(s));
//        boolean flag = names.stream().anyMatch(s->s.equalsIgnoreCase("Vinayakkoli"));
//        System.out.println(flag);

//        List<String> lst = names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
//        lst.stream().forEach(s-> System.out.println(s));

        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(1);
        ai.add(3);
        ai.add(4);
        ai.add(7);
        ai.add(5);
        ai.add(6);
        
        List <Integer> il = ai.stream().distinct().sorted().collect(Collectors.toList());
        il.stream().forEach(s-> System.out.println(s));
        System.out.println(il.get(2));
    }
}
