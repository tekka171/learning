import org.junit.jupiter.api.Test;
import strategyPattern.BasicCameraApp;
import strategyPattern.PhoneCameraApp;
import strategyPattern.shareStrategy.ShareByEmail;
import strategyPattern.shareStrategy.ShareBySocialMedia;

class StrategyPatternTest {
  @Test
  void test1() {
    PhoneCameraApp cameraApp = new BasicCameraApp();
    cameraApp.take();
    cameraApp.edit();

    cameraApp.setShareBehavior(new ShareByEmail());
    cameraApp.share();

    cameraApp.setShareBehavior(new ShareBySocialMedia());
    cameraApp.share();

    cameraApp.save();
  }
}