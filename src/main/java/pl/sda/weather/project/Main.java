package pl.sda.weather.project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "http://api.weatherstack.com/current";
        String kluczApi = "b3e5a5cbe14d1628a4e7c96a44d6f934";
        WeatherService weatherService = new WeatherService(url,kluczApi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto, dla którego chcesz sprawdzić temperaturę.");
        String city = scanner.nextLine();
        Weather weather = weatherService.getCityWeather(city);
        System.out.println("Temperatura w " + city + " wynosi " + weather.getCurrent().getTemperature() + " stopni.");
    }
}
