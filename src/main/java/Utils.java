import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Utils {
  public static Set<Relative> createFamily() {

    // Generation 1

    Relative beginningRelative = new Relative(null, null, null);

    // Generation 2
    Relative juanGrandfather1 = new Relative("Maternal grandfather", "Juan", beginningRelative);
    Relative LuisaGrandmother1 = new Relative("Maternal grandmother", "Luisa", beginningRelative);

    Relative nacoGrandfather2 = new Relative("Paternal grandfather", "Naco", beginningRelative);
    Relative angelitaGrandmother2 =
        new Relative("Paternal grandmother", "Angelita", beginningRelative);

    // Generation 3
    Relative susanaMother = new Relative("Mother", "Susana", juanGrandfather1);
    Relative carlosFather = new Relative("Father", "Carlos", nacoGrandfather2);

    Relative betoUncle = new Relative("Maternal uncle", "Beto", juanGrandfather1);
    Relative totyUncle = new Relative("Maternal uncle", "Toty", juanGrandfather1);

    Relative martaAunt = new Relative("Paternal aunt", "Marta", nacoGrandfather2);

    // Generation 4
    Relative iLeonardo = new Relative("I", "Leonardo", carlosFather);
    Relative marianoBrother = new Relative("Brother", "Mariano", carlosFather);
    Relative danielCousin = new Relative("Maternal cousin", "Daniel", betoUncle);
    Relative nicolasCousin = new Relative("Maternal cousin", "Nicolas", totyUncle);

    Relative nephew = new Relative("Nephew", "Unborn", marianoBrother);
    Relative mateoSecondCousin = new Relative("Second cousin", "Mateo", nicolasCousin);

    return new LinkedHashSet<>(
        Arrays.asList(
            mateoSecondCousin,
            danielCousin,
            juanGrandfather1,
            carlosFather,
            nacoGrandfather2,
            iLeonardo,
            angelitaGrandmother2,
            susanaMother,
            carlosFather,
            LuisaGrandmother1,
            betoUncle,
            martaAunt,
            nicolasCousin,
            marianoBrother,
            beginningRelative,
            nephew,
            totyUncle));
  }
}
