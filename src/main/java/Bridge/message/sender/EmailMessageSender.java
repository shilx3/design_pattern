package Bridge.message.sender;

public class EmailMessageSender implements MessageSender {
    @Override
    public void send(String msg) {
        System.out.println("发送邮件消息");
    }
}
