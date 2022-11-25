package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain(){
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, +20);
    }
    @Override
    protected String describe(){
        return "применяет Mega Drain";
    }
}