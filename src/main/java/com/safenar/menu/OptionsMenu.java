package com.safenar.menu;

import java.awt.*;

public class OptionsMenu extends Window {
    Option[] options;// TODO: 06.10.2021 improve

    public OptionsMenu(Frame owner, Option[] options) {
        super(owner);
        this.options = options;
    }
}
