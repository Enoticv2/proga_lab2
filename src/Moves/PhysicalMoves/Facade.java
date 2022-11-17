package Moves.PhysicalMoves;
import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.FIRE, 70, 100);
    }

    public double calcBaseDamage(Pokemon att, Pokemon def){
        Status attStatus = att.getCondition();
        if (attStatus.equals(Status.POISON) || attStatus.equals(Status.PARALYZE)){
            return 140.0d;
        }
        else{
            return 70.0d;
        }
    }

    public String describe(){
        return "применяет Facade";
    }
}