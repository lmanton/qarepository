/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myfirstproject.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageUtilsTest {
    @Test void testGetMessage() {
        assertEquals("Qualquer mensagem", MessageUtils.getMessage());
    }
}
