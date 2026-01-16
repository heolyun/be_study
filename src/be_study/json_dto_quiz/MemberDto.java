package be_study.json_dto_quiz;

import java.util.List;

public class MemberDto {
    private Long id;
    private String name;
    private List<ContactDto> contacts;
    private AddressDto address;
    private List<OrderDto> orders;

    public MemberDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContactDto> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactDto> contacts) {
        this.contacts = contacts;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contacts=" + contacts +
                ", address=" + address +
                ", orders=" + orders +
                '}';
    }
}
