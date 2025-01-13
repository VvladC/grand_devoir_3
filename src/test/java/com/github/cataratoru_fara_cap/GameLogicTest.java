package com.github.cataratoru_fara_cap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameLogicTest {
    private GameLogic gameLogic;

    @Test
    public void testGameInitialization() {
        GameLogic game = new GameLogic("TestPlayer");
        game.initializeGame();
        assertNotNull(game);
    }

    @BeforeEach
    public void setUp() {
        gameLogic = new GameLogic();
        gameLogic.initializeGame();
    }
}