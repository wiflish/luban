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
package com.wiflish.luban.core.mybatis.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.wiflish.luban.core.mybatis.config.LubanMybatisAutofillProperties.PREFIX;

/**
 * @author wiflish
 * @since 2023-08-22
 */
@Getter
@Setter
@ConfigurationProperties(PREFIX)
public class LubanMybatisAutofillProperties {
    /**
     * 前缀
     */
    public static final String PREFIX = "luban.mybatis.autofill";

    /**
     * 是否开启自动填入createId和updateId.
     */
    private Boolean enable = Boolean.TRUE;

    private String createIdField = "createId";
    private String updateIdField = "updateId";
}
