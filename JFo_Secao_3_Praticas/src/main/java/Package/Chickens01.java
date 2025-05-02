public class Chickens01 {

    public static void totalEggsCount(int eggsPerChicken, int chickenCount){
        int totalEggs = 0;
        //segunda-feira
        int count = chickenCount;
        totalEggs += count*eggsPerChicken;
        //terça-feira
        count++;
        totalEggs += count*eggsPerChicken;
        //Quarte-feira
        count = count/2;
        totalEggs += count*eggsPerChicken;
        //Solução
        System.out.println("O numero final de ovos é: "+ totalEggs);
    }

    public static void main(String[] args) {
        int eggsPerChicken = 4, chickenCount = 8;
        totalEggsCount(eggsPerChicken, chickenCount);
    }   
}
