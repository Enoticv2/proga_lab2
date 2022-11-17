package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Kabutops extends Kabuto {
    public Kabutops(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(60, 115, 105, 65, 70, 80);
        this.addMove(new RockSlide());
        this.addMove(new Blizzard());
        this.addMove(new MegaDrain());
        this.addMove(new StoneEdge());
    }
}