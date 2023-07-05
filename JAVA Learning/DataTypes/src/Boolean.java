public class Boolean {
    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp > 25;
        boolean cold = temp < 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        if(hot && !isNight){
            System.out.println("Кондицонер включен");
        }else if(cold){
            System.out.println("Кондицоенр выключен");
        }else {
            System.out.println("Кондицоенр ничего не делает");
        }
    }
}
