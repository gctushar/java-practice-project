package designpattern.factory;

public class ShortMessage implements Message{
    @Override
    public String getMessage() {
        return "This is a Short message";
    }
}
