package exercicio1e2e6;

public class Motor {
    private int cilindradas;
    private int potencia;

    public Motor(int cilindradas, int potencia) {
        this.cilindradas = cilindradas;
        this.potencia = potencia;
    }

    public String info() {
        return "Motor= {" + cilindradas + "cc, " + potencia + " HP}";
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
