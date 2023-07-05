public class Dog {
    String name;
    String breed;
    double weight;

    int speed;


    String info(){
        return "Имя: " +name + "\nПорода: " + breed + "\nВес: " + weight;
    }

    void run(){
        for(int i = 0; i < speed; i++){
            System.out.println("Run: " + i );
        }
    }
}
