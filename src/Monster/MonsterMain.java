package Monster;

public class MonsterMain {
    public static void main(String[] args) {
        Monster shreek = new Troll("Shreek", 100, 30);
        Monster wolf = new WereWolf("wolf", 100, 12);
        printAttactResult(shreek);
        printAttactResult(wolf);

    }
    private static void printAttactResult(Monster monster){
        System.out.println("attact result"+monster.attact());
    }
}
