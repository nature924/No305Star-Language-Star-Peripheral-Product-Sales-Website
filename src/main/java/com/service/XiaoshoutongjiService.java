package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoutongjiView;


/**
 * 销售统计
 *
 * @author 
 * @email 
 * @date 2021-04-24 18:47:09
 */
public interface XiaoshoutongjiService extends IService<XiaoshoutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoutongjiVO> selectListVO(Wrapper<XiaoshoutongjiEntity> wrapper);
   	
   	XiaoshoutongjiVO selectVO(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
   	
   	List<XiaoshoutongjiView> selectListView(Wrapper<XiaoshoutongjiEntity> wrapper);
   	
   	XiaoshoutongjiView selectView(@Param("ew") Wrapper<XiaoshoutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoutongjiEntity> wrapper);
   	
}

