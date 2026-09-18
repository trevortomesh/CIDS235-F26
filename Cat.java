public class Cat {
   
    String name; 
    char sex; 
    String color;
    String breed;
    int age;
    double weight;

    Cat(){
        name = "Garfield";
        sex = 'M';
        color = "Orange";
        breed = "DSH";
        age = 48;
        weight = 40.0;
    }

    Cat(String newName, char newSex, String newColor, String newBreed,
        int newAge, double newWeight){
            name = newName;
            sex = newSex;
            color = newColor;
            breed = newBreed;
            age = newAge;
            weight = newWeight;
        }
    

    void meow(){
        System.out.println(name + " says meow!");
    }
}

