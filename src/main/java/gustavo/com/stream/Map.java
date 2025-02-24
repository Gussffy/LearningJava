package gustavo.com.stream;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Gustavo ", "Láiza \n");

        list.stream().forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        list.stream().map(m -> m.charAt(0)).forEach(System.out::println);


    }
}
