package pl.sda.weather.project;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class WeatherService {
    private String finalURL;

    public WeatherService(String url, String keyApi) {
        this.finalURL = url + "?access_key=" + keyApi + "&query=";
    }

    public Weather getCityWeather (String city) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String url = finalURL + city;
        Weather weather = mapper.readValue(new URL(url),Weather.class);
        return weather;
    }

// można też używać metody replace z klasy STring i zamienić spacje na %20
    public static String chceckGivenCity (String city){
        String finalCity = city.trim();
        if (finalCity.contains(" ")){
            String[] array = city.split(" ");
            finalCity = array[0];
            for (int i = 1; i < array.length; i++){
                finalCity = finalCity + "%20" + array[i];
            }
        }
        return finalCity;
    }


}
