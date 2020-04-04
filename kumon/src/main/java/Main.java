import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> word = new ArrayList<String>();

        word.add("sheet");
        word.add("mumbled");
        word.add("dolphins");
        word.add("special");
        word.add("muddy");
        word.add("blushed");
        word.add("auditorium");
        word.add("float");
        word.add("dessert");
        word.add("daughter");
        word.add("chin");
        word.add("tide");
        word.add("meadow");
        word.add("assistant");
        word.add("animals");
        word.add("sandals");
        word.add("camera");
        word.add("artist");
        word.add("hotel");
        word.add("poked");
        word.add("stage");
        word.add("parents");
        word.add("money");
        word.add("scrambled");
        word.add("teamwork");
        word.add("better");
        word.add("shoppers");
        word.add("flagpole");
        word.add("paints");
        word.add("foggy");
        word.add("wrapped");
        word.add("world");
        word.add("bookcase");
        word.add("surprised");
        word.add("broken");
        word.add("invite");
        word.add("bounce");
        word.add("watermelon");
        word.add("people");
        word.add("sweater");
        word.add("gardener");
        word.add("waiter");

        System.out.println(word.size());


        int wordLength = 8;

        HashMap<Integer, Character> positions = new HashMap<>();

        positions.put(5, 'w');

        Stream<String> stringStream = word.stream().filter(w -> w.length() == wordLength);

        for (Map.Entry<Integer, Character> entry : positions.entrySet()) {
            stringStream = stringStream.filter(w -> w.toCharArray()[entry.getKey().intValue() - 1] == entry.getValue().charValue());
        }

        List<String> collect = stringStream.collect(Collectors.toList());


        for (Object o : collect) {
            System.out.println(o);
        }


    }
}
