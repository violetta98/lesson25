package Singleton;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class Singleton {

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null)
                    instance = localInstance = new Singleton();
            }
        }
        return localInstance;
    }

}

