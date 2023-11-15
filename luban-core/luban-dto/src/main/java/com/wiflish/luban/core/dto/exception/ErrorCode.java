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
package com.wiflish.luban.core.dto.exception;

import lombok.Getter;
import lombok.Setter;
@Getter
public class ErrorCode {
    private final String prefix = "error.";

    @Setter
    private String code;

    private ErrorCode() {
    }

    public static ErrorCode of(String code) {
        ErrorCode errorCode = new ErrorCode();
        errorCode.setCode(code);

        return errorCode;
    }

    public String getKey() {
        return prefix + code;
    }
}
