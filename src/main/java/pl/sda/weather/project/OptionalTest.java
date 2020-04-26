package pl.sda.weather.project;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Test");
        opt.ifPresent(n -> System.out.println(n));

        Optional<String> opt1 = Optional.ofNullable(null);
        opt1.ifPresent(n -> System.out.println(n));

    }
}
