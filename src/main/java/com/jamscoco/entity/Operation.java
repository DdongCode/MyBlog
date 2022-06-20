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
@TableName("blog_operation")
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 对文章的操作（1点赞|2浏览|3打赏…）
     */
    private Integer type;

    /**
     * 被操作的文章
     */
    private String articleId;

    /**
     * 操作的IP地址
     */
    private String ipAddr;

    /**
     * 若是打赏操作记录金额
     */
    private BigDecimal money;

    /**
     * 若是打赏操作记录打赏人
     */
    private String nickname;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
