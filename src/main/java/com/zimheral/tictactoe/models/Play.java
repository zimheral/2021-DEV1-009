package com.zimheral.tictactoe.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Play {
    private final Player playerType;
    private final Integer row;
    private final Integer column;
}
