import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class MockitoTest {
    private FilmRepository repository = Mockito.mock(FilmRepository.class);
    private FilmManager manager = new FilmManager(repository);

    private PurchaseFilm itsOwnWar = new PurchaseFilm(20220601, 1, "Своя война", 200, 99);
    private PurchaseFilm artek = new PurchaseFilm(20220602, 2, "Артек", 100, 105);
    private PurchaseFilm escortGirls = new PurchaseFilm(20220603, 3, "Эскортницы", 120, 86);

   @Test
    void firstTest() {


       PurchaseFilm[] returned = {itsOwnWar, artek, escortGirls};
       doReturn(returned).when(repository).findAll();

       PurchaseFilm[] expected = manager.findAll();
       PurchaseFilm[] actual = {itsOwnWar, artek, escortGirls};
       Assertions.assertArrayEquals(expected, actual);

       verify(repository).findAll();
   }
}
