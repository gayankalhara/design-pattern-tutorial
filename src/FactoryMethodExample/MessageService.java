package FactoryMethodExample;

public abstract class MessageService {
    private static MessageService instance;

    public abstract Message createMessage(String content); //This is the Factory Method

    private static MessageService SimpleMessageFactory(){
        return new SmsMessageService();
    }

    static MessageService getInstance(){
        if (instance == null) instance = MessageService.SimpleMessageFactory();
        return instance;
    }
}
