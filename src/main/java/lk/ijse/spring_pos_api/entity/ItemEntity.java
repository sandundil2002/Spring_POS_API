package lk.ijse.spring_pos_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "items")
@Entity
public class ItemEntity implements Serializable {
    @Id
    private String itemCode;
    private String category;
    private double unitPrice;
    private int qtyOnHand;
    private LocalDate registerDate;
    private LocalDate expireDate;
}
