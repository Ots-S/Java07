public class Hangar {

    public static void main(String[] args) {

    Car voiture1 = new Car("Peugeot", 100000);
    Car voiture2 = new Car("Opel", 200000);
    Boat bateau1 = new Boat("Titanic", 10000);
    Boat bateau2 = new Boat("Costa Concordia", 120000);

    System.out.println(voiture1.doStuff());
    System.out.println(voiture2.doStuff());
    System.out.println(bateau1.doStuff());
    System.out.println(bateau2.doStuff());

    }
}