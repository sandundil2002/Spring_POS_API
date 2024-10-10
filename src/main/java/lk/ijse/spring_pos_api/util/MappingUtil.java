package lk.ijse.spring_pos_api.util;

import lk.ijse.spring_pos_api.dto.CustomerDTO;
import lk.ijse.spring_pos_api.dto.ItemDTO;
import lk.ijse.spring_pos_api.dto.OrderDTO;
import lk.ijse.spring_pos_api.dto.OrderDetailDTO;
import lk.ijse.spring_pos_api.entity.CustomerEntity;
import lk.ijse.spring_pos_api.entity.ItemEntity;
import lk.ijse.spring_pos_api.entity.OrderDetailEntity;
import lk.ijse.spring_pos_api.entity.OrderEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MappingUtil {
    @Autowired
    private ModelMapper modelMapper;

    //mapping by customer entity & dto
    public CustomerDTO convertToCustomerDTO(CustomerEntity entity){
        return modelMapper.map(entity, CustomerDTO.class);
    }

    public CustomerEntity convertToCustomerEntity(CustomerDTO dto){
        return modelMapper.map(dto, CustomerEntity.class);
    }

    public List<CustomerDTO> convertToCustomerDTOList(List<CustomerEntity> entities){
        return modelMapper.map(entities, List.class);
    }

    //mapping by item entity & dto
    public ItemDTO convertToItemDTO(ItemEntity entity){
        return modelMapper.map(entity, ItemDTO.class);
    }

    public ItemEntity convertToItemEntity(ItemDTO dto){
        return modelMapper.map(dto, ItemEntity.class);
    }

    public List<ItemDTO> convertToItemDTOList(List<ItemEntity> entities){
        return modelMapper.map(entities, List.class);
    }

    //mapping by order entity & dto
    public OrderEntity convertToOrderEntity(OrderDTO dto){
        return modelMapper.map(dto, OrderEntity.class);
    }

    //mapping by order details entity & dto
    public OrderDetailEntity convertToOrderDetailEntity(OrderDetailDTO dto){
        return modelMapper.map(dto, OrderDetailEntity.class);
    }
}
