package com.zimheral.tictactoe;

import com.zimheral.tictactoe.models.Play;
import com.zimheral.tictactoe.models.Player;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BoardDrawingTest {

    @Test
    @DisplayName("Testing possible board drawing logic")
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
    @DisplayName("Testing possible board marking logic")
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
                    if (values.size() > i) {
                        values.get(i).forEach((val, pos) -> {
                            if (pos == col) {
                                System.out.print(val);
                            } else {
                                System.out.print(space);
                            }
                        });
                    } else {
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }

    @Test
    @DisplayName("Testing marking logic with Player, Play models")
    void shouldWriteInBoardWithPlayer() {

        //GIVEN
        Set<Play> playSet = new HashSet<>();
        playSet.add(Play.builder().playerType(Player.x).row(0).column(0).build());
        playSet.add(Play.builder().playerType(Player.x).row(1).column(1).build());
        playSet.add(Play.builder().playerType(Player.x).row(2).column(2).build());
        playSet.add(Play.builder().playerType(Player.o).row(0).column(1).build());
        playSet.add(Play.builder().playerType(Player.o).row(0).column(2).build());

        val space = " ";
        val separator = "|";

        //WHEN
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(separator);
                if (j != 3) {
                    int row = i;
                    int col = j;
                    Optional<Play> playFound = playSet.stream()
                            .filter(play -> play.getRow() == row && play.getColumn() == col)
                            .findFirst();
                    if (playFound.isPresent()) {
                        System.out.print(playFound.get().getPlayerType());
                    } else {
                        System.out.print(space);
                    }
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }

    }
}
