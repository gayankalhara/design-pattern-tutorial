package SingletonExample;

public class SingletonExample {
    public static void main(String args[]){
        try{
            throw new Exception("This is an Exception!");
        }
        catch(Throwable ex){
            Logger.getInstance().LogError(ex);
        }
    }
}