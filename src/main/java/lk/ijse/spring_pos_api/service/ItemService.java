package lk.ijse.spring_pos_api.service;

import lk.ijse.spring_pos_api.customObj.ItemResponse;
import lk.ijse.spring_pos_api.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    String saveItem(ItemDTO itemDTO);
    void updateItem(String id, ItemDTO itemDTO);
    void deleteItem(String id);
    ItemResponse getItemById(String id);
    List<ItemDTO> getAllItems();
}
