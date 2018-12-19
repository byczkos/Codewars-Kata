
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleSort {

    public static Object[] dbSort(Object[] a) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<Object> resultList = new ArrayList<>();
        Object[] resultArray = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i].getClass().equals(String.class)) {
                stringList.add((String) a[i]);
            } else if (a[i].getClass().equals(Integer.class)) {
                integerList.add((Integer) a[i]);
            }
        }
        List<Integer> sortedIntegerList = integerList.stream().sorted().collect(Collectors.toList());
        List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < a.length; i++) {
            if (i < sortedIntegerList.size()) {
                resultArray[i] = sortedIntegerList.get(i);
                resultList.add(sortedIntegerList.get(i));
            } else {
                resultArray[i] = sortedStringList.get(i - sortedIntegerList.size());
                resultList.add(sortedStringList.get(i - sortedIntegerList.size()));
            }
        }
        return resultArray;
    }
}




