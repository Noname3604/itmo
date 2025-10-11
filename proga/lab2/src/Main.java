import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon castform = new Castform("castform", 1);
        Pokemon sentret = new Sentret("sentret", 47);
        Pokemon furret = new Furret("furret", 56);

        Pokemon grubbin = new Grubbin("grubbin", 1);
        Pokemon charjabug = new Charjabug("charjabug", 43);
        Pokemon vikavolt = new Vikavolt("vikavolt", 1);

        b.addAlly(castform);
        b.addAlly(sentret);
        b.addAlly(furret);

        b.addFoe(grubbin);
        b.addFoe(charjabug);
        b.addFoe(vikavolt);

        b.go();
    }
    
}
