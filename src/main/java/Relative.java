import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode
public class Relative {

  @Setter private int id;

  @Setter private String relationship;

  @Setter private String name;

  @Setter private int parentId;

  private final List<Relative> relatives = new ArrayList<>();

  public Relative(int id, String names, String name, int parentId) {
    this.id = id;
    this.relationship = names;
    this.name = name;
    this.parentId = parentId;
  }

  public void addRelative(Relative relative) {
    relatives.add(relative);
  }

  @Override
  public String toString() {
    return String.format("Relationship: %s Name: %s", this.relationship, this.name);
  }
}
