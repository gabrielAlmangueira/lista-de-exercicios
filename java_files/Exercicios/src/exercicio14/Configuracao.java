package exercicio14;

public class Configuracao {
    private static Configuracao instancia;
    private String config;

    // Construtor privado para evitar criação de novos objetos
    private Configuracao() {
        this.config = "Configuração padrão";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        System.out.println(config1 == config2);  // Saída: true
        System.out.println(config1.getConfig());  // Saída: Configuração padrão
        config1.setConfig("Nova configuração");
        System.out.println(config2.getConfig());  // Saída: Nova configuração
    }
}
