package FactoryMethodExample;

public class EmailMessage extends Message{
    public EmailMessage(String content){
        super.setContent(content);
    }

    @Override
    public void send() {
        System.out.println("Message sent via Email!");
    }
}
