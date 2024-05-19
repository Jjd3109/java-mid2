package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        // Animal 포함 상위 타입 전달 가능
        // Super : 상위 타입  extentds : 같은 계열
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox); <-- 안된다!!!

        Animal animal = animalBox.getValue();
        System.out.println("animal 값 = " + animal);



    }


    static void writeBox(Box<? super Animal> box){
        box.setValue(new Dog("멍멍이2", 200));
    }



}
