package com.safenar.data;

public enum Abilities {
    DOUBLE_JUMP(new Ability("Double Jump", "Allows the player to jump twice in a row.", "double_jump")),
    ;
    private final Ability ability;

    Abilities(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }
}
