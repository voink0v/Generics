import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        list.add("Stol");
        list.add("Divan");
        list.add("Kreslo");
        list.add("Vintovka");

        for (String s : list) {
            System.out.println(s + " dlina = " + s.length());
        }
        List <Worker>list1 = new ArrayList<>();
        list1.add(new Worker("Anton","Ivanov",22));
        list1.add(new Worker("Elena","Tarasova",44));
        list1.add(new Worker("Nikolay","Skorpionov",18));

        for (Worker q : list1 ){
            System.out.println(q);
        }


    }


}

class Worker {
    private String firstName;
    private String lastName;
    private int age;

    public Worker(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
