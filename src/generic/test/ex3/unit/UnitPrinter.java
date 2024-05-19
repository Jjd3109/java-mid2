package generic.test.ex3.unit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1){
      System.out.println(t1.out());
    }

    public static void printV2(Shuttle<? extends BioUnit> t1){
        BioUnit bioUnit = t1.out();
        System.out.println(bioUnit.getName() + " : " + bioUnit.getHp());
    }




}
