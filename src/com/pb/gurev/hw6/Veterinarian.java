package com.pb.gurev.hw6;

public class Veterinarian  {
    public static void main (String [] args) {
        Dog dog = new Dog("Собака Лайош", ", порода: Лайка", "Станица", "Мясо");
        dog.setDogNick("Собака Лайош");
        dog.setDogBreed("порода Лайка");
        dog.setLocation("Станица");
        dog.setFood("Мясо");



        System.out.println("На прием к ветеринару доставлены: " + dog.getDogNick() +dog.getDogBreed()+
                ", место проживания: "+ dog.getLocation() + ", привычная пища: "+dog.getFood());
    }
}

//      Dog d = new Dog() ;
//      d.woof();
//      d.eat();
//
//    }
//}
//
////       // public void treat Animal (Animal);
//        Animal[] animals = new Animal[3];
//        animals[0] = new Dog("мясо и кости", "вольер");
//        animals[1] = new Cat();
//        animals[2] = new Horse();
//
////        setDogFood ("мясо и кости");
////        this.dogFood = "лаяние";
////        this."мясо и кости" = "вольер";
//
//      // dog.setDogFood ("мясо и кости");
//        Dog = new Dog ("мясо и кости",  "вольер");
//
//        System.out.println(dog.getDog());
//      //  System.out.println(animals[0] );
//
//                //  Animal dog = new Dog();
//     //  Animal cat = new Cat();
//     //   Animal horse = new Horse();
//
//
//      //  Dog.makeNoise();
//     //   String security;
//
//
//
//
//
//    }
//}
//
