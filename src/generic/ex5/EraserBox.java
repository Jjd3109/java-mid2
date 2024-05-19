package generic.ex5;

public class EraserBox<T> {

    //instaceof && new 는 안된다 !

    public boolean instanceCheck(Object param){
        //return param instanceof T;
        return false;
    }

    public void create(){
        //return new T;

    }
}
