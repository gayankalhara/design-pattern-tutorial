package FactoryMethodExample;

public class FactoryMethodExample {
    public static void main(String args[]) {
        try{
            throw new Exception("This is an Exception!");
        }
        catch(Throwable ex){
            MessageService.getInstance().createMessage(ex.toString()).send();
        }
    }
}
