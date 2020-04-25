package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class GetWeather {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String url = "http://api.weatherstack.com/current" + "?access_key=b3e5a5cbe14d1628a4e7c96a44d6f934&query=Poznan";
        Object object = mapper.readValue(new URL(url),Object.class);
        System.out.println(object);
    }
}
