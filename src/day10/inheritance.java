package day10;


    // Parent Class
    class Animal {

        String name;

        // Parent constructor
        Animal(String name) {
            this.name = name;  // this() refers to current class variable
            System.out.println("Animal Constructor Called");
        }

        void eat() {
            System.out.println(name + " is eating.");
        }
    }

    // Child Class
    class Dog extends Animal {

        String breed;

        Dog(String name, String breed) {
            super(name);  // super() calls parent constructor
            this.breed = breed;
            System.out.println("Dog Constructor Called");
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Breed: " + breed);
        }

        public static void main(String[] args) {
            Dog d1 = new Dog("Tommy", "Labrador");
            d1.eat();
            d1.display();
        }
    }


