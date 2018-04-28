package com.cmpe277.service.impl;

import com.cmpe277.dao.api.ItemDAO;
import com.cmpe277.dao.impl.ItemDAOImpl;
import com.cmpe277.exception.ItemException;
import com.cmpe277.service.api.ItemService;
import com.cmpe277.ui.api.UIItemService;
import com.cmpe277.vo.Item;

/**
 * Created by ravisha on 4/26/18.
 */

public class ItemServiceImpl implements ItemService {

    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public void add(Item item) {
        try {
            itemDAO.add(item);
        } catch (ItemException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            itemDAO.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(String itemId, UIItemService uiItemService) {
        try {
            itemDAO.read(itemId,uiItemService);
        } catch (ItemException e) {
            e.printStackTrace();
        }
    }
}
