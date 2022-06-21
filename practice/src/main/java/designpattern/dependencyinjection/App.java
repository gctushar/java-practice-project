package designpattern.dependencyinjection;

public class App {

    public static void main(String[] args) {

        String message = "This is a message and this message will be used for Email";
        String receiverEmail = "testemail@test.com";
        String receiverPhone = "222-111-0000";

        Consumer consumer = new EmailServiceInjector().getConsumer();
        consumer.processMessage(message, receiverEmail);

        consumer = new SMSServiceInjector().getConsumer();
        consumer.processMessage(message, receiverPhone);


        System.out.println("\n\n--------------------------------------------");
        System.out.println("Testing with Constructor Injection");
        System.out.println("--------------------------------------------");

        MyDIApplication myDIApplication = new MyDIApplication(new SMSServiceImpl());
        myDIApplication.processMessage(message, receiverPhone);

        myDIApplication = new MyDIApplication(new EmailServiceImp());
        myDIApplication.processMessage(message, receiverEmail);

    }
}