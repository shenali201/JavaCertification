package chapter10;

public class Zoo {
    public static void main(String arg []){
//        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();

        Animal sasha = new Animal();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("heres dog food");
        } else if( animal instanceof  Cat){
            System.out.println("heres cat food");
        }
    }
}
