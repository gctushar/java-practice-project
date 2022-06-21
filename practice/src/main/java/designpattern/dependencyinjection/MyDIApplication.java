package designpattern.dependencyinjection;

public class MyDIApplication implements Consumer {

    MessageService messageService;

    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String message, String receiver) {
        //do data validation filtering before sending
        this.messageService.sendMessage(message, receiver);
    }

}
