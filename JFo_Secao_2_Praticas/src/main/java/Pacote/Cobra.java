package Pacote;

public class Cobra {
    private String nome;
    private String especie;
    private String cargo;
    private int comprimento;


    public Cobra(String nome, String especie, String cargo, int comprimento){
        this.especie = especie;
        this.nome = nome;
        this.cargo = cargo;
        this.comprimento = comprimento;
    }

    public void descrever(){
        System.out.println("Eu sou a cobra "+ this.nome+", da especie "+ this.especie );
        System.out.println("Tenho "+ this.comprimento +" metros de comprimento");
        System.out.println("E atuo no cargo de "+ this.cargo+".");
    }
}
