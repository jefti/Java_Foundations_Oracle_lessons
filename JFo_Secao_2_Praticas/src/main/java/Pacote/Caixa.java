package Pacote;

public class Caixa {
    float altura;
    float largura;
    float comprimento;
    Cobra cobra;

    public Caixa(float altura, float largura, float comprimento, Cobra cobra){
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
        this.cobra = cobra;
    }

    public void calcularVolume(){
        float volume = this.altura * this.largura * this.comprimento;
        System.out.println("O volume da caixa é "+ volume + ".");
    }

    public void abrir(){
        System.out.println("A caixa foi aberta e dentro dela saiu uma cobra.");
        this.cobra.descrever();
    }
}
