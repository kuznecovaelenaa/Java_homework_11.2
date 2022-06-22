public class FilmRepository {
    private PurchaseFilm[] items = new PurchaseFilm[0];

    public void save(PurchaseFilm item) {
        PurchaseFilm[] tmp = new PurchaseFilm[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PurchaseFilm[] findById(int id) {
        PurchaseFilm[] tmp = new PurchaseFilm[1];
        for (PurchaseFilm item : items) {
            if (item.getId() == id) {
                tmp[0] = item;
            }
        }
        items = tmp;
        return tmp;
    }

    public PurchaseFilm[] findAll() {
        return items;
    }

    public void removeById(int id) {
        PurchaseFilm[] tmp = new PurchaseFilm[items.length - 1];
        int index = 0;
        for (PurchaseFilm item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        PurchaseFilm[] tmp = new PurchaseFilm[0];
        items = tmp;
    }
}
