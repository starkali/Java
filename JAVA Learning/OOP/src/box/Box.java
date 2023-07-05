package box;
public class Box {
    double length;
    double width;
    double height;

    Box(){
        this(10);
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size){
        this(size, size, size);
    }

    void setDimens(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if(currentVolume > anotherVolume){
            result = 1;
        }else if (currentVolume < anotherVolume){
            result = -1;
        }else{
            result = 0;
        }
        return result;
    }

    double getVolume() {
        return length * width * height;
    }
    void showVolume(){
        System.out.println(getVolume());
    }
}