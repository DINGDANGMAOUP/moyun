package com.moyun.sysmanager.domainnamechecker.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 域名表
 *
 * @author kuroneko
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tab_domain_name")
public class TabDomainName implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 域名表ID */
  @TableId(value = "tid", type = IdType.AUTO)
  private Integer tid;

  /** 域名或URL */
  @TableField("domainName")
  private String domainName;

  /** 域名名称或对应的项目名 */
  private String name;

  /** 域名状态 */
  private Integer state;

  /** 备注 */
  private String remark;
}
