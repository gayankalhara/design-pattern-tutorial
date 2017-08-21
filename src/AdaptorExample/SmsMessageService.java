package AdaptorExample;

public class SmsMessageService extends MessageService {

    @Override
    public Message createMessage(String content) {
        return new SmsMessage(content);
    }
}
