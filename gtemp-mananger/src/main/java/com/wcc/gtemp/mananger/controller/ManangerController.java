package com.wcc.gtemp.mananger.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.db.PageResult;
import com.wcc.gtemp.mananger.pojo.query.DemoPageQuery;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2024/8/12 22:04:00
 * @Description 系统服务控制类
 */
@Slf4j
@RequestMapping("/manager")
@RestController
public class ManangerController {
    @Resource
    private Snowflake snowflake;

    @RequestMapping("/getId")
    public String generalId(){
        String idStr = snowflake.nextIdStr();
        log.info("雪花算法 生成 ID 为：{}",idStr);

        PageResult<DemoPageQuery> pageResult = new PageResult<>();
        pageResult.add(DemoPageQuery.builder().code("111").build());
        pageResult.add(DemoPageQuery.builder().code("222").build());
        pageResult.add(DemoPageQuery.builder().code("333").build());
        List<DemoPageQuery> pageQueryList = pageResult.stream().toList();
        System.out.println(pageQueryList);
        return idStr;
    }
}
