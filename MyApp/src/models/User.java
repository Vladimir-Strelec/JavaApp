package models;

public class User {
    private String name;
    private Integer pinCode;
    private String phoneNumber;
    private UserType type;

    public User(String name, Integer pinCode, String phoneNumber, UserType type) {
        this.name = name;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
