package lk.ijse.spring_pos_api.dao;

import lk.ijse.spring_pos_api.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<OrderEntity, String> {}
