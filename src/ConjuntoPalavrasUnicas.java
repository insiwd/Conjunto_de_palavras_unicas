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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((palavasUnicas == null) ? 0 : palavasUnicas.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
    if (palavasUnicas == null) {
      if (other.palavasUnicas != null)
        return false;
    } else if (!palavasUnicas.equals(other.palavasUnicas))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "palavasUnicas = " + palavasUnicas;
  }

}
