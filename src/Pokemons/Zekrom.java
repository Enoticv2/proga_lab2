package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Zekrom extends Pokemon {
    public Zekrom(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(100, 150, 120, 120, 100, 90);
        this.addMove(new RockTomb());
        this.addMove(new ThunderFang());
        this.addMove(new BoltStrike());
        this.addMove(new DracoMeteor());
    }
}