package com.github.chengbin.service;


import com.github.chengbin.entity.FootballMatch;


/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
public interface FootballMatchService {

    int deleteByPrimaryKey(String matchId);

    int insert(FootballMatch record);

    FootballMatch selectByPrimaryKey(String matchId);

    int updateByPrimaryKeySelective(FootballMatch record);

}
