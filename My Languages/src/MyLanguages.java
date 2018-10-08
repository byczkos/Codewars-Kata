
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLanguages {
    
    public static void main(String[] args) {
        Map<String, Integer> results = new HashMap<>();
        results.put("Java", 10);
        results.put("Ruby", 80);
        results.put("Python", 65);
        results.put("Hindi", 60);
        results.put("Dutch", 93);
        results.put("Greek", 71);
        results.put("C++", 50);
        results.put("ASM", 10);
        results.put("Haskell", 20);
        MyLanguages.myLanguages(results);
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> sortedMap = results.entrySet().stream().filter(x -> x.getValue() > 60).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedMap);
        
        // zrobic jeszcze sortowanie mapy lub listy i zwrocic liste samych kluczy, bez wartosci.
        return null;
    }
}
