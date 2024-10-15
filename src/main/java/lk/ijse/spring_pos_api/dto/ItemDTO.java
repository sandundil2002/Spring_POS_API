package lk.ijse.spring_pos_api.dto;

import jakarta.validation.constraints.*;
import lk.ijse.spring_pos_api.customObj.ItemResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO implements Serializable, ItemResponse {
    private String itemCode;
    @NotBlank(message = "Category cannot be blank")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Category must contain only letters")
    private String category;
    @Positive(message = "Unit price must be greater than zero")
    private double unitPrice;
    @Min(value = 1, message = "Quantity on hand cannot be negative")
    private int qtyOnHand;
    private String registerDate;
    @NotNull(message = "Expire date cannot be null")
    private String expireDate;
}
