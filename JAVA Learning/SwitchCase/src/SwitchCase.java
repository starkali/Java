import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String nameOfMonth = "July";
        switch (nameOfMonth){
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown month");
        }
//        if (month == 1) {
//            System.out.println("January");
//        }else if (month == 1) {
//            System.out.println("February");
//        } else if (month == 2) {
//            System.out.println("March");
//        }else if (month == 3) {
//            System.out.println("April");
//        }else if (month == 4) {
//            System.out.println("May");
//        }else if (month == 6) {
//            System.out.println("June");
//        }else if (month == 7) {
//            System.out.println("July");
//        }else if (month == 8) {
//            System.out.println("August");
//        }else if (month == 9) {
//            System.out.println("September");
//        }else if (month == 10) {
//            System.out.println("October");
//        }else if (month == 11) {
//            System.out.println("November");
//        }else if (month == 12) {
//            System.out.println("December");
    }
}

