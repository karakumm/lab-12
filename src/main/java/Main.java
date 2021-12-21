import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(MapTask.mapping(Arrays.asList("1", "abc", "2", "3")));

        System.out.println(FlattingTask.flattingStrings(Arrays.asList("abc", "def", "ghj")));

        System.out.println(FizzBuzzTask.fizzBuzzIt(10));

        System.out.println(GroupWordsTask.groupIt(Arrays.asList("ABCA", "BCD", "ABC")));

    }
}

