package com.green.boardver3.board.model;

import lombok.Data;

@Data
public class BoardDto {
    private int page;
    private int startIdx;
    private int rowLen;
}
