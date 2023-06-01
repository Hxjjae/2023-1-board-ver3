package com.green.boardver3.cmt.model;


import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CmtRes {
    private int isMore; // 0 댓글 더 없음 ,1 댓글 더 있음
    private List<CmtVo> list;
}
