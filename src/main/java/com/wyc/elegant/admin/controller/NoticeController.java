package com.wyc.elegant.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wyc.elegant.admin.common.R;
import com.wyc.elegant.admin.model.entity.TbNotice;
import com.wyc.elegant.admin.service.NoticeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公告
 *
 * @author Knox 2020/11/19
 */
@Api(tags = "全站公告处理器")
@RestController
@RequestMapping("/api/notice")
public class NoticeController extends BaseController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/show")
    public R getNotice() {
        TbNotice one = noticeService.getOne(new LambdaQueryWrapper<TbNotice>().eq(TbNotice::isShow, true));
        return R.ok().data(one);
    }
}