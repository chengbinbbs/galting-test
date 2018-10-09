package com.github.chengbin.mapper;

import com.github.chengbin.entity.FootballMatch;

public interface FootballMatchMapper {
    int deleteByPrimaryKey(String matchId);

    int insert(FootballMatch record);

    int insertSelective(FootballMatch record);

    FootballMatch selectByPrimaryKey(String matchId);

    int updateByPrimaryKeySelective(FootballMatch record);

    int updateByPrimaryKey(FootballMatch record);

}