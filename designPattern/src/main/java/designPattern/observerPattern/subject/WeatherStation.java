package designPattern.observerPattern.subject;

import java.util.ArrayList;

public class WeatherStation implements Subject {
  private ArrayList<Observer> observers;
  private int temperature;
  private int windSpeed;
  private int pressure;

  public int getTemperature() {
    return temperature;
  }

  public int getWindSpeed() {
    return windSpeed;
  }

  public int getPressure() {
    return pressure;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public void setWindSpeed(int windSpeed) {
    this.windSpeed = windSpeed;
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
  }

  public WeatherStation() {
    observers = new ArrayList<>();
  }

  @Override public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override public void notifyObserver() {
    for (Observer observer : observers) {
      observer.update(this);
    }
  }
}
