package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class BoltStrike extends PhysicalMove {
    public BoltStrike(){
        super(Type.ELECTRIC, 130, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.2).condition(Status.PARALYZE);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "применяет Bolt Strike";
    }
}