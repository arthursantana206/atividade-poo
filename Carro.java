public class Carro {
public static void main(String[] args) {
    
}
    
    public String marca;
    public String modelo;
    public int ano;

    private int velocidade;

    public Carro() {
    }

    public void acelerar(int velTempo) {
        velocidade += velTempo;
    }

    public void frear(int velTempo) {
        velocidade -= velTempo;
    }

    public void exxibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }


}