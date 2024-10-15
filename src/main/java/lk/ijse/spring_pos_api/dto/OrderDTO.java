package lk.ijse.spring_pos_api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lk.ijse.spring_pos_api.customObj.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements Serializable, OrderResponse {
    private String orderId;
    @NotBlank(message = "Customer ID cannot be blank")
    private String customerId;
    @NotEmpty(message = "Order must contain at least one order detail")
    @Valid
    private List<OrderDetailDTO> orderDetails;
    private String orderDateTime;
    private double total;
    @NotBlank(message = "Payment method cannot be blank")
    @Pattern(regexp = "cash|card|mobile", message = "Payment method must be either 'cash' or 'card'")
    private String paymentMethod;
}
