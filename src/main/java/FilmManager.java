public class FilmManager {

    private FilmRepository repository;

    public FilmManager(FilmRepository repository) {
        this.repository = repository;
    }

    public void add(PurchaseFilm item) {
        repository.save(item);
    }

//    public PurchaseFilm[] getAll() {
//        PurchaseFilm[] items = repository.findAll();
//        PurchaseFilm[] result = new PurchaseFilm[items.length];
//        for (int i = 0; i < result.length; i++) {
//            int index = items.length - i - 1;
//            result[i] = items[index];
//        }
//        return result;
//    }

    public void findById(int id) {
        repository.findById(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public PurchaseFilm[] findAll() {
        return repository.findAll();
    }
}
