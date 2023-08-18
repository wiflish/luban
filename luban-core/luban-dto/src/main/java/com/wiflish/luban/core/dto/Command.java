/*-
 * ************
 * luban-cloud
 * ************
 * Copyright (C) 2023 - 2023 the original author or authors.
 * ************
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
package com.wiflish.luban.core.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * CQRS 之 Command.
 *
 * @author wiflish
 * @since  2022-03-17
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Command extends BaseDTO {
    @Serial
    private static final long serialVersionUID = 8479849114074982304L;

    private Long id;
}
