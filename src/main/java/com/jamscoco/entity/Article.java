package com.jamscoco.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("blog_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 分类id
     */
    private String classId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容（内含MD样式）
     */
    private String content;

    /**
     * 排序（越小越靠前，-1为置顶）
     */
    private Integer sort;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 浏览量
     */
    private Integer pageView;

    /**
     * 打赏次数
     */
    private Integer awardCount;

    /**
     * 打赏金额
     */
    private BigDecimal awardMoney;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
