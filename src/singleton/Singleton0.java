package singleton;

//饿汉模式，非懒加载
public class Singleton0 {
    private static Singleton0 singleton = new Singleton0();
    private Singleton0(){

    }
    public Singleton0 getInstance(){
        return singleton;
    }
}
