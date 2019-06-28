public class Android extends Mobile {
    Android(Integer messageLimit) {
        super(messageLimit);
    }

    public Android() {

    }

    @Override
    protected String generateMessage(String message) {
        if (isMessageOverLimit(message)) {
            return "<Android> " + super.generateCannotSendMessage();
        }
        return "<Android>" + super.generateMessage(message);
    }


}
