package Bridge.message.sender;

public class SystemMessageSender implements MessageSender {
    @Override
    public void send(String msg) {
        System.out.println("发送系统消息");
    }
}
