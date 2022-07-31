public class Main {
    public static void main(String[] args) {



        Tigr vasya = new Tigr("vasya", 20);
        vasya.hunt();
        vasya.breath();
        vasya.run();

        Horse smetana = new Horse("smetana");
        smetana.makeSound();
        smetana.breath();
        smetana.run();
    }
}