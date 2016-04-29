package com.skysport.inerfaces.mapper.info;

import com.skysport.core.mapper.CommonDao;
import com.skysport.inerfaces.bean.info.YearConfInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangjh on 2015/6/17.
 */
@Repository("yearConfManageDao")
public interface YearConfMapper extends CommonDao<YearConfInfo> {
    
}