import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Elvana", "beautiful");
//        Programmer programmer= new Programmer("Alina", "Smart","Peaksaft");
//        Dancer dancer= new Dancer("Nagima" , "Butterflay","Hanbiike");
//        Singer singer = new Singer("Akbermet", "Better","BTC");
//
//
//        System.out.println(person);
//        System.out.println(programmer);
//        System.out.println(dancer);
//        System.out.println(singer);
//
//        person.walk();
//        person.learn();
//        person.eat();
//        programmer.coding();
//        dancer.dansing();

        //=======================================================================


//        Array array = new Array(new String[]{"Alina","Nagima","Nurali"});
//        array.names(2);
//==================================================================================================

/**
 * Animal деген класс тузуп ага свойтваларын бериниз геттер, сеттер, конструктор и toString тузунуз
 * андан кийин Cow Dog Cat деген уч класс тузуп аларды Animal дан мурастаныз , оздоруно дагы свойстваларын кошунуз
 * Main ге келип Cow Cat Dog дун 2 ден  объектисин тузунуз сиз программаны иштетип Cow  деп жазсаныз Cow дун объектисин,
 * Dog деп жазсаныз Dog тун , Cat деп жазсаныз Cat тин объектисин чыгарып беруу керек*/

        Cow cow = new Cow("Lisa", 101, "black", "Big");
        Cow cow1 = new Cow("Amina", 150, "yellow", " Big" );
        Animal[] animals={cow,cow1};
        Cat cat = new Cat("Kiss", 4, "biytifule", "siam");
        Cat cat1 = new Cat("Ilya", 6,"scary","страшный" );
        Animal[] animals1 = {cat, cat1};
        Dog dog = new Dog("Rex", 47,"Bethoben", 8);
        Dog dog1 = new Dog("Med", 33,"enueq", 43);
        Animal [] animals2 =  {dog, dog1};

        Scanner scanner  =  new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equals("Cow")){
            System.out.println(cow);
        }else if (a.equals("Cat")){
            System.out.println(cat);
        }else {
            System.out.println(dog);
        }
    }




}