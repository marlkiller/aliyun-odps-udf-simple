package com.alibaba.dataworks;

import com.aliyun.odps.Odps;
import com.aliyun.odps.account.Account;
import com.aliyun.odps.account.AliyunAccount;
import com.aliyun.odps.local.common.WareHouse;

import java.io.File;

/**
 * Sample Java Class
 */
public class TestUtil {

    private final static String DEMO_PROJECT = "demo_project";

    /**
     * 获取你的 Odps 账号对象，请将 your_access_id 替换成你的 d2 access_id，your_access_key 同理
     */
    public static Odps getOdpsAccount() {
        Account account = new AliyunAccount("xf8ShabTWgOXiEPs", "AcH9sKJaMxGSiV8aNiZ49IrJnYvBdf");
        Odps odps = new Odps(account);
        odps.setEndpoint("http://service-corp.odps.aliyun-inc.com/api");
        // odps.setEndpoint("http://service.cn.maxcompute.aliyun.com/api");
        return odps;
    }

    /**
     * 数组拼接
     *
     * @param obj
     * @return
     */
    public static String join(Object[] obj) {
        if (obj == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < obj.length; i++) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(obj[i]);
        }
        return sb.toString();
    }

    /**
     * 初始化mock路径
     *
     * @return
     */
    public static WareHouse initWarehouse() {
        File exampleProjectDir = new File("warehouse" + File.separator + DEMO_PROJECT);
        if (exampleProjectDir.exists()) {
            return WareHouse.getInstance("warehouse");
        } else {
            exampleProjectDir = new File("../warehouse" + File.separator + DEMO_PROJECT);
            if (exampleProjectDir.exists()) {
                return WareHouse.getInstance("../warehouse");
            }
        }
        throw new RuntimeException("warehouse dir not exists");
    }

}
