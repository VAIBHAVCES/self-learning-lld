package singleton_desing_pattern;

public class DoubleLockedSingleton {
    private static DoubleLockedSingleton dls;
    private DoubleLockedSingleton(){
        System.out.println("Default private constructor of : DoubleLockedSingleton");
    }
    public static DoubleLockedSingleton getInstance(){
        // DoubleLockedSingleton dls = new DoubleLockedSingleton();
        if(dls == null){
            // -> ,t2,t3,t4, t5,t6,t7,t8
            synchronized(DoubleLockedSingleton.class){
                if(dls==null){
                    dls = new DoubleLockedSingleton();
                }
            }
        }
        return dls;

    }
    
}
