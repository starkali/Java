package test;
public class Main {

    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("Alex");
        employees.add("Albert");
        employees.remove("Emma");
        employees.remove("Olivia");
        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }
    private static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
    //        System.out.println(MyMath.length(10));
//        System.out.println(MyMath.area(20));
//        Person person = new Person("Alex", 25);
//        System.out.println("Name: "+person.getName()+"\nAge: "+person.getAge());
//        box.Box current = new box.Box(10);
//        box.Box another = new box.Box(20);
//        int result = current.compare(another);
//        System.out.println(result);
//        examples.Monster monster = new examples.Monster();
//        monster.voice();
//        box.Box box = new box.Box(30);
//        box.showVolume();
//        System.out.println(examples.MyMath.multiple(5));
//        System.out.println(Math.sqrt(36));
//        examples.Worker worker = new examples.Worker("Alex", "IT", 1200);
//        worker.showInfo();
//        box.Box box1 = new box.Box(10,10,10);
//        box.Box box2 = new box.Box(20,20,20);
//        box1.showVolume();
//        box2.showVolume();
//        examples.Rectangle rectangle = new examples.Rectangle();
//        rectangle.recInfo(10, 5);
//        rectangle.showResult();
//        examples.Person person1 = new examples.Person();
//        person1.name = "Alex";
//        person1.age = 17;
//        person1.weight = 65.8;
//        examples.Person person2 = new examples.Person();
//        person2.name = "Wmalex";
//        person2.age = 27;
//        person2.weight = 73.2;
//        examples.Person person3 = new examples.Person();
//        person3.name = "Dalex";
//        person3.age = 35;
//        person3.weight = 69.5;
//        double sum = person1.age + person2.age + person3.age;
//        double averageAge = sum / 3;
//        System.out.println(averageAge);
}