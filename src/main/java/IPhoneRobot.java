class IPhoneRobot {
    private Iphone iphone;

    IPhoneRobot(Iphone iphone) {
        this.iphone = iphone;
    }

    void call(String message) {
        iphone.call(message);
    }
}
