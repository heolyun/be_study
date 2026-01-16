package be_study.json_dto_quiz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class QuizMain {
    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "\"id\": 1,\n" +
                "\"name\": \"John Doe\",\n" +
                "\"contacts\": [\n" +
                "{\n" +
                "\"type\": \"email\",\n" +
                "\"value\": \"john.doe@example.com\"\n" +
                "},\n" +
                "{\n" +
                "\"type\": \"phone\",\n" +
                "\"value\": \"01023456789\"\n" +
                "}\n" +
                "],\n" +
                "\"address\": {\n" +
                "\"street\": \"123 Main Street\",\n" +
                "\"city\": \"Seoul\",\n" +
                "\"zipcode\": \"12345\"\n" +
                "},\n" +
                "\"orders\": [\n" +
                "{\n" +
                "\"orderId\": \"ORD-001\",\n" +
                "\"date\": \"2024-07-09\",\n" +
                "\"items\": [\n" +
                "{\n" +
                "\"id\": 1,\n" +
                "\"name\": \"Smartphone\",\n" +
                "\"quantity\": 2\n" +
                "},\n" +
                "{\n" +
                "\"id\": 2,\n" +
                "\"name\": \"Laptop\",\n" +
                "\"quantity\": 1\n" +
                "}\n" +
                "]\n" +
                "},\n" +
                "{\n" +
                "\"orderId\": \"ORD-002\",\n" +
                "\"date\": \"2024-07-10\",\n" +
                "\"items\": [\n" +
                "{\n" +
                "\"id\": 3,\n" +
                "\"name\": \"Headphones\",\n" +
                "\"quantity\": 1\n" +
                "}\n" +
                "]\n" +
                "}\n" +
                "]\n" +
                "}";

        try {
            JSONParser parser = new JSONParser();
            JSONObject rootJson = (JSONObject) parser.parse(jsonStr);

            MemberDto member = new MemberDto();
            member.setId((Long) rootJson.get("id"));
            member.setName((String) rootJson.get("name"));

            // Contacts
            JSONArray contactsArray = (JSONArray) rootJson.get("contacts");
            List<ContactDto> contacts = new ArrayList<>();
            for (Object obj : contactsArray) {
                JSONObject contactJson = (JSONObject) obj;
                contacts.add(new ContactDto((String) contactJson.get("type"), (String) contactJson.get("value")));
            }
            member.setContacts(contacts);

            // Address
            JSONObject addressJson = (JSONObject) rootJson.get("address");
            AddressDto address = new AddressDto();
            address.setStreet((String) addressJson.get("street"));
            address.setCity((String) addressJson.get("city"));
            address.setZipcode((String) addressJson.get("zipcode"));
            member.setAddress(address);

            // Orders
            JSONArray ordersArray = (JSONArray) rootJson.get("orders");
            List<OrderDto> orders = new ArrayList<>();
            for (Object obj : ordersArray) {
                JSONObject orderJson = (JSONObject) obj;
                OrderDto order = new OrderDto();
                order.setOrderId((String) orderJson.get("orderId"));
                order.setDate((String) orderJson.get("date"));

                JSONArray itemsArray = (JSONArray) orderJson.get("items");
                List<OrderItemDto> items = new ArrayList<>();
                for (Object itemObj : itemsArray) {
                    JSONObject itemJson = (JSONObject) itemObj;
                    OrderItemDto item = new OrderItemDto();
                    item.setId((Long) itemJson.get("id"));
                    item.setName((String) itemJson.get("name"));
                    // json-simple parses numeric to Long by default
                    Object qty = itemJson.get("quantity");
                    if (qty instanceof Long) {
                        item.setQuantity(((Long) qty).intValue());
                    }
                    items.add(item);
                }
                order.setItems(items);
                orders.add(order);
            }
            member.setOrders(orders);

            // Verification
            System.out.println("--- Parsed DTO Structure ---");
            System.out.println(member);
            System.out.println("Name: " + member.getName());
            System.out.println("City: " + member.getAddress().getCity());
            System.out.println("First Order ID: " + member.getOrders().get(0).getOrderId());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
