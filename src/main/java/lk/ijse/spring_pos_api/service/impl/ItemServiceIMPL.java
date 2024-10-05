package lk.ijse.spring_pos_api.service.impl;

import lk.ijse.spring_pos_api.customObj.ItemResponse;
import lk.ijse.spring_pos_api.dto.ItemDTO;
import lk.ijse.spring_pos_api.service.ItemService;
import lk.ijse.spring_pos_api.util.MappingUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemServiceIMPL implements ItemService {
    @Autowired
    private final ItemService itemService;

    @Autowired
    private final MappingUtil mappingUtil;

    @Override
    public String saveItem(ItemDTO itemDTO) {
        return "";
    }

    @Override
    public void updateItem(String id, ItemDTO itemDTO) {

    }

    @Override
    public void deleteItem(String id) {

    }

    @Override
    public ItemResponse getItemById(String id) {
        return null;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return List.of();
    }
}
