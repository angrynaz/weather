package space.yaroslav.pojos;


import java.util.ArrayList;
import java.util.List;

public class WeatherParams {
//TODO add getters for inner classes
    private List<WeatherInfo> weather = new ArrayList<WeatherInfo>();

    private MainInfo main;

    private Wind wind;

    private String name;

    private int cod;

    public int getCod() {
        return cod;
    }



    public List<WeatherInfo> getWeather() {
        return weather;
    }

    public MainInfo getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (cod == 404) return "There are no such city. Try again.";
        if (cod == 401) return "Your API-key is invalid";

        return String.format("In %s there is/are %s. Temperature is %f, pressure is %f, humidity is %f, wind's speed is %f", name, weather.get(0).getDescription(), main.getTemp() - 273, main.getPressure(), main.getHumidity(), wind.getSpeed());
    }
}


