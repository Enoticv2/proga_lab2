package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {
    public DracoMeteor(){
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }
    @Override
    protected String describe(){
        return "применяет Draco Meteor";
    }
}