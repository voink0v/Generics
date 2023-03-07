public class Boss {
    public static void main(String[] args) {

        Info<Integer> info = new Info(22);
        System.out.println(info);

        Info<Worker> info1 = new Info(new Worker("Ilya","Voinkov", 26));
        System.out.println(info1);


    }


}

class Info<T> {
    private T neValue;


    public Info(T neValue) {
        this.neValue = neValue;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + neValue +
                '}';
    }
}
