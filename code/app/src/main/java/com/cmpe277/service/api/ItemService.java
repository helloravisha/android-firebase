package com.cmpe277.service.api;

import com.cmpe277.ui.api.UIItemService;
import com.cmpe277.vo.Item;

/**
 * Created by ravisha on 4/26/18.
 */

public interface ItemService {
    void add(Item item);
    void delete(String id);
    void read(String itemId,UIItemService uiItemService);

}
