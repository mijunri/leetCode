package singleton;

//静态内部类，利用类加载来进行懒加载
public class Singleton1 {
    private Singleton1(){
    }
    public Singleton1 getInstance(){
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder{
        private static final Singleton1 INSTANCE = new Singleton1();
    }
}
