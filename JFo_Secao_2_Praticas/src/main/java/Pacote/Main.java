package Pacote;

public class Main {
    static void problem1(){
        /*Use oito instruções de impressão para recriar a carinha feliz acima.
        Sua arte baseia-se em um único caractere, além do espaço, como
        X ou #.*/
        System.out.println("    ########    ");
        System.out.println("  ##        ##  ");
        System.out.println("##  ##    ##  ##");
        System.out.println("##            ##");
        System.out.println("##  ##    ##  ##");
        System.out.println("##    ####    ##");
        System.out.println("  ##        ##  ");
        System.out.println("    ########    ");
    }

    static void problem2(){
        System.out.println("                 #    ");
        System.out.println("                #     ");
        System.out.println(" ###    #     ####   #");
        System.out.println("#   #   #    #    #  #");
        System.out.println("#   #   #    ######  #");
        System.out.println("#   #   #    #    #   ");
        System.out.println(" ###    #### #    #  #");
    }

    static void problem3(){
        Cobra cobra1 = new Cobra("jose", "jararaca", "entregador", 12);
        Caixa caixa1 = new Caixa(1 , 1, 1, cobra1);
        Cliente cliente1 = new Cliente("alfonso", 17, caixa1);
        cliente1.receberEntrega();
    }

    public static void main(String[] args) {
//        problem1();
//        problem2();
        problem3();
    }
}
