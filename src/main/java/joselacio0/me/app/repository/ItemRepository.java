package joselacio0.me.app.repository;

import joselacio0.me.app.models.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private static final List<Item> items = new ArrayList<>();

    static {
        items.add(new Item(1L, "Item 1"));
        items.add(new Item(2L, "Item 2"));
    }

    public List<Item> findAll() {
        return items;
    }

    public Item findById(Long id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst().orElse(null);
    }

    public void save(Item item) {
        items.add(item);
    }

    public void delete(Long id) {
        items.removeIf(item -> item.getId().equals(id));
    }
}
