package com.safenar;

import java.awt.*;

public class Main {

    public static void println(Object word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(MyFrame::new);
    }
}
