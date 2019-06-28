import java.util.Objects;

public class Mobile {
    Integer messageLimit;

    private String name;

    private String color;

    private String brand;

    public Mobile() {
    }

    Mobile(Integer messageLimit) {
        this.messageLimit = messageLimit;
    }

    Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    void call(String message) {
        System.out.println(generateMessage(message));
    }

    protected String generateMessage(String message) {
        return "Message : " + message;
    }

    void basicInfo() {
        System.out.println("name: " + name + ", color: " + color + ", brand: " + brand);
    }

    boolean isMessageOverLimit(String message) {
        return Objects.nonNull(messageLimit) && Objects.nonNull(message) && message.length() > messageLimit;
    }

    String generateCannotSendMessage() {
        return "Message cannot be sent";
    }
}
