import java.util.*;

public class FamilyTree implements BuildTree, ShowFamilyTree {
  public Relative buildTree(Set<Relative> relatives) {
    Map<Integer, Relative> familyTree = new HashMap<>();

    for (Relative relative : relatives) {
      familyTree.put(relative.getId(), relative);
    }

    Relative firstRelative = null;

    for (Relative relative : relatives) {
      if (relative.getFatherId()
          == -1) { // Suponiendo que -1 significa que no tiene padre (es primer pariente).
        firstRelative = relative;
      } else if (familyTree.containsKey(relative.getFatherId())) {
        familyTree.get(relative.getFatherId()).addRelative(relative);
      }
    }

    return firstRelative;
  }

  public static int cont = 1;

  public void showFamilyTree(Relative relative, String indent) {

    if (relative == null) { // Para salir de la recursividad
      cont = 1;
      return;
    }

   if (cont > 1) {
      System.out.println(indent + relative); // Imprime el pariente actual
    }

    for (Relative child : relative.getRelatives()) {
      cont++;
      showFamilyTree(child, indent + "   "); // Imprime a los parientes con un espacio adicional
    }
  }
}
