package Reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ReferenceTest {
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        list.add(new Object());
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        WeakReference<Object> weakReference = new WeakReference<>(new Object());

        System.out.println(list.get(0));
        System.out.println(softReference.get());
        System.out.println(weakReference.get());

        System.out.println();
        System.gc();

        System.out.println(list.get(0));
        System.out.println(softReference.get());
        System.out.println(weakReference.get());

    }
}
