package com.github.chengbin.service.impl;

import com.github.chengbin.entity.FootballMatch;
import com.github.chengbin.mapper.FootballMatchMapper;
import com.github.chengbin.service.FootballMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
@Service
public class FootballMatchServiceImpl implements FootballMatchService {

    @Autowired
    private FootballMatchMapper footballMatchMapper;

    @Override
    public int deleteByPrimaryKey(String matchId) {
        return footballMatchMapper.deleteByPrimaryKey(matchId);
    }

    @Override
    public int insert(FootballMatch footballMatch) {
        return footballMatchMapper.insertSelective(footballMatch);
    }

    @Override
    public FootballMatch selectByPrimaryKey(String matchId) {
        return footballMatchMapper.selectByPrimaryKey(matchId);
    }

    @Override
    public int updateByPrimaryKeySelective(FootballMatch footballMatch) {
        return footballMatchMapper.updateByPrimaryKeySelective(footballMatch);
    }
}
