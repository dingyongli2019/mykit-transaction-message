/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.demo.springcloud.order.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author binghe
 * @version 1.0.0
 * @description Order
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1095190709449470924L;

    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单编号
     */
    private String number;


    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 付款金额
     */
    private BigDecimal totalAmount;

    /**
     * 购买数量
     */
    private Integer count;

    /**
     * 购买人
     */
    private String userId;
}
