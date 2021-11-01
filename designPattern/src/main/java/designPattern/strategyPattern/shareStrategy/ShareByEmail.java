package designPattern.strategyPattern.shareStrategy;

public class ShareByEmail implements ShareStrategy {
  public ShareByEmail() {
  }

  @Override public void share() {
    System.out.println("Share to EMAIL");
  }
}
