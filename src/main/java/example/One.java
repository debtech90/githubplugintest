package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
    System.out.println("Added new issue");
    System.out.println("This is new problem");
  }
}
