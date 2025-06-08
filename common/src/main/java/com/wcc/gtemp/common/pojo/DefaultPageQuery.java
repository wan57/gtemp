package com.wcc.gtemp.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2024/8/12 22:29:00
 * @Description 默认分页参数
 */
@Data
public class DefaultPageQuery implements Serializable {
    private static final long serialVersionUID = 3500675902913002624L;

    /**
     * 页数：第xxx页
     */
    private int pageNo = 1;
    /**
     * 行数：多少行数/每页
     */
    private int pageSize = Integer.MAX_VALUE;
}
