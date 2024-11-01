package com.dao;

import com.entity.XiaoshoutongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoutongjiVO;
import com.entity.view.XiaoshoutongjiView;


/**
 * 销售统计
 * 
 * @author 
 * @email 
 * @date 2021-04-24 18:47:09
 */
public interface XiaoshoutongjiDao extends BaseMapper<XiaoshoutongjiEntity> {
	
	List<XiaoshoutongjiVO> selectListVO(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	XiaoshoutongjiVO selectVO(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	List<XiaoshoutongjiView> selectListView(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);

	List<XiaoshoutongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
	XiaoshoutongjiView selectView(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
	
}
