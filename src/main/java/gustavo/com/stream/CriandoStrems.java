package gustavo.com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class CriandoStrems {
    public static void main(String[] args) {

        Stream<String> langs = Stream.of("Java ", "Lua ", "JavaScript ", "Python\n ");
        langs.forEach(System.out::println);

        String [] outrasLangs = {"Kotlin ", "Html ", "Css ", "Ruby\n " };
        Stream.of(outrasLangs).forEach(System.out::println);
        Arrays.stream(outrasLangs).forEach(System.out::println);
        Arrays.stream(outrasLangs, 1, 4).forEach(System.out::println);


    }
}
