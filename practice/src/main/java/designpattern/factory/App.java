package designpattern.factory;

public class App {

    public static void main(String[] args) {

        Message message = MessageFactory.createMessage(MessageType.LongMessage);
        System.out.println(message.getMessage());

        message = MessageFactory.createMessage(MessageType.ShortMessage);
        System.out.println(message.getMessage());

        message = MessageFactory.createMessage(MessageType.VeryShortMessage);
        System.out.println(message.getMessage());
    }
}
