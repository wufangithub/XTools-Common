package me.xuxiaoxiao.xtools.common.config;

import me.xuxiaoxiao.xtools.common.config.configs.XConfigs;
import me.xuxiaoxiao.xtools.common.config.configs.impl.XConfigsImpl;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * 配置工具，此工具被其他依赖，所以此工具不能使用其他工具
 */
public final class XConfigTools {
    public static final XConfigs X_CONFIGS = new XConfigsImpl();

    static {
        try {
            X_CONFIGS.cfgLoad("config.properties", "utf-8");
        } catch (IOException e) {
            System.err.println("读取默认配置文件[ config.properties ]失败");
        }
    }

    private XConfigTools() {
    }

    /**
     * 根据类名提供类的实例，自动判断是否为XSupplier，如果是，则调用其supply方法获取类的实例
     *
     * @param clazzName 类名
     * @param <T>       实例类型
     * @return 需求的类的实例
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public static <T> T supply(@Nonnull String clazzName) {
        try {
            Class<?> clazz = Class.forName(clazzName);
            if (XSupplier.class.isAssignableFrom(clazz)) {
                return ((XSupplier<T>) clazz.newInstance()).supply();
            } else {
                return (T) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ClassCastException) {
                throw new ClassCastException(String.format("使用[ %s ]获取实例时出错：类型不匹配", clazzName));
            } else {
                throw new IllegalArgumentException(String.format("使用[ %s ]获取实例时出错：无法实例化", clazzName));
            }
        }
    }
}
