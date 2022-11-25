package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Kabuto extends Pokemon {
    public Kabuto(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(30, 80, 90, 55, 45, 55);
        this.addMove(new RockSlide());
        this.addMove(new Blizzard());
        this.addMove(new MegaDrain());
    }
}