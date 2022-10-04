public class Animals {

    public String name;
    private String color;

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void sayColor() {
        System.out.println("I am " + color);
    }

    public static void main(String[] args) {
        Animals Ursus_arctos = new Animals();
        Ursus_arctos.name = "Ursus arctos";
        Ursus_arctos.color = "Brown";

        Ursus_arctos.sayName();
        Ursus_arctos.sayColor();

        Animals Snizhok = new Animals();
        Snizhok.name = "Snizhok";
        Snizhok.color = "White";

        Snizhok.sayName();
        Snizhok.sayColor();

        Animals Barsik = new Animals();
        Barsik.name = "Barsik";
        Barsik.color = "Rufous";

        Barsik.sayName();
        Barsik.sayColor();

    }

    public String getColor() {
        return color;
    }
}