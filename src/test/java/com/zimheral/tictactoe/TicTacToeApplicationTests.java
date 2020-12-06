package com.zimheral.tictactoe;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class TicTacToeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void drawBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("|");
                if (j != 3) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
