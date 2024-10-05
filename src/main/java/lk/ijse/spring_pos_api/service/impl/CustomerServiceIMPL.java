package lk.ijse.spring_pos_api.service.impl;

import lk.ijse.spring_pos_api.customObj.CustomerResponse;
import lk.ijse.spring_pos_api.customObj.impl.CustomerErrorResponse;
import lk.ijse.spring_pos_api.dao.CustomerDAO;
import lk.ijse.spring_pos_api.dto.CustomerDTO;
import lk.ijse.spring_pos_api.entity.CustomerEntity;
import lk.ijse.spring_pos_api.exception.CustomerNotFoundException;
import lk.ijse.spring_pos_api.service.CustomerService;
import lk.ijse.spring_pos_api.util.AppUtil;
import lk.ijse.spring_pos_api.util.MappingUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private final CustomerDAO customerDAO;

    @Autowired
    private final MappingUtil mappingUtil;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setCustomerId(generateCustomerID());
        customerDTO.setName(customerDTO.getFirstName() + " " + customerDTO.getLastName());
        customerDTO.setLastUpdatedAt(AppUtil.getCurrentDateTime());
        CustomerEntity customerEntity = mappingUtil.convertToCustomerEntity(customerDTO);
        customerDAO.save(customerEntity);
        System.out.println("Customer saved : " + customerEntity);
        return "Customer saved successfully";
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {
        Optional<CustomerEntity> tmpCustomer = customerDAO.findById(id);
        if (!tmpCustomer.isPresent()) {
            System.out.println("Customer not found");
            throw new CustomerNotFoundException("Customer not found");
        } else {
            tmpCustomer.get().setName(customerDTO.getFirstName() + " " + customerDTO.getLastName());
            tmpCustomer.get().setAddress(customerDTO.getAddress());
            tmpCustomer.get().setMobile(customerDTO.getMobile());
            tmpCustomer.get().setLastUpdatedAt(AppUtil.getCurrentDateTime());
            System.out.println("Customer updated : " + customerDTO);
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (customerDAO.existsById(id)) {
            customerDAO.deleteById(id);
            System.out.println("Customer deleted : " + id);
        } else {
            System.out.println("Customer not found");
            throw new CustomerNotFoundException("Customer not found");
        }
    }

    @Override
    public CustomerResponse getCustomerById(String id) {
        if (customerDAO.existsById(id)) {
            CustomerEntity customerEntity = customerDAO.getReferenceById(id);
            System.out.println("Customer found : " + customerEntity);
            CustomerDTO customerDTO = mappingUtil.convertToCustomerDTO(customerEntity);
            customerDTO.setFirstName(customerDTO.getName().split(" ")[0]);
            customerDTO.setLastName(customerDTO.getName().split(" ")[1]);
            return customerDTO;
        } else {
            System.out.println("Customer not found");
            return new CustomerErrorResponse(0, "Customer not found");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    private String generateCustomerID() {
        if (customerDAO.count() == 0) {
            return "C001";
        } else {
            String lastId = customerDAO.findAll().get(customerDAO.findAll().size() - 1).getCustomerId();
            int newId = Integer.parseInt(lastId.substring(1)) + 1;
            if (newId < 10) {
                return "C00" + newId;
            } else if (newId < 100) {
                return "C0" + newId;
            } else {
                return "C" + newId;
            }
        }
    }
}
