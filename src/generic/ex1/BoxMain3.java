package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        //타입추론 : 생성하는 제네릭 타입 생략 가능 !
        //원하는 모든 타입 사용 가능

        // 제네릭 타입
        // - 클래스나 인터페이스를 정의할 때 타입 매개변수를 정의 하는것
        // -

        GenericBox<Integer> genericBox = new GenericBox<Integer>();

        genericBox.set(10);
        System.out.println(genericBox.get());


        GenericBox<String> stringBox =new GenericBox<>();
        stringBox.set("stringBox");
        String s = stringBox.get();

        System.out.println(s);

        GenericBox<Double> objectGenericBox = new GenericBox<>();
        objectGenericBox.set(10.5);
        System.out.println(objectGenericBox.get());

    }
}
