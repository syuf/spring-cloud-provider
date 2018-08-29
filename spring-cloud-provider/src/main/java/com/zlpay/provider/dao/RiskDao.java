package com.zlpay.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zlpay.provider.common.entity.Risk;
import com.zlpay.provider.common.entity.RiskExample;

public interface RiskDao {
    long countByExample(RiskExample example);

    int deleteByExample(RiskExample example);

    int deleteByPrimaryKey(String id);

    int insert(Risk record);

    int insertSelective(Risk record);

    List<Risk> selectByExample(RiskExample example);

    Risk selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Risk record, @Param("example") RiskExample example);

    int updateByExample(@Param("record") Risk record, @Param("example") RiskExample example);

    int updateByPrimaryKeySelective(Risk record);

    int updateByPrimaryKey(Risk record);
}