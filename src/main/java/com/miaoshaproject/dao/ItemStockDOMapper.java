package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemStockDO;

public interface ItemStockDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    int insert(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    int insertSelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    ItemStockDO selectByPrimaryKey(Integer id);

    ItemStockDO selectByItemId(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    int updateByPrimaryKeySelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Tue Aug 11 16:52:26 CST 2020
     */
    int updateByPrimaryKey(ItemStockDO record);
}