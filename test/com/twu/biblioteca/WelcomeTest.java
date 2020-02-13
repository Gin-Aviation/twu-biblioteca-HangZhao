package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class WelcomeTest {

    @Test
    public void testBalabala() {
        String defaultWelcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
        Welcome welcome = new Welcome();
        String welcomeMessage = welcome.getMessage();
        assertThat(welcomeMessage, is(defaultWelcomeMessage));
    }

}
