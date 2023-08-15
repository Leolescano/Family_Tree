import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode
public class Relative {

  private final Integer id;

  @Setter private String familyRelationship;

  @Setter private String name;

  @Setter private Integer fhaterId;

  @Setter private Relative fhater;

  public final List<Relative> relatives = new ArrayList<>();

  private static int calculatorID = 100; // (int) (Math.random() * 50);

  public Relative(String familyRelationship, String name, Relative fhater) {
    this.familyRelationship = familyRelationship;
    this.name = name;
    this.fhater = fhater;
    if (fhater == null) {
      this.id = 1;
      this.fhaterId = -1;

    } else {
      this.fhaterId = fhater.getId();
      this.id = this.fhaterId * calculatorID;
      calculatorID++;
    }
  }

  public void addRelative(Relative relative) {
    relatives.add(relative);
  }

  @Override
  public String toString() {
    if (this.fhaterId == 1) {
      return String.format("%s %s", this.name, this.familyRelationship);
    }
    if (this.familyRelationship.equals("I")) {
      return String.format("I am son of " + this.fhater.getName());
    }
    return String.format(
        "%s my %s son of %s", this.name, this.familyRelationship, this.fhater.getName());
  }
}
