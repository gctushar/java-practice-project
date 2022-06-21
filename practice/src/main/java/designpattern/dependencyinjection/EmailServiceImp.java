package designpattern.dependencyinjection;

public class EmailServiceImp implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        //Logic to send Email Message
        System.out.println("Sending email to: " + receiver);
        System.out.println("Email Body: " + message);
    }
}
