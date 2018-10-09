
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
        System.out.println(MyLanguages.myLanguages(results));
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {
        Map<String, Integer> sortedMap = results.entrySet()
                .stream()
                .filter(x -> x.getValue() >= 60)
                .sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
//              ====  second method to sorting  === 
//                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        List<String> list = new ArrayList<>(sortedMap.keySet());
        return list;
    }
}
