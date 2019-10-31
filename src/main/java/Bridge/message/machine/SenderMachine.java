package Bridge.message.machine;

import Bridge.message.sender.MessageSender;

public abstract class SenderMachine {

    MessageSender sender;

    public SenderMachine(MessageSender messageSender){
        this.sender = messageSender;
    }

    public void send(String message){
        sender.send(message);
    }

}
