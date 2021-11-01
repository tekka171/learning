package strategyPattern;

import strategyPattern.shareStrategy.ShareStrategy;

public abstract class PhoneCameraApp {
  private ShareStrategy shareStrategy;

  public ShareStrategy getShareBehavior() {
    return shareStrategy;
  }

  public void setShareBehavior(ShareStrategy shareStrategy) {
    this.shareStrategy = shareStrategy;
  }

  public PhoneCameraApp() {
  }

  public void take() {
    System.out.println("Take photo");
  }

  public abstract void edit();

  public void save() {
    System.out.println("Save photo");
  }

  public void share() {
    shareStrategy.share();
  }
}
