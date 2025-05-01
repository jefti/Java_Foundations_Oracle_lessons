package Pacote;

public class Cliente {
    private String nome;
    private int idade;
    private Caixa entrega;

    public Cliente(String nome, int idade, Caixa entrega){
        this.nome = nome;
        this.idade = idade;
        this.entrega = entrega;
    }

    public void receberEntrega(){
        System.out.println("O cliente "+ nome+ " de "+ idade + " anos acaba de receber a entrega");
        System.out.println("O cliente vai abrir a entrega agora.");
        entrega.abrir();
    }
}
