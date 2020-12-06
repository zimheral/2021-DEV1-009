package com.zimheral.tictactoe;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
class TicTacToeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldDrawBoard() {

        //GIVEN
        val space = " ";
        val separator = "|";

        //WHEN
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(separator);
                if (j != 3) System.out.print(space);
            }
            System.out.println();
        }
    }

    @Test
    void shouldWriteInBoard() {

        //GIVEN
        List<Map<String, Integer>> values = new ArrayList<>();
        values.add(Collections.singletonMap("x", 2));
        values.add(Collections.singletonMap("x", 1));
        values.add(Collections.singletonMap("x", 0));
        val space = " ";
        val separator = "|";

        //WHEN
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(separator);
                if (j != 3) {
                    int col = j;
                    if(values.size()> i){
                        values.get(i).forEach((val, pos) -> {
                            if (pos == col) {
                                System.out.print(val);
                            } else {
                                System.out.print(space);
                            }
                        });
                    }else{
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }
}
