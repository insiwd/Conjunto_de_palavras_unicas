import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavasUnicas;

  public ConjuntoPalavrasUnicas() {
    this.palavasUnicas = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavasUnicas.add(palavra);
  }

  @Override
  public String toString() {
    return "palavasUnicas = " + palavasUnicas;
  }




}
