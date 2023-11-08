/*-
 * ************
 * luban-cloud
 * ------------
 * Copyright (C) 2023 - 2023 the original author or authors.
 * ------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ************
 */
package com.wiflish.luban.core.infra.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 数据库对象.
 *
 * @author wiflish
 * @since 2022-10-12
 */
@Data
public abstract class BasePO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 创建人id.
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createId;

    /**
     * 修改人id.
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateId;

    /**
     * 创建时间.
     */
    private LocalDateTime createTime;

    /**
     * 更新时间.
     */
    private LocalDateTime updateTime;

    /**
     * 乐观锁字段.
     */
    private Long version;

    /**
     * 逻辑删除标记.
     */
    private Long deleted;

    /**
     * 扩展字段，保存标识数据，按位操作，具体的位的业务含义由各个业务表自行定义.
     */
    private FeatureBit featureBit;

    /**
     * 扩展字段，Json结构. 长度限制为5000以内.
     */
    private FeatureJson featureJson;
}
