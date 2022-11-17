package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75.0, 90.0);
    }

    protected String describe() {
        return "применяет RockSlide";
    }
}