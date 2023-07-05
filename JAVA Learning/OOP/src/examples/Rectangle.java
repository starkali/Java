package examples;

public class Rectangle {
    double width;
    double height;

    void recInfo(double width, double height){
        this.width = width;
        this.height = height;
    }
    double getSquareInfo(){
        return width * height;
    }
    void showResult(){
        System.out.println(getSquareInfo());
    }
}
