package designPattern.observerPattern;

import designPattern.observerPattern.subject.Observer;
import designPattern.observerPattern.subject.WeatherStation;

public class UserInterface implements Observer {
  private WeatherStation weatherStation;

  public void display() {
    System.out.printf("DISPLAY weather temperature: %d windSpeed: %d pressure: %d%n", weatherStation.getTemperature(),
        weatherStation.getWindSpeed(), weatherStation.getPressure());
  }

  @Override public void update(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
  }
}
