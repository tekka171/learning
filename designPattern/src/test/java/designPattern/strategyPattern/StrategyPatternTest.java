package designPattern.strategyPattern;

import org.junit.jupiter.api.Test;
import designPattern.strategyPattern.shareStrategy.ShareByEmail;
import designPattern.strategyPattern.shareStrategy.ShareBySocialMedia;

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