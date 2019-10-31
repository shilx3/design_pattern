package Bridge.message.machine;

import Bridge.message.sender.MessageSender;

public class GeneralSenderMachine extends SenderMachine {

    public GeneralSenderMachine(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message){
        System.out.println("本条为一般情况消息.");
        sender.send(message);
    }

}
