public class Variable {
//    public static void main(String[] args) {
//        int x = 5;
//        int y = x + 5;
//
//        System.out.println(y);
//    }
//public static void main(String[] args) {
//    int john = 100;
//    int nick = john * 5;
//    System.out.println( john + nick );
//}
public static void main(String[] args) {
    int days = 10000;
    int years = days / 365; // 27
    int months = (days-(years * 365)) / 30; // 4
    int leftDays = days - (years * 365) - ( months * 30 ); // 25
    String sum = ( years + " Year | " + months + " Month | " + leftDays + " Days") ;
    System.out.println(sum);
}
}
