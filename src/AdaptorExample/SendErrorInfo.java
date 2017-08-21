package AdaptorExample;

public class SendErrorInfo extends Logger{
    @Override
    public void logError(Throwable ex) {
        MessageService.getInstance().createMessage(ex.toString()).send();
    }
}
