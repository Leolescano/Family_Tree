import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Utils {
  public static Set<Relative> createFamily() {

    // Generación 1
    Relative bisabuelo = new Relative(1, "Bisabuelo", "Carlos", -1);

    // Generación 2
    Relative abuelo1 = new Relative(2, "Abuelo Materno", "Roberto", 1);
    Relative abuela1 = new Relative(3, "Abuela Materna", "Isabela", 1);

    Relative abuelo2 = new Relative(4, "Abuelo Paterno", "Naco", 1);
    Relative abuela2 = new Relative(5, "Abuela Paterna", "Angelita", 1);

    // Generación 3
    Relative madre = new Relative(6, "Madre", "Susana", 3);
    Relative padre = new Relative(7, "Padre", "Calos", 4);

    Relative tio = new Relative(8, "Tío", "Beto", 4);
    Relative tia = new Relative(9, "Tía", "Bety", 2);

    // Generación 4
    Relative yo = new Relative(10, "Yo", "Leonardo", 7);
    Relative hermano = new Relative(11, "Hermano", "Mariano", 7);
    Relative primo = new Relative(12, "Primo", "Daniel", 8);

    return new LinkedHashSet<>(
        Arrays.asList(
            bisabuelo, abuelo1, abuela1, abuelo2, abuela2, madre, padre, tio, tia, yo, hermano,
            primo));
  }
}
