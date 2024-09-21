package exercicio1e2e6;
public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;
    int velocidade;
    Motor motor;

    public Carro(String marca, String modelo, int ano, String cor, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0;
        this.motor = motor;
    }

    public void info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", ano=").append(ano);
        sb.append(", cor=").append(cor);
        sb.append(", ").append(motor.info());
        sb.append('}');
        System.out.println(sb.toString());
    }

    

    public void acelerar(int incremento){
        velocidade+=incremento;
    }

    public void frear(int decremento){
        velocidade-=decremento;
        if (velocidade<0){
            velocidade=0;
        }
    }

    public void exibirVelocidade() {
        System.out.println(modelo + " está a " + velocidade + " km/h.");
    }


    public static void main(String[] args) {
        Motor motor = new Motor(2000, 150);
        Carro carro1 = new Carro("Fiat", "Uno", 2010, "Cinza",motor);
        Carro carro2 = new Carro("Ford", "Fiesta", 2014, "Preto",motor);
        Carro carro3 = new Carro("Chevrolet", "Onix", 2020, "Prata",motor);

        carro1.info();
        carro2.info();
        carro3.info();

        carro1.acelerar(20);
        carro1.exibirVelocidade();
        carro1.frear(5);
        carro1.exibirVelocidade();
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    
}
