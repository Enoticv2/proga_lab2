package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Scratch extends StatusMove {
    public Scratch(){
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe(){
        return "применяет Scratch";
    }
}