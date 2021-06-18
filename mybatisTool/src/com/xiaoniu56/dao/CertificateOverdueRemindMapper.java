package com.xiaoniu56.dao;

import com.xiaoniu56.model.defaults.CertificateOverdueRemind;
import com.xiaoniu56.model.defaults.CertificateOverdueRemindExample;
import java.util.List;

public interface CertificateOverdueRemindMapper {
    int countByExample(CertificateOverdueRemindExample example);

    int deleteByExample(CertificateOverdueRemindExample example);

    int deleteByPrimaryKey(String id);

    int insert(CertificateOverdueRemind record);

    int insertSelective(CertificateOverdueRemind record);

    List<CertificateOverdueRemind> selectByExample(CertificateOverdueRemindExample example);

    CertificateOverdueRemind selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CertificateOverdueRemind record);

    int updateByPrimaryKey(CertificateOverdueRemind record);
}