package generic.test.ex3.unit;

public class UnitUtil<T> {

    // 두 유닛을 입력 받아서 체력이 높은 유닛을 반환한다
    // 제네릭 메서드 사용
    // 입력하느 ㄴ유닛의 타입과 반환하는 유닛의 타입이 같아야 한다.


    public static <T extends BioUnit> T maxHp(T t1, T t2){
        return t1.getHp() > t2.getHp() ? t1 : t2;
    }

}
