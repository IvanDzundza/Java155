import java.util.Arrays;

public class Animals {

    public String name;
    public String color;

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void sayColor() {
        System.out.println("I am " + color);
    }

    public static class Fox extends Animals {

        public int age;

        public void sayAge() {
            System.out.println("I am " + age + " years old");
        }
    }

    public static class Wolf extends Animals {

        public int legs;

        final public void sayLegs() {
            System.out.println("I have " + legs + " legs");
        }
    }

    public static class AngryWolf extends Wolf {

        public int tooth;

        public void sayTooth() {
            System.out.println("I have " + tooth + " tooth");
        }
    }

    abstract public class Wood {
        private String locality;

        public Wood(String locality) {
            this.locality = locality;
        }

        public abstract int getTree();

        protected void sayLocality() {
            System.out.println("Locality:" + locality);
        }
    }

    public class Mushrooms extends Wood {
        private int mushrooms;

        public Mushrooms(int mushrooms, String locality) {
            super(locality);
            this.mushrooms = mushrooms;
        }

        @Override
        public int getTree() {
            return mushrooms * mushrooms;
        }
    }

    interface Fish {
        int eyes = 2;

        String getFish();

        static int getEyes () {
            return Fish.eyes;
        }
        default String info () {
            return definition() +
                    "1 fish have 2 eyes";
        }
        private String definition () {
            return "Fish live in lakes, rivers, seas and oceans." +
                    "And also in ponds.\n";
        }
    }

    interface Sharks {
        int fins = 2;

        int getSharks();

        static int getFins () {
            return Sharks.fins;
        }
        default String info () {
            return definition() +
                    "1 shark have 4 fins";
        }
        private String definition () {
            return "Sharks live in seas and oceans." +
                    "Sharks are very dangerous.\n";
        }
    }

    interface Dolphins extends Fish {
        @Override
        public String getFish();

    }

    public class Dog implements Comparable<Dog> {
        public String dogname;
        public int dogage;

        @Override
        public int compareTo (Dog p) {
            if (this.dogname.compareTo (p.dogname) !=0)
                return this.dogname.compareTo (p.dogname);
            else
                return Integer.compare (this.dogage, p.dogage);
        }


    public void main(String[] args) {
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

        Fox Fox = new Fox();
        Fox.name = "Foxik";
        Fox.color = "Orange";
        Fox.age = 5;

        Fox.sayName();
        Fox.sayColor();
        Fox.sayAge();

        Wolf Wolf = new Wolf();
        Wolf.name = "Wolfik";
        Wolf.color = "Gray";
        Wolf.legs = 4;

        Wolf.sayName();
        Wolf.sayColor();
        Wolf.sayLegs();

        AngryWolf AngryWolf = new AngryWolf();
        AngryWolf.name = "AngryWolfik";
        AngryWolf.color = "Black";
        AngryWolf.legs = 4;
        AngryWolf.tooth = 24;

        AngryWolf.sayName();
        AngryWolf.sayColor();
        AngryWolf.sayLegs();
        AngryWolf.sayTooth();

        Dog breed [] = {
                new Dog("German Shepherd", 2),
                new Dog("Bulldog", 3),
                new Dog("Pickiness", 4)
        };

        for (Dog dog : breed) {
            System.out.println(dog);
        }
        Arrays.sort(breed, new DogAgeComparator());

        for (Dog dog : breed) {
            System.out.println(dog);
        }
    }

        private class DogAgeComparator {
        }
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}