package com.green.boardver3.board.model;

import lombok.Data;

@Data
public class BoardDetailDto {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String createdAt;
    private String updatedAt;
    private String iboardCmt;
}
