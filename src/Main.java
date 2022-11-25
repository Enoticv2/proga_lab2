import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Kabuto kabuto = new Kabuto("Iron Man", 50);
        Kabutops kabutops = new Kabutops("Batman", 50);
        Nidoqueen nidoqueen = new Nidoqueen("Spider-Man", 50);
        NidoranF nidoranF = new NidoranF("Superman", 50);
        Nidorina nidorina = new Nidorina("Captain America", 50);
        Zekrom zekrom = new Zekrom("Flash", 50);

        b.addAlly(kabuto);
        b.addAlly(nidorina);
        b.addAlly(nidoqueen);

        b.addFoe(kabutops);
        b.addFoe(nidoranF);
        b.addFoe(zekrom);

        b.go();
    }
}