package com.cake.mapper;

import com.cake.entity.Cake;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 蛋糕
 */
public interface CakeMapper {

    /**
     * 分页查询蛋糕
     * @param skip 跳过记录数 从那条开始查询
     * @param size 查询记录数
     * @return 蛋糕集合
     */
    @Select("select * from cake order by create_time desc limit #{skip},#{size}")
    //相当于起别名 数据库字段名：实体类名
    @Results({
//            id=true表示为主键
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "name",property = "name"),
            @Result(column = "level",property = "level"),
            @Result(column = "price",property = "price"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })
    List<Cake> getCakes(Integer skip,Integer size);


    /**
     *
     * 根据分类分页查询蛋糕
     * @param categoryId 蛋糕分类ID
     * @param skip 跳过记录数 从那条开始查询
     * @param size 查询记录数
     * @return 蛋糕集合
     */
    @Select("select id,category_id categoryId,name,level,price,create_time createTime,update_time updateTime from cake where category_id=#{categoryId} order by create_time desc limit #{skip},#{size}")
    List<Cake> getCakesByCategoryId(@Param("categoryId") Long categoryId, Integer skip, Integer size);




}
