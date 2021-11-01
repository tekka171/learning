package designPattern.observerPattern;

import designPattern.observerPattern.AlertSystem;
import designPattern.observerPattern.Logger;
import designPattern.observerPattern.UserInterface;
import designPattern.observerPattern.subject.WeatherStation;
import org.junit.jupiter.api.Test;

class ObserverPatternTest {
  @Test
  void test1() {
    WeatherStation subject = new WeatherStation();

    AlertSystem alertSystem = new AlertSystem();
    subject.registerObserver(alertSystem);

    Logger logger = new Logger();
    subject.registerObserver(logger);

    UserInterface userInterface = new UserInterface();
    subject.registerObserver(userInterface);

    subject.setTemperature(10);
    subject.setPressure(100);
    subject.setWindSpeed(50);
    subject.notifyObserver();

    alertSystem.alert();
    logger.log();
    userInterface.display();
  }
}