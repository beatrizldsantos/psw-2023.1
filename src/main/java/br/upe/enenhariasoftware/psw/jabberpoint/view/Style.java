/**
 * UPE - Campus Garanhuns Curso de Bacharelado em Engenharia de Software
 * Disciplina de Projeto de Software - 2023.1
 *<p>
 * Licensed under the Apache License, Version 2.0
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * @author Ian F. Darwin, Helaine Lins
 */
package br.upe.enenhariasoftware.psw.jabberpoint.view;

import java.awt.Color;
import java.awt.Font;

public class Style {

    private static Style[] styles;

    private static final String FONTNAME = "Helvetica";
    int indent;
    Color color;
    Font font;
    int fontSize;
    int leading;

    public static void createStyles() {
        styles = new Style[5];
        styles[0] = new Style(0, Color.red, 48, 20); // nível 0
        styles[1] = new Style(20, Color.blue, 40, 10); // nível 1
        styles[2] = new Style(50, Color.black, 36, 10); // nível 2
        styles[3] = new Style(70, Color.black, 30, 10); // nivel 3
        styles[4] = new Style(90, Color.black, 24, 10); // nível 4
    }

    public static Style getStyle(int level) {
        if (level >= styles.length) {
            level = styles.length - 1;
        }

        return styles[level];
    }

    public Style(int indent, Color color, int points, int leading) {
        this.indent = indent;
        this.color = color;
        this.fontSize = points;
        font = new Font(FONTNAME, Font.BOLD, fontSize);
        this.leading = leading;
    }

    public String toString() {
        return "[" + indent + "," + color + "; " + fontSize + " on " + leading + "]";
    }

    public Font getFont(float scale) {
        return font.deriveFont(fontSize * scale);
    }

    public int getIndent() {
        return indent;
    }

    public int getLeading() {
        return leading;
    }

    public Color getColor() {
        return color;
    }

}
