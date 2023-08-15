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

  @Setter private Integer fatherId;

  @Setter private Relative father;

  public final List<Relative> relatives = new ArrayList<>();

  private static int calculatorID = 10000;

  public Relative(String familyRelationship, String name, Relative father) {
    this.familyRelationship = familyRelationship;
    this.name = name;
    this.father = father;
    if (father == null) {
      this.id = 1;
      this.fatherId = -1;

    } else {
      this.fatherId = father.getId();
      this.id = this.fatherId * calculatorID;
      calculatorID++;
    }
  }

  public void addRelative(Relative relative) {
    relatives.add(relative);
  }

  @Override
  public String toString() {
   if (this.fatherId == 1) {
      return String.format("%s %s", this.name, this.familyRelationship);
   }
    if (this.familyRelationship.equals("I")) {
      return String.format("I am son of " + this.father.getName());
    }
    return String.format(
        "%s my %s son of %s", this.name, this.familyRelationship, this.father.getName());
  }
}
