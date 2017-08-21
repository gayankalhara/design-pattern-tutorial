package SimpleFactoryExample;

public class ConsoleLogger extends Logger {
    @Override
    public void LogError(Throwable ex) {
        ex.printStackTrace();
    }
}
