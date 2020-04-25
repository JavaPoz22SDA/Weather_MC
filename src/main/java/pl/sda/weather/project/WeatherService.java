package pl.sda.weather.project;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class WeatherService {
    private String finalURL;

    public WeatherService(String url, String kluczApi) {
        this.finalURL = url + "?access_key=" + kluczApi + "&query=";
    }

    public Current getCityWeather (String city) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String url = finalURL + "city";
        Weather weather = mapper.readValue(new URL(url),Weather.class);
        return weather.getCurrent();
    }
}