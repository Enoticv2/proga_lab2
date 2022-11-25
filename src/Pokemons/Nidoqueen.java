package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(90, 92, 87, 75, 85, 76);
        this.addMove(new Facade());
        this.addMove(new IceBeam());
        this.addMove(new Growl());
        this.addMove(new Scratch());
    }
}