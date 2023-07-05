public class Array {
    public static void main(String[] args) {
//        String[] nameOfMonths = new String[12];
//        nameOfMonths[0] = "January";
//        nameOfMonths[1] = "February";
//        nameOfMonths[2] = "March";
//        nameOfMonths[3] = "April";
//        nameOfMonths[4] = "May";
//        nameOfMonths[5] = "June";
//        nameOfMonths[6] = "July";
//        nameOfMonths[7] = "August";
//        nameOfMonths[8] = "September";
//        nameOfMonths[9] = "October";
//        nameOfMonths[10] = "November";
//        nameOfMonths[11] = "December";
//        for(int i = 0; i < nameOfMonths.length; i++){
//            System.out.print(nameOfMonths[i]);
//            if(i < nameOfMonths.length - 1){
//                System.out.print(", ");
//            }else{
//                System.out.print(".");
//            }
//        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
