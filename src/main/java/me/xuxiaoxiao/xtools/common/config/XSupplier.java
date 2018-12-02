package me.xuxiaoxiao.xtools.common.config;

/**
 * 提供者接口。
 * 根据1.2版本的设计思想。
 * 每种工具既要提供开箱即用的公共静态方法，并且可以通过全局配置文件进行配置。
 * 也可以单独生成每种工具的对象，并且可以单独修改每个对象的相关配置。
 * 此接口是为各个工具提供各种配置对象的。
 *
 * @param <T> 提供对象
 */
public interface XSupplier<T> {

    /**
     * 提供特定的对象
     *
     * @return 特定对象
     */
    T supply();
}
