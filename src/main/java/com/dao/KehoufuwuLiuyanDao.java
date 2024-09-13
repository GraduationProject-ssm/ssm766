package com.dao;

import com.entity.KehoufuwuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KehoufuwuLiuyanView;

/**
 * 课后服务留言 Dao 接口
 *
 * @author 
 */
public interface KehoufuwuLiuyanDao extends BaseMapper<KehoufuwuLiuyanEntity> {

   List<KehoufuwuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}