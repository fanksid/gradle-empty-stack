public class Iphone extends Mobile {
    public Iphone() {
    }

    Iphone(Integer messageLimit) {
        super(messageLimit);
    }

    @Override
    protected String generateMessage(String message) {
        if (isMessageOverLimit(message)) {
            return "<iPhone> " + super.generateCannotSendMessage();
        }
        return "<iPhone>" + super.generateMessage(message);
    }
}
