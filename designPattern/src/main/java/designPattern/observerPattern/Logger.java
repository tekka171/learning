package designPattern.observerPattern;

import designPattern.observerPattern.subject.Observer;
import designPattern.observerPattern.subject.WeatherStation;

public class Logger implements Observer {
  private WeatherStation weatherStation;

  public void log() {
    System.out.printf("LOG weather temperature: %d windSpeed: %d pressure: %d%n", weatherStation.getTemperature(),
        weatherStation.getWindSpeed(), weatherStation.getPressure());
  }

  @Override public void update(WeatherStation weatherStation) {
    this.weatherStation = weatherStation;
  }
}
