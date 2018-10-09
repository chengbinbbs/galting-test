package com.github.chengbin.controller;

import com.github.chengbin.entity.FootballMatch;
import com.github.chengbin.service.FootballMatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangcb
 * @created 2018-01-19 13:33.
 */
@RestController
@RequestMapping("/football")
@Slf4j
public class FootballController {

    @Autowired
    private FootballMatchService footballMatchService;

    @RequestMapping(value = "/match",method = RequestMethod.POST)
    public FootballMatch selectMatchById(@RequestBody String matchId){
        return footballMatchService.selectByPrimaryKey(matchId);
    }
}
