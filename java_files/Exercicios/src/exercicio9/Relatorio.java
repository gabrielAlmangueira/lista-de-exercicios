package exercicio9;

public class Relatorio implements Impressao {
    private String titulo;
    private String conteudo;
    private String autor;

    public Relatorio(String titulo, String conteudo, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Relatório ===");
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Autor: " + autor);
        System.out.println("=================");
    }
}
