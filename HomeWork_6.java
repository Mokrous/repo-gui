/**
 * Java 1 HomeWork_6
 * @author Mokrous Aleksei
 * version 05.01.2022
 */

class HomeWork_6 {

    public static void main(String[] args) {
        Cat cat = new Cat(300);
        Dog dog = new Dog(600, 100);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(250));
            System.out.println(animal.run(350));
            System.out.println(animal.run(650));
            System.out.println(animal.swim(60));
            System.out.println(animal.swim(150));
        }
        System.out.println("Animals were created: " + Zoo.getCountOfAnimals());
    }
}

class Dog extends Zoo {

        Dog(int runLimit, int swimLimit) {
            super(runLimit, swimLimit);
        }
}

class Cat extends Zoo {

    Cat(int runLimit) {
            super(runLimit, 900);
        }

        @Override
        public String swim(int distance) {
            return getClassName() + " can`t swim";
        }
}

    abstract class Zoo implements IAnimal {
        protected int runLimit;
        protected int swimLimit;
        protected String className;
        protected static int countOfAnimals = 0;

        Zoo(int runLimit, int swimLimit) {
            this.runLimit = runLimit;
            this.swimLimit = swimLimit;
            className = getClass().getSimpleName();
            countOfAnimals++;
        }

        public String getClassName() {
            return className;
        }

        public static int getCountOfAnimals() {
            return countOfAnimals;
        }

        @Override
        public String run(int distance) {
            if (distance > runLimit) {
                return className + " could`t run " + distance;
            } else {
                return className + " successfully run" + distance;
            }
        }

        @Override
        public String swim(int distance) {
            if (distance > swimLimit) {
                return className + " could`t swim " + distance;
            } else {
                return className + " successfully swim" + distance;
            }
        }

        @Override
        public String toString() {
            return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
        }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}





