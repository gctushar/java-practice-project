package designpattern.factory;

public class LongMessage implements Message{
    @Override
    public String getMessage() {
        return "This is a long message";
    }
}
