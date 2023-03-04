package fr.ensim.dp.map.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void backward(){
        Player player = new Player();
        player.play();
        player.backward();

        assertThrows(IllegalStateException.class, player::pause);
        assertThrows(IllegalStateException.class, player::play);

        assertDoesNotThrow(player::forward);

        player = new Player();
        player.play();
        player.backward();

        assertDoesNotThrow(player::stop);
    }
    @Test
    void forward(){
        Player player = new Player();
        player.play();
        player.forward();

        assertThrows(IllegalStateException.class, player::pause);
        assertThrows(IllegalStateException.class, player::play);

        assertDoesNotThrow(player::backward);

        player = new Player();
        player.play();
        player.forward();

        assertDoesNotThrow(player::stop);
    }
    @Test
    void pause(){
        Player player = new Player();
        player.play();
        player.pause();

        assertThrows(IllegalStateException.class, player::backward);
        assertThrows(IllegalStateException.class, player::forward);
        assertThrows(IllegalStateException.class, player::stop);

        player = new Player();
        player.play();
        player.pause();

        assertDoesNotThrow(player::play);
    }
    @Test
    void play(){
        Player player = new Player();
        player.play();

        assertDoesNotThrow(player::stop);

        player = new Player();
        player.play();

        assertDoesNotThrow(player::pause);

        player = new Player();
        player.play();

        assertDoesNotThrow(player::backward);

        player = new Player();
        player.play();

        assertDoesNotThrow(player::forward);
    }
    @Test
    void stop(){
        Player player = new Player();

        assertThrows(IllegalStateException.class, player::backward);
        assertThrows(IllegalStateException.class, player::forward);
        assertThrows(IllegalStateException.class, player::pause);

        assertDoesNotThrow(player::play);
    }
}