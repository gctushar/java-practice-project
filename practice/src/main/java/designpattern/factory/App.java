package designpattern.factory;

public class App {

    public static void main(String[] args) {

        Message message = MessageFactory.getMessage(MessageType.LongMessage);
        System.out.println(message.getMessage());

        message = MessageFactory.getMessage(MessageType.ShortMessage);
        System.out.println(message.getMessage());

        message = MessageFactory.getMessage(MessageType.VeryShortMessage);
        System.out.println(message.getMessage());
    }
}
