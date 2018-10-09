package com.github.chengbin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FootballMatch implements Serializable {

    private static final long serialVersionUID = 8110800415196947784L;

    private String matchId;

    private Integer jcwId;

    private String color;

    private String issue;

    private String number;

    private Integer weekday;

   private Integer homeTeamId;

    private String homeTeamName;

    private Integer guestTeamId;

    private String guestTeamName;

    private String league;

    private Date matchTime;

    private Date endTime;

    private String halfScore;

    private String lastScore;

    private Integer spfSingleStatus;

    private Integer spfPassStatus;

    private Integer rqspfSingleStatus;

    private Integer rqspfPassStatus;

    private Integer bqcSingleStatus;

    private Integer bqcPassStatus;

    private Integer zjqSingleStatus;

    private Integer zjqPassStatus;

    private Integer bfSingleStatus;

    private Integer bfPassStatus;

    private Integer status;

    //0-待处理 1-自动撤单中 2-赛果获取中 3-已有赛果待审核 4-赛果人工审核成功
    //5-系统审核成功 6-计算奖金成功 7-奖金汇总成功 8-奖金核对成功 9-自动派奖成功
    //10-过关统计完成 11-战绩统计完成 12-派送返点成功 99-场次处理结束
    private Integer state;

    private Boolean ihot;

    private Date createTime;

    private Date updateTime;

}