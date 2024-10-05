package lk.ijse.spring_pos_api.service;

import lk.ijse.spring_pos_api.customObj.CustomerResponse;
import lk.ijse.spring_pos_api.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    String saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(String id, CustomerDTO customerDTO);
    void deleteCustomer(String id);
    CustomerResponse getCustomerById(String id);
    List<CustomerDTO> getAllCustomers();
}
