package com.cy.study.dal.mapper;

import com.cy.study.dal.model.ShopOrderStat;
import com.cy.study.dal.model.ShopOrderStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ShopOrderStatMapper {
    @SelectProvider(type=ShopOrderStatSqlProvider.class, method="countByExample")
    long countByExample(ShopOrderStatExample example);

    @DeleteProvider(type=ShopOrderStatSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShopOrderStatExample example);

    @Delete({
        "delete from shop_order_stat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into shop_order_stat (period, period_type, ",
        "shop_id, order_total_count, ",
        "order_total_amount, order_avg_amount, ",
        "item_class_count, item_total_count, ",
        "item_total_amount, gmt_create, ",
        "gmt_modify, status)",
        "values (#{period,jdbcType=INTEGER}, #{periodType,jdbcType=SMALLINT}, ",
        "#{shopId,jdbcType=INTEGER}, #{orderTotalCount,jdbcType=INTEGER}, ",
        "#{orderTotalAmount,jdbcType=BIGINT}, #{orderAvgAmount,jdbcType=INTEGER}, ",
        "#{itemClassCount,jdbcType=INTEGER}, #{itemTotalCount,jdbcType=DOUBLE}, ",
        "#{itemTotalAmount,jdbcType=INTEGER}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{status,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ShopOrderStat record);

    @InsertProvider(type=ShopOrderStatSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ShopOrderStat record);

    @SelectProvider(type=ShopOrderStatSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="period", property="period", jdbcType=JdbcType.INTEGER),
        @Result(column="period_type", property="periodType", jdbcType=JdbcType.SMALLINT),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_total_count", property="orderTotalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_total_amount", property="orderTotalAmount", jdbcType=JdbcType.BIGINT),
        @Result(column="order_avg_amount", property="orderAvgAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="item_class_count", property="itemClassCount", jdbcType=JdbcType.INTEGER),
        @Result(column="item_total_count", property="itemTotalCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="item_total_amount", property="itemTotalAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    List<ShopOrderStat> selectByExample(ShopOrderStatExample example);

    @Select({
        "select",
        "id, period, period_type, shop_id, order_total_count, order_total_amount, order_avg_amount, ",
        "item_class_count, item_total_count, item_total_amount, gmt_create, gmt_modify, ",
        "status",
        "from shop_order_stat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="period", property="period", jdbcType=JdbcType.INTEGER),
        @Result(column="period_type", property="periodType", jdbcType=JdbcType.SMALLINT),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_total_count", property="orderTotalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_total_amount", property="orderTotalAmount", jdbcType=JdbcType.BIGINT),
        @Result(column="order_avg_amount", property="orderAvgAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="item_class_count", property="itemClassCount", jdbcType=JdbcType.INTEGER),
        @Result(column="item_total_count", property="itemTotalCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="item_total_amount", property="itemTotalAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    ShopOrderStat selectByPrimaryKey(Long id);

    @UpdateProvider(type=ShopOrderStatSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShopOrderStat record, @Param("example") ShopOrderStatExample example);

    @UpdateProvider(type=ShopOrderStatSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShopOrderStat record, @Param("example") ShopOrderStatExample example);

    @UpdateProvider(type=ShopOrderStatSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShopOrderStat record);

    @Update({
        "update shop_order_stat",
        "set period = #{period,jdbcType=INTEGER},",
          "period_type = #{periodType,jdbcType=SMALLINT},",
          "shop_id = #{shopId,jdbcType=INTEGER},",
          "order_total_count = #{orderTotalCount,jdbcType=INTEGER},",
          "order_total_amount = #{orderTotalAmount,jdbcType=BIGINT},",
          "order_avg_amount = #{orderAvgAmount,jdbcType=INTEGER},",
          "item_class_count = #{itemClassCount,jdbcType=INTEGER},",
          "item_total_count = #{itemTotalCount,jdbcType=DOUBLE},",
          "item_total_amount = #{itemTotalAmount,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShopOrderStat record);
}