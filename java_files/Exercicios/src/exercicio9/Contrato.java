package exercicio9;

public class Contrato implements Impressao {
    private String partes;
    private String objeto;
    private String dataAssinatura;

    public Contrato(String partes, String objeto, String dataAssinatura) {
        this.partes = partes;
        this.objeto = objeto;
        this.dataAssinatura = dataAssinatura;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Contrato ===");
        System.out.println("Partes envolvidas: " + partes);
        System.out.println("Objeto do Contrato: " + objeto);
        System.out.println("Data de Assinatura: " + dataAssinatura);
        System.out.println("================");
    }
}
