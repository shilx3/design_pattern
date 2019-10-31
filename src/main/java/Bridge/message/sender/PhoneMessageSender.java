package Bridge.message.sender;

public class PhoneMessageSender implements MessageSender {
    @Override
    public void send(String msg) {
        System.out.println("发送手机短消息");
    }
}
