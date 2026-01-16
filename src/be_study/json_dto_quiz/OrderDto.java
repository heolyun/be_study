package be_study.json_dto_quiz;

import java.util.List;

public class OrderDto {
    private String orderId;
    private String date;
    private List<OrderItemDto> items;

    public OrderDto() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDto{orderId='" + orderId + '\'' + ", date='" + date + '\'' + ", items=" + items + '}';
    }
}
