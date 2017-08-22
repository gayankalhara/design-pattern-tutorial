package AdaptorExample;

public abstract class Message {
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public abstract void send();
}