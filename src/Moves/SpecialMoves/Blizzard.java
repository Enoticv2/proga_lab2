package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "применяет Blizzard";
    }
}