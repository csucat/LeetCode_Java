package 排序;

public class Singleton{
    public static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton(){

    }

    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1.instance.equals(s2.instance)){
            System.out.print("the same instance");
        }
    }
}

