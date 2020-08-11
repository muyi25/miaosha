package com.miaoshaproject.controller.viewobject;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: Zihaoo
 * @Date: 2019/4/5
 */
@Data
public class ItemVo {

    private Integer id;
    private String title;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private String sales;
    private String imgUrl;
}
