package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtEntity;
import com.green.boardver3.cmt.model.CmtInsDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmtService {
     private final CmtMapper mapper;

     @Autowired
    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int insCmt(CmtInsDto dto){
         CmtEntity entity = new CmtEntity();
         entity.setIboard(dto.getIboard());
         entity.setIuser(dto.getIuser());
         entity.setCtnt(dto.getCtnt());
         try{
             int result = mapper.insCmt(entity);
             if (result == 1) {
                 return entity.getIboardCmt();
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
        return 0;
    }

    public Lisv<> (){}



}
