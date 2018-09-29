package com.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Auther: shuaihu.shen@hand-china.com
 * @Date: 2018/9/17 09:43
 * @Description:
 */

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno ;
    private  String dname;
    private String db_source;  // 来自哪个数据库 一个微服务对应一个数据库 同一个信心可存不同的数据库

}
