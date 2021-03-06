/*
 * Copyright 2018. JD.COM Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jd.custom.skill.sdk.entity.request;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillRequestSlot {

    /**
     * 槽位名称
     */
    private String name;

    /**
     * 槽值
     */
    private String value;

    /**
     * 是否匹配
     */
    private boolean matched;

    /**
     * 槽位确认类型
     */
    private String confirmResult;

}
