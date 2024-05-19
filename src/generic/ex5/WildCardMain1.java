package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        dogBox.setValue(new Dog("멍멍이", 100));
        WildcardEX.printGenericV1(dogBox);

        WildcardEX.printWildCardV1(dogBox);

        WildcardEX.printGenericV2(dogBox);

        WildcardEX.printWildCardV2(dogBox);


        WildcardEX.printAndReturnGeneric(dogBox);
        WildcardEX.printAndReturnWildCard(dogBox);
    }
}
