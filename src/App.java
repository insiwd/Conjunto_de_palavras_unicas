public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("ola");
        conjunto.adicionarPalavra("olar");
        System.out.println(conjunto);

        conjunto.removerPalavra("ola");
        System.out.println(conjunto);
    }
}
