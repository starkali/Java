package examples;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster(int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    Monster(int count){
        this(count, count, count);
    }
    Monster(){
        this(2);
    }

    void voice(){
        voice(2);
    }
    void voice(int count){
        voice(count, "Grrrrrrrrrr...");
    }

    void voice(int count, String word){
        for(int i = 0; i < count; i++){
            System.out.println(word);
        }
    }

}
