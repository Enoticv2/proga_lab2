package Pokemons;

import Moves.PhysicalMoves.*;
import Moves.SpecialMoves.*;
import Moves.StatusMoves.*;
import ru.ifmo.se.pokemon.*;

public class NidoranF extends Nidoqueen {
    public NidoranF(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ROCK, Type.WATER);
        this.setStats(55, 47, 52, 40, 40, 41);
        this.addMove(new Facade());
        this.addMove(new IceBeam());
    }
}