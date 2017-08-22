package AdaptorExample;

public class EmailMessage extends Message {
    public EmailMessage(String content){
        super.setContent(content);
    }

    @Override
    public void send() {
        System.out.println(super.getContent() + System.lineSeparator() + "Message sent via Email!");
    }
}
