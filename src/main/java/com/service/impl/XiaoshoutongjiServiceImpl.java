package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoshoutongjiDao;
import com.entity.XiaoshoutongjiEntity;
import com.service.XiaoshoutongjiService;
import com.entity.vo.XiaoshoutongjiVO;
import com.entity.view.XiaoshoutongjiView;

@Service("xiaoshoutongjiService")
public class XiaoshoutongjiServiceImpl extends ServiceImpl<XiaoshoutongjiDao, XiaoshoutongjiEntity> implements XiaoshoutongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoutongjiEntity> page = this.selectPage(
                new Query<XiaoshoutongjiEntity>(params).getPage(),
                new EntityWrapper<XiaoshoutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoutongjiEntity> wrapper) {
		  Page<XiaoshoutongjiView> page =new Query<XiaoshoutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoutongjiVO> selectListVO(Wrapper<XiaoshoutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoutongjiVO selectVO(Wrapper<XiaoshoutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoutongjiView> selectListView(Wrapper<XiaoshoutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoutongjiView selectView(Wrapper<XiaoshoutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
