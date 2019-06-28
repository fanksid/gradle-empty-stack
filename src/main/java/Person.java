import java.util.Objects;

class Person {
    private String name;

    private Mobile mobile;

    Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }


    void call(String message) {
        mobile.call(message);
    }

    void changeMobile(Mobile mobile) {
        if (Objects.isNull(mobile)) {
            return;
        }

        this.mobile = mobile;
    }
}
