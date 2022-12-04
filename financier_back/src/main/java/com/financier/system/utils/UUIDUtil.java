package com.financier.system.utils;

import cn.hutool.core.util.IdUtil;

/**
 * UUID 工具
 * @author proteincode
 */
public class UUIDUtil {
    /**
     * 通过 hutool 工具生成 uuid
     * @return
     */
    public static String getUUID() {
        String simpleUUID = IdUtil.simpleUUID();
        return simpleUUID;
    }
}
