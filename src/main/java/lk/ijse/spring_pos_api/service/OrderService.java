package lk.ijse.spring_pos_api.service;

import lk.ijse.spring_pos_api.dto.OrderDTO;

public interface OrderService {
    String saveOrder(OrderDTO orderDTO);
}
