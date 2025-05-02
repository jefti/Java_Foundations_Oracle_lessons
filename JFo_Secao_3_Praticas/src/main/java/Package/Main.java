
package Package;
import javax.swing.JOptionPane;

public class Main {
    public static void prepararDrink(){
        showMessage("BEM VINDO!","Esse é o preparador de drinks", 1);
        showMessage("SE PREPARE", "A partir de agora serão feitas várias mensagens para preparar seu drink customizado",1);
        String drinkName = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Escolha um nome para o seu drink",
                "NOME DO DRINK",
                2,
                null,
                null,
                "escreva aqui");
        String fruit = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Escolha uma fruta para o seu drink",
                "FRUTA",
                2,
                null,
                null,
                "escreva aqui");
        String fruitQuantityStr = javax.swing.JOptionPane.showInputDialog(null,
                "Quantas unidades da fruta " + fruit + " vão no seu drink ?",
                "QUANTIDADE DA FRUTA",
                2);

        int fruitQuantity = Integer.parseInt(fruitQuantityStr);

        String mixer1 = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Escolha uma primeira bebida para o seu drink",
                "PRIMEIRA BEBIDA",
                2,
                null,
                null,
                "escreva aqui");

        String mixer1QuantityStr = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Quanto de" + mixer1 + " será adicionado no seu drink ?",
                "PRIMEIRA BEBIDA",
                2,
                null,
                null,
                "escreva aqui (valor em litros)");
        Double mixer1Quantity = Double.parseDouble(mixer1QuantityStr);

        String mixer2 = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Escolha uma primeira bebida para o seu drink",
                "SEGUNDA BEBIDA",
                2,
                null,
                null,
                "escreva aqui");

        String mixer2QuantityStr = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Quanto de" + mixer2 + " será adicionado no seu drink ?",
                "SEGUNDA BEBIDA",
                2,
                null,
                null,
                "escreva aqui (valor em litros)");
        Double mixer2Quantity = Double.parseDouble(mixer2QuantityStr);

        String iceQuantityStr = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Quantas pedras de gelo vão no seu drink ?",
                "QUANTIDADE DE GELO",
                2,
                null,
                null,
                "escreva aqui (apenas números)");
        int iceQuantity = Integer.parseInt(iceQuantityStr);

        String MixingTimeStr = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Quanto tempo devo misturar os ingredientes ?",
                "TEMPO DE MISTURA",
                2,
                null,
                null,
                "escreva aqui");

        Double MixingTime = Double.parseDouble(MixingTimeStr);

        String personServedStr = (String)javax.swing.JOptionPane.showInputDialog(null,
                "Quantas pessoas o seu drink serve ?",
                "QUANTIDADE",
                2,
                null,
                null,
                "escreva aqui");

        int personServed = Integer.parseInt(personServedStr);

        showMessage("TUDO PRONTO!","Perfeito! seu drink está criado. Vamos passar um resumo.", 2);

        String resumeMessage = "Esse é um tutorial para preparar o drink "+ drinkName+".";
        showMessage(drinkName, resumeMessage, 1);

        Double totalQuantity = mixer1Quantity + mixer2Quantity;
        Double personQuantity = totalQuantity / personServed;
        resumeMessage = "Essa receita de "+ drinkName +" rende "+ totalQuantity + " litros."  ;
        showMessage(drinkName, resumeMessage, 1);

        resumeMessage = "Esta receita serve ao todo " + personServed + " pessoas (" + personQuantity + " litros por pessoa).";
        showMessage(drinkName, resumeMessage, 1);

        resumeMessage = "Para preparar o drink junte "+ fruitQuantity + " unidades de "+ fruit + " com "+ mixer1Quantity+" litros de "+ mixer1+ " e "+ mixer2Quantity + " litros de " + mixer2+ ".";
        showMessage(drinkName, resumeMessage, 1);

        resumeMessage = "Junte os ingredientes com " + iceQuantity + " pedras de gelo, e misture por "+ MixingTime + " minutos.";
        showMessage(drinkName, resumeMessage, 1);

        resumeMessage = "E voilá! o seu drink de "+ drinkName + " está pronto.";
        showMessage(drinkName, resumeMessage, 1);
    }

    public static void showMessage(String title, String message, int messageType){
        javax.swing.JOptionPane.showMessageDialog(null,
                message,
                title,
                messageType);
    }


    public static void main(String[] args) {
        prepararDrink();
    }
}
