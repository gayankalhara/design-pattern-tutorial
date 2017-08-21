package FactoryMethodExample;

public class EmailMessageService extends MessageService {
    @Override
    public Message createMessage(String content) {
        return new EmailMessage(content);
    }
}
