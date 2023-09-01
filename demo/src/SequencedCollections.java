import java.util.ArrayList;
import java.util.List;

public class SequencedCollections {
    public static void main( String[] args ) {
        List<String> fight = List.of( "LOSE", "WINNER", "LOSE", "WINNER", "LOSE", "WINNER");
        List<String> mysteryOfFight = new ArrayList<>( fight );
        mysteryOfFight.addFirst( "WINNER");
        mysteryOfFight.addLast( "LOSE" );
        mysteryOfFight = mysteryOfFight.reversed();
        mysteryOfFight.removeFirst();
        mysteryOfFight.removeLast();
        System.out.println(mysteryOfFight);
    }
}