package be_study.json_dto_quiz;

public class ContactDto {
    private String type;
    private String value;

    public ContactDto() {
    }

    public ContactDto(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ContactDto{type='" + type + '\'' + ", value='" + value + '\'' + '}';
    }
}
