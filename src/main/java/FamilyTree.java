import java.util.*;

public class FamilyTree implements BuildTree, ShowFamilyTree {
  public Relative buildTree(Set<Relative> relatives) {
    Map<Integer, Relative> tree = new HashMap<>();

    for (Relative relative : relatives) {
      tree.put(relative.getId(), relative);
    }

    Relative firstRelative = null;

    for (Relative relative : relatives) {
      if (relative.getParentId()
          == -1) { // Suponiendo que -1 significa que no tiene padre (es primer pariente).
        firstRelative = relative;
      } else if (tree.containsKey(relative.getParentId())) {
        tree.get(relative.getParentId()).addRelative(relative);
      }
    }

    return firstRelative;
  }

  public void showFamilyTree(Relative relative, String indent) {

    if (relative == null) { // Para salir de la recursividad
      return;
    }

    System.out.println(indent + relative); // Imprime el pariente actual

    for (Relative child : relative.getRelatives()) {
      showFamilyTree(child, indent + "  "); // Imprime a los parientes con un espacio adicional
    }
  }
}
