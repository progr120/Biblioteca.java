package eccomerce;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Storage {

    private Set<StorageItem> items = new HashSet<>();

    /*
     * carica un prodotto nel magazzino
     */
    public void load(Product product, int quantity) {
        StorageItem item = find(product)
                .orElse(new StorageItem(product, 0));
        item.setQuantity(item.getQuantity() + quantity);
        items.add(item);
    }

    /*
     * scarica un prodotto dal magazinno
     */
    public void unload(Product product, int quantity) {
        StorageItem item = isAvailable(product, quantity);
        item.setQuantity(item.getQuantity() - quantity);
    }

    /*
     * ritorna la disponibilità oppure errore
     */
    public StorageItem isAvailable(Product product, int quantity) {
        StorageItem found = find(product).orElseThrow(() -> new StorageException("product not exist"));
        if (found.getQuantity() < quantity) {
            throw new StorageException("quantity in not sufficient");
        }
        return found;
    }

    /*
     * prodotto rimosso dal magazzino
     */
    public void discontinue(Product p) {
        StorageItem found = find(p).orElseThrow(() -> new StorageException("product not exist"));
        found.discontinue();
    }

    /*
     * ricerca il nome di un prodotto
     */
    public Set<Product> findByName(String name) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name))
                .map(v -> v.getProduct())
                .collect(Collectors.toSet());
    }

    /*
     * ricerca un prodotto per nome
     */
    public List<Product> findByNameAndAvailabilities(String name, int quantity) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name) && v.getQuantity() > quantity)
                .map(v -> v.getProduct())
                .collect(Collectors.toList());
    }

    /*
     * carica i prodotti dal magazinno
     */
    public void logStatus() {
        System.out.println("----------------- STORAGE STATUS -----------------");
        items.forEach(System.out::println);
        System.out.println("----------------- STORAGE STATUS -----------------");
    }

    /*
     * ricerca il prodotto in magazzino
     */
    private Optional<StorageItem> find(Product p) {
        return items.stream()
                .filter(v -> v.getProduct().equals(p))
                .findFirst();
    }

    // ricerca il prodotto in magazzino

    // private Optional<StorageItem> findOldJava(Product p) {
    // Optional<StorageItem> result = Optional.empty();

    // for (StorageItem item : items) {
    // if (item.getProduct().equals(p)) {
    // result = Optional.of(item);
    // break;
    // }
    // }

    // return result;
    // }

    // public void loadOldJava(Product product, int quantity) {
    // Optional<StorageItem> tmp = find(product);
    // StorageItem it;
    // if (tmp.isPresent()) {
    // it = tmp.get();
    // it.setQuantity(it.getQuantity() + quantity);
    // } else {
    // it = new StorageItem(product, quantity);
    // items.add(it);
    // }
    // }
}