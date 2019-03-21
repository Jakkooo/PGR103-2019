import java.util.ArrayList;

class Animal{
        Animal(){
            System.out.println("animal is created");
        }

        boolean likes(String food){ return false;}
        void speak(){System.out.println("???");}
        void getAngry(){speak();}
    }

    class Dog extends Animal{
        Dog(){
            System.out.println("dog is created");
        }

        void speak(){System.out.println("speak Woof");}
        void getAngry(){System.out.println("angry Grawl");}
        boolean likes(String food){
          return food.equals("bones");
        }

    }

    class Sidehound extends Dog{
        Sidehound(){
            System.out.println("sidehound is created");
        }
        void speak(){System.out.println("speak uhuhu");};
        void getAngry(){System.out.println("angry tremble");}
        boolean likes(String food){
            return food.equals("chocolate");
        }


    }


    class Cat extends Animal{
     Cat(){
           System.out.println("Cat is created");
     }
        void speak(){System.out.println("speak Miau");};
        void getAngry(){System.out.println("angry Scratch");}
        boolean likes(String food){
            return food.equals("mouse");
        }

    }

    class Bird extends Animal{
        Bird(){
            System.out.println("Bird is created");
        }
        void speak(){System.out.println("speak beep");};
        //void getAngry(){System.out.println("pick");}
        boolean likes(String food){
            return food.equals("seeds");
        }


    }


    class TestSuper4{
        public static void main(String args[]){


            ArrayList<Animal> animals=new ArrayList<Animal>();

            Dog d=new Dog();
            Animal s=new Sidehound();
            Cat c = new Cat();
            Bird b = new Bird();

            System.out.println();

            animals.add(d);
            animals.add(s);
            animals.add(c);
            animals.add(b);

            for(Animal a:animals){
                if(a.likes("meat")==true)
                    a.speak();
                else a.getAngry();
            }




        }




}



