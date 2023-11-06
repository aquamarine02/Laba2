package me.masha;

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
  Battle b = new Battle();
        Pokemon p1 = new Pokemons.Seviper("Яд", 1);
        Pokemon p2 = new Pokemons.Lurantis("Лура", 1);
        Pokemon p3 = new Pokemons.Fomantis("Фома", 1);
        Pokemon p4 = new Pokemons.Azurill("Азик", 1);
        Pokemon p5 = new Pokemons.Marill("Мари", 1);
        Pokemon p6 = new Pokemons.Azumarill("Азумари", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
    }
