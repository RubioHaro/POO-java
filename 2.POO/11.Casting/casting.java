class Animal {
    public void callme() {
        System.out.println("Soy un Animal");
    }
}

class Dog extends Animal {
    public void callme() {
        System.out.println("Soy un perro");
    }

    public void callme2() {
        System.out.println("Soy un perro x2");
    }
}

public class casting {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = (Animal) d;
        d.callme();
        a.callme();
        ((Dog) a).callme2();
    }
}