/**
 * Java 1 HomeWork_7
 * @author Mokrous Aleksei
 * version 06-07.01.2022
 */
public class HomeWork_7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Charlie", 17), new Cat("Whisky", 9), new Cat("Tango", 25)
        };
        Plate plate = new Plate(60, 45);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add();
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness();
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    protected String name;
    protected int hunger;
    protected boolean satiety;

    Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        satiety = false;
    }

    void setFullness() {
        satiety = false;
    }

    void eat(Plate plate) {
        if (!satiety)
            satiety = plate.decreaseFood(hunger);
    }

    @Override
    public String toString() {
        return "{name=" + name + ", hunger=" +
                hunger + ", satiety=" + satiety + "}";
    }
}

class Plate {
    protected int volume;
    protected int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) return false;
        food -= portion;
        return true;
    }

    void add() {
        if (this.food + 40 <= volume)
            this.food += 40;
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}
