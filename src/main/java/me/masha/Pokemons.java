package me.masha;
import ru.ifmo.se.pokemon.*;
import me.masha.*;
public class Pokemons {
    static class Seviper extends Pokemon{
        public Seviper (String name, Integer lvl){
            super(name, lvl);
            setType(Type.POISON);
            setStats(73.0, 100.0, 60.0, 100.0, 60.0, 65.0);
            setMove(new Attacks.Sludge_wave(), new Attacks.Flamethrower(),new Attacks.Rest(),new Attacks.Poison_Jab());
        }
    }
    static class Fomantis extends Pokemon{
        public Fomantis (String name, Integer lvl){
            super(name, lvl);
            setType(Type.GRASS);
            setStats(40.0, 55.0, 35.0, 50.0, 35.0, 35.0);
            setMove(new Attacks.Leaf_Blade(), new Attacks.Swords_Dance(), new Attacks.Poison_Jab());
        }
    }
    static class Lurantis extends Fomantis{
        public Lurantis (String name, Integer lvl){
            super(name, lvl);
            setType(Type.GRASS);
            setStats(70.0, 105.0, 90.0, 80.0, 90.0, 45.0);
            setMove(new Attacks.Petal_Blizzard());
        }
    }
    static class Azurill extends Pokemon{
        public Azurill (String name, Integer lvl){
            super(name, lvl);
            setType(Type.NORMAL, Type.FAIRY);
            setStats(50.0, 20.0, 40.0, 20.0, 40.0, 20.0);
            setMove(new Attacks.Waterfall(), new Attacks.Tail_Whip());
        }
    }
    static class Marill extends Azurill{
        public Marill (String name, Integer lvl){
            super(name, lvl);
            setType(Type.WATER, Type.FAIRY);
            setStats(70.0, 20.0, 50.0, 20.0, 50.0, 40.0);
            setMove(new Attacks.Refresh());
        }
    }
    static class Azumarill extends Marill{
        public Azumarill (String name, Integer lvl){
            super(name, lvl);
            setType(Type.WATER, Type.FAIRY);
            setStats(100.0, 50.0, 80.0, 60.0, 80.0, 50.0);
            setMove(new Attacks.Confide());
        }
    }
}
