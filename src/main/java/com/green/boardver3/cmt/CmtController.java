package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtEntity;
import com.green.boardver3.cmt.model.CmtInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cmt")
public class CmtController {
    private final CmtService service;
@Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }
    @PostMapping
    public int insCmt(@RequestBody CmtInsDto dto){
    return service.insCmt(dto);
    }
}
