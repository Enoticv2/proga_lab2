package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    public ThunderFang(){
        super(Type.ELECTRIC, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.1).condition(Status.PARALYZE);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "применяет Thunder Fang";
    }
}