package com.wcc.gtemp.mananger.pojo.query;

import com.wcc.gtemp.common.pojo.DefaultPageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Version 1.0
 * @Author WCC
 * @Date 2024/8/29 22:59:00
 * @Description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoPageQuery extends DefaultPageQuery {
    private static final long serialVersionUID = 6607741221666977723L;

    @Builder.Default
    private String code = "123";
}
