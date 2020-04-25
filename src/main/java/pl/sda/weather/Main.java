package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Weather weather = new Weather(23.5,"Poznań");

        mapper.writeValue(new File("data.json"), weather );

        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class);
        System.out.println(readWeather.getCity());

        Request request = new Request("City","Poznan, Poland");
        Location location = new Location("Poznan","Poland");

        Weather weather1 = new Weather(23.5,"Poznan",request,location);
        mapper.writeValue(new File("weather.json"),weather1);

        Book book = new Book("Piesek", 365);
        book.setPages(400);
        mapper.writeValue(new File("book.json"),book);

        Book readBook = mapper.readValue(new File("book.json"),Book.class);
        System.out.println(readBook.getPages());


    }
}
