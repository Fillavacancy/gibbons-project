package com.gibbons.commonserver.util;

/**
 * 配置信息
 */
public class RedisConfig {

    public static final String REDIS_IP = "192.168.10.123";

    public static final String AUTH = "password";

    public static final int PORT = 6379;

    public static final boolean TEST_ON_BORROW = true;

    public static final boolean TEST_ON_RETURN = true;

    public static final int MAX_ACTIVE = 1024;

    public static final int MAX_IDLE = 200;

    public static final int MAX_WAIT = 10000;
}
