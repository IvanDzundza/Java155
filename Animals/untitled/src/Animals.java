import java.io.*;
import java.util.*;

public class Animals {

    public String name;
    public String color;

    public void sayName() {
        System.out.println("My name is " + name);
    }

    public void sayColor() {
        System.out.println("I am " + color);
    }

    class Environment {
        String wood;
        String river;

        public String getWood () {
            return wood;
        }

        public void setWood () {
            this.wood = wood;
        }

        public String getRiver () {
            return river;
        }

        public void setRiver () {
            this.river = river;
        }

        static class Newcounter {
            private static int count = 0;

            public Newcounter () {
                new Counter().setCount ();
            }

            public static int getCount() {
                return count;
            }

            private static class Counter {
                private void setCount () {
                    count = count + 1;
                }
            }
        }
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

    enum Animalname {
        Foxik,
        Barsik,
        Wolfik,
        Snizhok,
        AngryWolfik,
        Lola,
        Milka,
        Levchuk
    }

    static class Descendants<T extends Number> {
        T[] nums;

        Descendants(T[] o) { nums = o; }

        double average() {
            double sum = 0.0;
            for(int i=0; i < nums.length; i++) {
                sum += nums[i].doubleValue();
            }
            return sum/nums.length;
        }

        boolean sameAvg (Descendants<T> obj) {
            if (average() == obj.average())
                return true;
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
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

        Environment.Newcounter n1 = new Environment.Newcounter();
        Environment.Newcounter n2 = new Environment.Newcounter();
        Environment.Newcounter n3 = new Environment.Newcounter();

        System.out.println("Count of newcounter objects = "
                + Environment.Newcounter.getCount());

        Animalname animalname = Animalname.Milka;
        String nameOfAnimal = animalname.name();
        System.out.println(nameOfAnimal);

        ArrayList<String> animalNames = new ArrayList<String>();

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Vvedit imya tvarunu nomer 1");
        animalNames.add(bufferedReader.readLine());
        System.out.println("Vvedit imya tvarunu nomer 2");
        animalNames.add(bufferedReader.readLine());
        System.out.println("Vvedit imya tvarunu nomer 3");
        animalNames.add(bufferedReader.readLine());

        String animalName1 = animalNames.get(0);
        System.out.println("animalName1 = " + animalName1);

        String animalName2 = animalNames.get(1);
        System.out.println("animalName2 = " + animalName2);

        String animalName3 = animalNames.get(2);
        System.out.println("animalName3 = " + animalName3);


        boolean quit = false;
        int menuItem;
        do {
            try {
                Scanner in = new Scanner(System.in);
                for (int i = 1; i <= 3; i++)

                System.out.println(i + ". Amimal name #" + i);
                System.out.println("0. Quit");

            System.out.println("Chose animal name: ");
            menuItem = in.nextInt();

                switch (menuItem) {
                    case 1:
                        System.out.println("animalName1 = " + animalName1);
                        break;
                    case 2:
                        System.out.println("animalName2 = " + animalName2);
                        break;
                    case 3:
                        System.out.println("animalName3 = " + animalName3);
                        break;
                    case 0:
                        quit = true;
                        break;
                } } catch (Exception e) {
                System.err.println("Please enter a number from 1 to 3");
                        } finally {
                System.out.println("A number from 1 to 3 only.");
            }
            } while (!quit) ;
            System.out.println("Good bye!");


        Integer inums[] = {1, 2, 3, 4, 5};
        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};

        Descendants<Integer> iDescendants = new Descendants<Integer>(inums);
        Descendants<Double> dDescendants = new Descendants<Double>(dnums);

        if(iDescendants.sameAvg(iDescendants))
            System.out.println("Same");
        else
            System.out.println("Not same");

    }



    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}