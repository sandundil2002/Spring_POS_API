package lk.ijse.spring_pos_api.dao;

import lk.ijse.spring_pos_api.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<CustomerEntity, String> {}
