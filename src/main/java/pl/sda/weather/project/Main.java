package pl.sda.weather.project;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "http://api.weatherstack.com/current";
        String keyApi = "b3e5a5cbe14d1628a4e7c96a44d6f934";
        WeatherService weatherService = new WeatherService(url,keyApi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto, dla którego chcesz sprawdzić temperaturę.");
        String city = scanner.nextLine().trim();
        try {
            Weather weather = weatherService.getCityWeather(WeatherService.chceckGivenCity(city));
            System.out.println("Temperatura w " + city + " wynosi " + weather.getCurrent().getTemperature() + " stopni.");
        } catch (UnrecognizedPropertyException e) {
            System.out.println("Podane miasto nie istnieje.");
        }
    }
}
