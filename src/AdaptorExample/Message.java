package AdaptorExample;

public abstract class Message {
    public String content;

    public void setContent(String content){
        this.content = content;
    }

    public abstract void send();
}