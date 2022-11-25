package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK, 100, 80);
    }

///    @Override
///    protected double calcCriticalHit(Pokemon att,Pokemon def){
///        att.setMod(attack.chance(0.125));
///    }
    @Override
    protected String describe(){
        return "применяет Blizzard";
    }
}