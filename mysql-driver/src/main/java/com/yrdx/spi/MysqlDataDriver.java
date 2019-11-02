/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.yrdx.spi;

/**
 * mysql驱动具体实现
 *
 * @author zhuls
 * @version V1.0
 * @since 2019-11-02 16:18
 */
public class MysqlDataDriver implements DatabaseDriver {
    public String connect(String url) {
        return "connect:" + url;
    }
}
