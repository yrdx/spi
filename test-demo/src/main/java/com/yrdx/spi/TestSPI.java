/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.yrdx.spi;

import java.util.ServiceLoader;

/**
 *
 * @author zhuls
 * @version V1.0
 * @since 2019-11-02 16:23
 */
public class TestSPI {

    public static void main(String[] args) {
        ServiceLoader<DatabaseDriver> serviceLoader = ServiceLoader.load(DatabaseDriver.class);
        for(DatabaseDriver databaseDriver:serviceLoader){
            System.out.println(databaseDriver.connect("127.0.0.1"));
        }
    }
}
