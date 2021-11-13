package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // Integer 하는 이유는 null을 넣어줄수도 있기 때문이다
    private Integer quantity;

    private Boolean open;   // 판매여부
    private List<String> regions; // 등록 지역
    private ItemType itemType; // 상품 종류
    private String deliveryCode; // 배송 방식

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }




}
