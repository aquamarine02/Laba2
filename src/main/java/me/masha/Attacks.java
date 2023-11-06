package me.masha;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;
public class Attacks {
    static class Sludge_wave extends PhysicalMove {
        public Sludge_wave(){
            super(Type.POISON, 95.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            if (Math.random() <= 0.1){
                Effect.poison(def);
                System.out.println(def + "был отравлен");
            }
            return damage;
        }
        protected String describe() {
            return "использует способность Sluge wave";
        }
    }
    static class Flamethrower extends SpecialMove {
        public Flamethrower(){
            super(Type.FIRE, 90.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            if (Math.random() <= 0.1){
                Effect.burn(def);
                System.out.println(def + "был подожжен");
            }
            return damage;
        }
        protected String describe() {
            return "использует способность Flamethrower";
        }
    }

    static class Poison_Jab extends SpecialMove {
        public Poison_Jab(){
            super(Type.POISON, 80.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            if (Math.random() <= 0.3){
                Effect.poison(def);
                System.out.println(def + "был отравлен");
            }
            return damage;
        }
        protected String describe() {
            return "использует способность Poison Jab";
        }
    }

    static class Rest extends StatusMove {
        public Rest() {
            super(Type.PSYCHIC, 0, 0);
        }

        protected void applySelfEffects(Pokemon att) {
            Effect Rest = new Effect().condition(Status.SLEEP);
            Rest.turns(2);//.stat(Stat.HP, 73);
            att.restore();
        }
        protected String describe() {
            return "использует способность Rest";
        }
    }

    static class Leaf_Blade extends PhysicalMove {
        public Leaf_Blade(){
            super(Type.GRASS, 90.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            if (Math.random() <= 0.125){
                System.out.println("Критический удар");
                return damage*2.0;
            }
            return damage;
        }
        protected String describe() {
            return "использует способность Leaf Blade";
        }
    }
    static class Swords_Dance extends StatusMove {
        public Swords_Dance() {
            super(Type.NORMAL, 0, 0);
        }
        protected void applyOppEffects(Pokemon def) {
            def.setMod(Stat.ATTACK, +2);
        }
        protected String describe() {
            return "использует способность Swoeds Dance";
        }
    }
    static class Petal_Blizzard extends PhysicalMove {
        public Petal_Blizzard(){
            super(Type.WATER, 80.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            return damage;
        }
        protected String describe() {
            return "использует способность Petal Blizzard";
        }
    }
    static class Waterfall extends PhysicalMove {
        public Waterfall(){
            super(Type.WATER, 80.0, 100.0);
        }
        protected double calcBaseDamage(Pokemon att, Pokemon def) {
            double damage = super.calcBaseDamage(att, def);
            if (Math.random() <= 0.2){
                Effect.flinch(def);
                System.out.println(def + "был испуган");
            }
            return damage;
        }
        protected String describe() {
            return "использует способность Waterfall";
        }
    }
    static class Tail_Whip extends StatusMove {
        public Tail_Whip() {
            super(Type.NORMAL, 0, 100);
        }
        protected void applyOppEffects(Pokemon def) {
            def.setMod(Stat.DEFENSE, -1);
        }
        protected String describe() {
            return "использует способность Tail Whip";
        }
    }
    static class Refresh extends StatusMove {
        public Refresh() {
            super(Type.NORMAL, 0, 0);
        }
        protected void applySelfEffects(Pokemon att) {
            Effect Refresh = new Effect();
            Refresh.clear();
        }
        protected String describe() {
            return "использует способность Refresh";
        }
    }
    static class Confide extends StatusMove {
        public Confide() {
            super(Type.NORMAL, 0.0, 0.0);
        }
        protected void applyOppEffects(Pokemon deff) {
            deff.setMod(Stat.SPECIAL_ATTACK, -1);
        }

        protected String describe() {
            return "использует способность Confide";
        }
    }
}
