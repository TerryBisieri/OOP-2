class Ifscenario{
  public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int value = 0;
 System.out.println("Enter a number:");
 value = in.nextInt();
 if( value == 7) {
 System.out.println("That's lucky!");
 }
 else if( value == 13) {
 System.out.println("That's unlucky!");
 }
 else {
 System.out.println("That number is neither lucky nor unlucky!");
 }//end if
 in.close();
 }//end method main
}
