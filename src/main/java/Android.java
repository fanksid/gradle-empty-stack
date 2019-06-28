public class Android extends Mobile {
    Android(Integer messageLimit) {
        super(messageLimit);
    }

    public Android() {

    }

    @Override
    protected String generateMessage(String message) {
        return "<Android>" + super.generateMessage(message);
    }
}
