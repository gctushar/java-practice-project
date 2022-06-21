package designpattern.factory;

import java.util.Arrays;
import java.util.Optional;

public enum MessageType {

    LongMessage("long"),
    ShortMessage("short"),
    VeryShortMessage("vshort");

    String value;

    MessageType(String value) {
        this.value = value;
    }

    public static MessageType getMessageType(String value) {
        MessageType messageType = Arrays.stream(MessageType.values()).filter(name -> name.equals(value)).findFirst().get();
        return messageType;
    }
}
