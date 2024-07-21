package joselacio0.me.app.controlleres;
import joselacio0.me.app.models.Item;
import joselacio0.me.app.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemRepository itemRepository = new ItemRepository();

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemRepository.findById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item) {
        itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepository.delete(id);
    }
}