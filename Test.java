import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<? super Number> list = new ArrayList<>();

        list.add(4); // lower bounded wildcard

        List<? extends Number> list1 = new ArrayList<>();

        list1.add(4); // upper bounded wildcard

    }

}
