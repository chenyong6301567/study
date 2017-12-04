package com.cy.study.dal.mapper;

import com.cy.study.dal.model.ShopItemStat;
import com.cy.study.dal.model.ShopItemStatExample;
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

public interface ShopItemStatMapper {
    @SelectProvider(type=ShopItemStatSqlProvider.class, method="countByExample")
    long countByExample(ShopItemStatExample example);

    @DeleteProvider(type=ShopItemStatSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShopItemStatExample example);

    @Delete({
        "delete from shop_item_stat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into shop_item_stat (period, period_type, ",
        "shop_id, item_id, item_name, ",
        "item_spec, sales_count, ",
        "sales_amount, sales_avg_price, ",
        "amount_rate, gmt_create, ",
        "gmt_modify, status)",
        "values (#{period,jdbcType=INTEGER}, #{periodType,jdbcType=SMALLINT}, ",
        "#{shopId,jdbcType=INTEGER}, #{itemId,jdbcType=BIGINT}, #{itemName,jdbcType=VARCHAR}, ",
        "#{itemSpec,jdbcType=VARCHAR}, #{salesCount,jdbcType=INTEGER}, ",
        "#{salesAmount,jdbcType=INTEGER}, #{salesAvgPrice,jdbcType=DOUBLE}, ",
        "#{amountRate,jdbcType=DOUBLE}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{status,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ShopItemStat record);

    @InsertProvider(type=ShopItemStatSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ShopItemStat record);

    @SelectProvider(type=ShopItemStatSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="period", property="period", jdbcType=JdbcType.INTEGER),
        @Result(column="period_type", property="periodType", jdbcType=JdbcType.SMALLINT),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_spec", property="itemSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_count", property="salesCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_amount", property="salesAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_avg_price", property="salesAvgPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="amount_rate", property="amountRate", jdbcType=JdbcType.DOUBLE),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    List<ShopItemStat> selectByExample(ShopItemStatExample example);

    @Select({
        "select",
        "id, period, period_type, shop_id, item_id, item_name, item_spec, sales_count, ",
        "sales_amount, sales_avg_price, amount_rate, gmt_create, gmt_modify, status",
        "from shop_item_stat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="period", property="period", jdbcType=JdbcType.INTEGER),
        @Result(column="period_type", property="periodType", jdbcType=JdbcType.SMALLINT),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_spec", property="itemSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="sales_count", property="salesCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_amount", property="salesAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="sales_avg_price", property="salesAvgPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="amount_rate", property="amountRate", jdbcType=JdbcType.DOUBLE),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    ShopItemStat selectByPrimaryKey(Long id);

    @UpdateProvider(type=ShopItemStatSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShopItemStat record, @Param("example") ShopItemStatExample example);

    @UpdateProvider(type=ShopItemStatSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShopItemStat record, @Param("example") ShopItemStatExample example);

    @UpdateProvider(type=ShopItemStatSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShopItemStat record);

    @Update({
        "update shop_item_stat",
        "set period = #{period,jdbcType=INTEGER},",
          "period_type = #{periodType,jdbcType=SMALLINT},",
          "shop_id = #{shopId,jdbcType=INTEGER},",
          "item_id = #{itemId,jdbcType=BIGINT},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_spec = #{itemSpec,jdbcType=VARCHAR},",
          "sales_count = #{salesCount,jdbcType=INTEGER},",
          "sales_amount = #{salesAmount,jdbcType=INTEGER},",
          "sales_avg_price = #{salesAvgPrice,jdbcType=DOUBLE},",
          "amount_rate = #{amountRate,jdbcType=DOUBLE},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShopItemStat record);
}