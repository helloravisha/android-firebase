package com.cmpe277.dao.api;

import com.cmpe277.exception.ItemException;
import com.cmpe277.ui.api.UIItemService;
import com.cmpe277.vo.Item;

/**
 * Created by ravisha on 4/26/18.
 */

public interface ItemDAO {
    void add(Item item) throws ItemException;
    void read(String itemId,UIItemService uiItemService) throws ItemException;
    void delete(String id) throws Exception;

}
