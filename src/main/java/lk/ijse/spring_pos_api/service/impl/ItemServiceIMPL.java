package lk.ijse.spring_pos_api.service.impl;

import lk.ijse.spring_pos_api.customObj.ItemResponse;
import lk.ijse.spring_pos_api.dao.ItemDAO;
import lk.ijse.spring_pos_api.dto.ItemDTO;
import lk.ijse.spring_pos_api.entity.ItemEntity;
import lk.ijse.spring_pos_api.exception.ItemNotFoundException;
import lk.ijse.spring_pos_api.service.ItemService;
import lk.ijse.spring_pos_api.util.AppUtil;
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
    private final ItemDAO itemDAO;

    @Autowired
    private final MappingUtil mappingUtil;

    @Override
    public String saveItem(ItemDTO itemDTO) {
        itemDTO.setItemCode(generateItemID());
        itemDTO.setRegisterDate(AppUtil.getCurrentDate());
        ItemEntity itemEntity = mappingUtil.convertToItemEntity(itemDTO);
        itemDAO.save(itemEntity);
        System.out.println("Item saved : " + itemEntity);
        return "Item saved successfully";
    }

    @Override
    public void updateItem(String id, ItemDTO itemDTO) {

    }

    @Override
    public void deleteItem(String id) {

    }

    @Override
    public ItemResponse getItemById(String id) {
        if (itemDAO.existsById(id)) {
            return mappingUtil.convertToItemDTO(itemDAO.getReferenceById(id));
        } else {
            throw new ItemNotFoundException("Item not found");
        }
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return List.of();
    }

    private String generateItemID() {
        if (itemDAO.count() == 0) {
            return "I001";
        } else {
            String lastId = itemDAO.findAll().get(itemDAO.findAll().size() - 1).getItemCode();
            int newId = Integer.parseInt(lastId.substring(1)) + 1;
            if (newId < 10) {
                return "I00" + newId;
            } else if (newId < 100) {
                return "I0" + newId;
            } else {
                return "I" + newId;
            }
        }
    }
}
