package com.safenar.menu;

public class KeyboardOption extends Option {
    private int[] keyCodes;

    public KeyboardOption(String desc, int... keyCodes) {
        super(desc, Option.COMP_BUTTON);
        this.keyCodes = keyCodes;
    }

    public int[] getKeyCodes() {
        return keyCodes;
    }

    public void setKeyCodes(int... keyCodes) {
        this.keyCodes = keyCodes;
    }
}
