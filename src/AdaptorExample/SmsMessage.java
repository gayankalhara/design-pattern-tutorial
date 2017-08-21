package AdaptorExample;

public class SmsMessage extends Message {
    public SmsMessage(String content){
        super.setContent(content);
    }

    @Override
    public void send() {
        System.out.println("Message sent via SMS!");
    }
}
