import java.util.ArrayList;
import java.util.List;

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

        word.stream().filter(w -> w.length() == 7)
                .filter( w-> w.toCharArray()[2] == 'a')
                .forEach(w -> System.out.println(w));


    }
}
