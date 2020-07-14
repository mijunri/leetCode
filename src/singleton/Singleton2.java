package singleton;
//双重检查锁
public class Singleton2 {
    private static volatile Singleton2 instance;

    private Singleton2(){}

    public Singleton2 getInstance(){
        if(instance == null){
            synchronized(Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
