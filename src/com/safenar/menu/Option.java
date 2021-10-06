package com.safenar.menu;

import javax.swing.*;
import java.awt.*;

public class Option {
    public static final JButton COMP_BUTTON=new JButton();
    public static final JCheckBox COMP_CHECKBOX=new JCheckBox();


    protected String desc;
    private Component comp;//?

    public Option(String desc, Component comp) {
        this.desc = desc;
        this.comp = comp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Component getComp() {
        return comp;
    }

    public void setComp(Component comp) {
        this.comp = comp;
    }

}
