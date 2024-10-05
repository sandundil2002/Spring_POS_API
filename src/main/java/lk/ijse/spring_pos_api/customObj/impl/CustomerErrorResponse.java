package lk.ijse.spring_pos_api.customObj.impl;

import lk.ijse.spring_pos_api.customObj.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerErrorResponse implements CustomerResponse, Serializable {
    private int errorCode;
    private String errorMessage;
}
