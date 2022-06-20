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
@TableName("blog_admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 管理员账号
     */
    private String username;

    /**
     * 管理员密码（加密存储）
     */
    private String password;

    /**
     * 网站显示的作者昵称
     */
    private String nickname;

    /**
     * 作者头像（OSS链接）
     */
    private String avatar;

    /**
     * 作者qq
     */
    private String qqNumber;

    /**
     * 作者电话
     */
    private String telNumber;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 添加时间（自动生成）
     */
    private Date addTime;

    /**
     * 修改时间（自动生成）
     */
    private Date modifyTime;


}
