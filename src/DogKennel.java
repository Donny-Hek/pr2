import java.util.ArrayList;
import java.util.Scanner;

class Dog {
    private String name;
    private int age;

    Dog(String a, int b){
        name=a;
        age=b;
    }

    int getAge() {return age;}
    String getName() {return name;}
    void setAge(int a) {age=a;}
    void setName(String a) {name=a;}

    int convAge() {return age*7;}
    
    public String toString() {
        return "---\n"+"Имя: "+this.name+"\nВозраст: "+this.age+ "/"+ this.convAge();
    }
}

public class DogKennel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Dog> dogs=new ArrayList<Dog>();
        int masLen, ageDog; String nameDog;

        System.out.print("Сколько собак в питомнике?");
        masLen=scan.nextInt();
        for (int i=0;i<masLen;i++) {
            Dog sobaka=new Dog(scan.next(), scan.nextInt());
            dogs.add(sobaka);
        }

        for (int i=0;i<masLen;i++) {
            System.out.println(dogs.get(i));
        }
    }
}
