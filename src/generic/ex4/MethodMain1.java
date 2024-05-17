package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) object;


        //타입 인자 (Type Arugment)
        System.out.println("명시적 타입 인자");
        Integer integer = GenericMethod.<Integer>genericMethod(i);
        System.out.println(integer);


        //타입 인자 (Type Arugment)
        System.out.println("추론적 타입 인자");
        Integer integer2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);


    }
}
