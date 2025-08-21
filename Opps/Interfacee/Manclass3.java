package Opps.Interfacee;

interface Lovable {
    void love();
}

interface Hatable {
    void hate();
}

class Person implements Lovable, Hatable {
    @Override
    public void love() {
        System.out.println("Person is loving");
    }

    @Override
    public void hate() {
        System.out.println("Person is hating");
    }
}

public class Manclass3 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.love();
        obj.hate();
    }
}