/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myfirstproject.app;

import myfirstproject.list.LinkedList;

import static myfirstproject.utilities.StringUtils.join;
import static myfirstproject.utilities.StringUtils.split;
import static myfirstproject.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
