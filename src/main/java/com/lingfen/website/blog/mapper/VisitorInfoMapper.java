package com.lingfen.website.blog.mapper;

import com.lingfen.website.blog.bean.VisitorInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface VisitorInfoMapper extends Mapper<VisitorInfo> {

    Integer searchIpIsExist(@Param("ip") String ip);

    Integer updateVisitTimes(@Param("id") Integer id, @Param("updateTime") Date updateTime);

}
