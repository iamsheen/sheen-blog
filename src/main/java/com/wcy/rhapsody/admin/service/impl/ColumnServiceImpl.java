package com.wcy.rhapsody.admin.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcy.rhapsody.admin.mapper.ColumnMapper;
import com.wcy.rhapsody.admin.model.entity.Column;
import com.wcy.rhapsody.admin.model.vo.ColumnVO;
import com.wcy.rhapsody.admin.service.ColumnService;
import org.springframework.stereotype.Service;

/**
 * @author Yeeep
 * @date 2020/11/28
 */
@Service
public class ColumnServiceImpl extends ServiceImpl<ColumnMapper, Column> implements ColumnService {

    @Override
    public Page<ColumnVO> getList(Page<ColumnVO> page) {
        return this.baseMapper.selectPageVo(page);
    }
}