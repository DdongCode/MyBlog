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
@TableName("blog_blacklist")
public class Blacklist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 拉黑原因
     */
    private String reason;

    /**
     * 被拉黑的IP地址
     */
    private String ipAddr;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
