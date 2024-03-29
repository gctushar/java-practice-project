package designpattern.factory;

public class MessageFactory {


    public static Message createMessage(MessageType messageType) {
        switch (messageType) {
            case LongMessage:
                return new LongMessage();
            case ShortMessage:
                return new ShortMessage();
            case VeryShortMessage:
                return new VeryShortMessage();
            default:
                return null;
        }
    }
}
