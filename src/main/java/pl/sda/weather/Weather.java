package pl.sda.weather;

import java.security.PrivateKey;
import java.time.LocalDate;

public class Weather {
    private Double temperature;
    private String city;
    private Request request;
    private Location location;

    public Weather(Double temperature, String city, Request request, Location location) {
        this.temperature = temperature;
        this.city = city;
        this.request = request;
        this.location = location;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Weather() {
    }

    public Weather(Double temperature, String city) {
        this.temperature = temperature;
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
