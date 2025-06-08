package com.wcc.gtemp.test;

import cn.hutool.Hutool;
import cn.hutool.core.util.IdUtil;
import cn.hutool.db.PageResult;
import com.wcc.gtemp.mananger.pojo.query.DemoPageQuery;

import java.util.List;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2025/6/8 22:29:00
 * @Description
 */
public class TestManager {
    public static void main(String[] args) {
        String uuid = IdUtil.fastSimpleUUID();
        System.out.println("id1 : " + uuid);
        for (int i = 0; i < 20; i++) {
            String nextIdStr = IdUtil.getSnowflake(1, 1).nextIdStr();
            System.out.println("id2 : " + nextIdStr);
        }
        Hutool.printAllUtils();
        //PageResult pageResult = new PageResult();
        System.out.println("----------------------------------------------------------");
        PageResult<DemoPageQuery> pageResult = new PageResult<>();
        pageResult.add(DemoPageQuery.builder().code("111").build());
        pageResult.add(DemoPageQuery.builder().code("222").build());
        pageResult.add(DemoPageQuery.builder().code("333").build());
        System.out.println(pageResult);
        List<DemoPageQuery> pageQueryList = pageResult.stream().toList();
        System.out.println(pageQueryList.toString());
    }
}
