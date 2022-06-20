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
@TableName("blog_website")
public class Website implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 网站名称
     */
    private String name;

    /**
     * 网站logo（OSS链接）
     */
    private String logo;

    /**
     * 打赏二维码1（OSS链接）
     */
    private String qr1;

    /**
     * 打赏二维码2（OSS链接）
     */
    private String qr2;

    /**
     * 打赏二维码3（OSS链接）
     */
    private String qr3;

    /**
     * 免责声明
     */
    private String disclaimer;

    /**
     * 版权信息
     */
    private String copyright;

    /**
     * 备案信息（备案链接）
     */
    private String records;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
