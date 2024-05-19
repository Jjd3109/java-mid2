package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit>{

    private T t;

    public T showInfo(){
        System.out.println("셔틀안에 탄 이름 : " + t.getName());
        System.out.println("셔틀안에 탄 이름 : " + t.getHp());
        return t;
    }

    public void in(T t) {
        this.t = t;
    }

    public T out(){
        return t;
    }

}
