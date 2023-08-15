import java.util.*;

public class Program {
  public static void main(String[] args) {

    Set<Relative> family = Utils.createFamily();

    FamilyTree familyTree = new FamilyTree();

    Relative firstRelative = familyTree.buildTree(family);

    familyTree.showFamilyTree(firstRelative, " ");
  }
}
