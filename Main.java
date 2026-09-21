public class Main {
    public static void main(String[] args) {

        Table table1 = new Table(3.0);
        //table1.height = 3.0;
        System.out.println(table1.height);


        Circle c1;
        c1 = new Circle(1.5);
        System.out.println(c1);
        
        System.out.println("c1 radius is: " + c1.radius);
        c1.radius = 10;
        System.out.println("radius is now " + c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle roundy = new Circle();
        roundy.radius = 3.0;
        System.out.println("roundy has a radius of : " + roundy.radius);
        System.out.println("c1 still has a radius of : " + c1.radius);

        Cat newcat = new Cat();
        System.out.println(newcat.name);

        Cat glitch = new Cat("Glitch McPixel Tomesh", 'M', "Orange",
            "DSH", 15, 12.0);
        glitch.meow();

        Cat haku = new Cat();
        haku.name = "Haku Gihbli Tomesh";
        haku.age = 6;
        haku.sex = 'M';
        haku.weight = 8.0;
        haku.color = "Tuxedo";
        haku.breed = "Domestic Short Hair";

        // System.out.println("Name: " + glitch.name + " age: " + glitch.age + " sex: " + glitch.sex 
        //     + " weight: " + glitch.weight + " color: " + glitch.color + " breed: " + glitch.breed);
        



        // String cat1Name = "Glitch";
        // String cat2Name = "Haku";
        // String cat3Name = "Genki";
        // String cat4Name = "Susu";
        // String cat5Name = "Pippin";

        // int cat1Age = 15;
        // int cat2Age = 6;
        // int cat3Age = 3;
        // int cat4Age = 2;
        // int cat5Age = 1;

        // double cat1Weight = 12.0;
        // double cat2Weight = 9.0;
        // double cat3Weight = 12.0;
        // double cat4Weight = 6.0;
        // double cat5Weight = 5.0; 

        // System.out.println(cat1Name + " : Age: " + cat1Age + " Weight: " + cat1Weight);
        // System.out.println(cat2Name + " : Age: " + cat2Age + " Weight: " + cat2Weight);
        // System.out.println(cat3Name + " : Age: " + cat3Age + " Weight: " + cat3Weight);
        // System.out.println(cat4Name + " : Age: " + cat4Age + " Weight: " + cat4Weight);
        // System.out.println(cat5Name + " : Age: " + cat5Age + " Weight: " + cat5Weight);


    }
}
