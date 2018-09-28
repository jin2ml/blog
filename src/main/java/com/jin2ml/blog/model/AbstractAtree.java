package com.jin2ml.blog.model;

import java.util.List;

/**
 * atree 选择用户的树结点
 * 见 resources/atree/lay/modules/atree.js的属性props
 * 继承此类以扩展属性，参照js中的user属性，添加的时候model和js的prop都要添加
 *
 * @author jin2ml
 * @date 2018/9/20 09:46
 */
public abstract class AbstractAtree {

    public AbstractAtree() {
    }

    public AbstractAtree(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * id 根据ID来获取checkbox，重复ID只获取一个
     */
    private String id;
    /**
     * 名称，页面结点显示值
     */
    private String name;
    /**
     * 子节点
     */
    private List<AbstractAtree> children;
    /**
     * 别名，基本上没用
     */
    private String alias;
    /**
     * 页面结点是否默认展开
     */
    private Boolean spread;
    /**
     * 是否默认勾选
     * 不建议使用
     * atree目前只能监听change的事件
     * change之后才能获取选择值
     */
    private Boolean checkbox;

}
