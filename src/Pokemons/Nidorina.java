package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Nidorina extends Pokemon {
    public Nidorina(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(70, 62, 67, 55, 55, 56);
        this.addMove(new Facade());
        this.addMove(new Growl());
        this.addMove(new IceBeam());
    }
}