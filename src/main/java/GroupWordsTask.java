import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    private static Integer transform (Map.Entry<Character, List<String>> el) {
        List<String> array = el.getValue();
        Character key = el.getKey();
        int counter = 0;
        for (String str: array) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == key) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static Map<Character, Integer> groupIt(List<String> arr) {
        List<Map.Entry<Character, List<String>>> map = new ArrayList<>(arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet());

        return map.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::transform));
    }
}
