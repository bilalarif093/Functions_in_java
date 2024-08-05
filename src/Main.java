public class Main {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        System.out.println("message1");
        print2();
    }

    public static void print2() {
        System.out.println("message2");
        print3();
    }

    public static void print3() {
        System.out.println("message3");
    }

}
