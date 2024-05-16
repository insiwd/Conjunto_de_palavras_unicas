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

  public void removerPalavra(String palavra) {
    String palavrasParaRemover = null;
    for (String s : palavasUnicas) {
      if (s == palavra) {
        palavrasParaRemover = s;
      }
      break;
    }
    palavasUnicas.remove(palavrasParaRemover);
  }

  public boolean verificarPalavra(String palavra) {
    return palavasUnicas.contains(palavra);
  }


  @Override
  public String toString() {
    return "palavasUnicas = " + palavasUnicas;
  }

}
