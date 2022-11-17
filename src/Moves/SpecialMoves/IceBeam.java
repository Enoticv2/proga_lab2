package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends PhysicalMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "применяет Ice Beam";
    }
}