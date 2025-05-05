input java.util.*;
class HelloTillStop{
  Scanner sc = new Scanner(System.in);

  //outputs Hello while user wants to
  void showHello(){
    String choice;

    System.out.println("For Hello type h, anything else to stop ");
    choice= sc.next();
    while("h".equals(choice)){
      System.out.println("Hello");
      choice=sc.next();
    }
  }
}
