package com.safenar.menu;

import java.awt.*;

public class KeyboardOption extends Option {
    private int[] keyCodes;

    public KeyboardOption(String desc, Component comp, int... keyCodes) {
        super(desc, comp);
        this.keyCodes = keyCodes;
    }

    public int[] getKeyCodes() {
        return keyCodes;
    }

    public void setKeyCodes(int... keyCodes) {
        this.keyCodes = keyCodes;
    }
}
