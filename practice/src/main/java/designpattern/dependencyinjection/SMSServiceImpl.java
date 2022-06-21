package designpattern.dependencyinjection;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        //Logic to send SMS Message
        System.out.println("Sending SMS to: " + receiver);
        System.out.println("SMS Body: " + message);
    }
}
