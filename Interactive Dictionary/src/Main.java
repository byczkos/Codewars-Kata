import java.util.*;
//
//        In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
//
//        Dictionary d = new Dictionary();
//
//        d.newEntry("Apple", "A fruit that grows on trees");
//
//        System.out.println(d.look("Apple"));
//        >>> A fruit that grows on trees
//
//        System.out.println(d.look("Banana"));
//        >>> Cant find entry for Banana
//        Good luck and happy coding!

public class Main {

    public class Dictionary
    {
        Map<String,String> dictionaryMap = new HashMap<>();
        public void newEntry (String key, String description) {
            dictionaryMap.put(key,description);
        }

        public String look(String key) {
            String errorWarning = "Cant find entry for "+key;
            try {
                if (dictionaryMap.get(key).isEmpty() || dictionaryMap.get(key) == null) {
                    return errorWarning;
                } else {
                    return dictionaryMap.get(key);
                }
            } catch(NullPointerException e) {
                return errorWarning;
            }
        }
    }
}
