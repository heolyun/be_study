package be_study.json_dto_quiz;

public class OrderItemDto {
    private Long id;
    private String name;
    private Integer quantity;

    public OrderItemDto() {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItemDto{id=" + id + ", name='" + name + '\'' + ", quantity=" + quantity + '}';
    }
}
