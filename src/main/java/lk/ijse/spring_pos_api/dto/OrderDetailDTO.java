package lk.ijse.spring_pos_api.dto;

import lk.ijse.spring_pos_api.customObj.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailDTO implements Serializable, OrderResponse {
    private String orderId;
    private String itemCode;
    private int qty;
    private double unitPrice;
    private double total;
}
