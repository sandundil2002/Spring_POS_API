package lk.ijse.spring_pos_api.dao;

import lk.ijse.spring_pos_api.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDAO extends JpaRepository<ItemEntity, String> {}
