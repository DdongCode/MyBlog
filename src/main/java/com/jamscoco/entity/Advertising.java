package com.jamscoco.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author JAMScoco
 * @since 2022-06-20
 */
@Getter
@Setter
@TableName("blog_advertising")
public class Advertising implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 轮播图片（OSS链接）
     */
    private String image;

    /**
     * 跳转路径
     */
    private String url;

    /**
     * 排序（越小越靠前）
     */
    private Integer sort;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
