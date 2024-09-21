package exercicio9;

public class Main {
    public static void main(String[] args) {
        Impressao relatorio = new Relatorio("Relatório de Desempenho Anual", 
            "Este relatório contém uma análise detalhada dos KPIs e recomendações estratégicas para o próximo ano.", 
            "Carlos Souza");
        Impressao contrato = new Contrato("Empresa ABC e Empresa XYZ", 
            "Prestação de serviços de consultoria em tecnologia", 
            "15/09/2024");

        relatorio.imprimir();
        contrato.imprimir();
    }
}
