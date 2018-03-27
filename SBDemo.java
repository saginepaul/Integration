//StringBuilders Examples from Java : The complete Reference 10th edition book

public class SBDemo {

  public static void doDemo() {
    
    StringBuilder sb = new StringBuilder();
    sb.append("Hello it is Tuesday");
    sb.append("!");
    System.out.println(sb);
    replace(sb);
    reverse(sb);
    
  }

  // reverse () ---- Example
  public static void reverse(StringBuilder sp1) {
    sp1.reverse();
    System.out.println(sp1);
  }

  // replace () -- Example
  public static void replace(StringBuilder sb) {
    sb.replace(12, 16, "Thurs");
    System.out.println("After replace : " + sb);
  }

}
