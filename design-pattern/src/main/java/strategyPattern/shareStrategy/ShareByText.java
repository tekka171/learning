package strategyPattern.shareStrategy;

public class ShareByText implements ShareStrategy {
  public ShareByText() {
  }

  @Override public void share() {
    System.out.println("Share to TEXT");
  }
}
