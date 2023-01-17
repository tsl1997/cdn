package cn.k2502.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author XS
 * @since 2022-07-18 08:57
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dev_user")
public class DevUser extends Model<DevUser> {

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开发者帐号
     */
    @TableField("devCode")
    private String devCode;

    /**
     * 开发者名称
     */
    @TableField("devName")
    private String devName;

    /**
     * 开发者密码
     */
    @TableField("devPassword")
    private String devPassword;

    /**
     * 开发者电子邮箱
     */
    @TableField("devEmail")
    private String devEmail;

    /**
     * 开发者简介
     */
    @TableField("devInfo")
    private String devInfo;

    /**
     * 创建者（来源于backend_user用户表的用户id）
     */
    @TableField("createdBy")
    private Long createdBy;

    /**
     * 创建时间
     */
    @TableField("creationDate")
    private LocalDateTime creationDate;

    /**
     * 更新者（来源于backend_user用户表的用户id）
     */
    @TableField("modifyBy")
    private Long modifyBy;

    /**
     * 最新更新时间
     */
    @TableField("modifyDate")
    private LocalDateTime modifyDate;

    @TableField("devImg")
    private String devImg;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
