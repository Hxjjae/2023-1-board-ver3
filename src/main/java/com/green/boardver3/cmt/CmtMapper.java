package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmtMapper {
    int insCmt(CmtEntity entity);
    List<CmtVo> selCmt(CmtSelDto dto);
    int selBoardCmtRowCountByIBoard(int iboard);
    int delCmt(CmtEntity entity);
    int upCmt(CmtEntity entity);
    int max(CmtRes res);
}
