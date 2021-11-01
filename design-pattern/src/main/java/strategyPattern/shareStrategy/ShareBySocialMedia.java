package strategyPattern.shareStrategy;

public class ShareBySocialMedia implements ShareStrategy {
  public ShareBySocialMedia() {
  }

  @Override public void share() {
    System.out.println("Share to SOCIAL MEDIA");
  }
}
