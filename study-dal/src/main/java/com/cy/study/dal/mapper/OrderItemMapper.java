package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderItem;
import com.cy.study.dal.model.OrderItemExample;
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

public interface OrderItemMapper {
    @SelectProvider(type=OrderItemSqlProvider.class, method="countByExample")
    long countByExample(OrderItemExample example);

    @DeleteProvider(type=OrderItemSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderItemExample example);

    @Delete({
        "delete from order_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into order_item (order_id, item_id, ",
        "item_barcode, item_name, ",
        "item_spec, item_price, ",
        "item_vip_price, item_cost_price, ",
        "item_info, item_count, ",
        "gmt_create, gmt_modify, ",
        "status, item_unit)",
        "values (#{orderId,jdbcType=BIGINT}, #{itemId,jdbcType=BIGINT}, ",
        "#{itemBarcode,jdbcType=VARCHAR}, #{itemName,jdbcType=VARCHAR}, ",
        "#{itemSpec,jdbcType=VARCHAR}, #{itemPrice,jdbcType=INTEGER}, ",
        "#{itemVipPrice,jdbcType=INTEGER}, #{itemCostPrice,jdbcType=INTEGER}, ",
        "#{itemInfo,jdbcType=VARCHAR}, #{itemCount,jdbcType=DOUBLE}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=SMALLINT}, #{itemUnit,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrderItem record);

    @InsertProvider(type=OrderItemSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(OrderItem record);

    @SelectProvider(type=OrderItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_spec", property="itemSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_price", property="itemPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_vip_price", property="itemVipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_cost_price", property="itemCostPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_info", property="itemInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_count", property="itemCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="item_unit", property="itemUnit", jdbcType=JdbcType.VARCHAR)
    })
    List<OrderItem> selectByExample(OrderItemExample example);

    @Select({
        "select",
        "id, order_id, item_id, item_barcode, item_name, item_spec, item_price, item_vip_price, ",
        "item_cost_price, item_info, item_count, gmt_create, gmt_modify, status, item_unit",
        "from order_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_spec", property="itemSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_price", property="itemPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_vip_price", property="itemVipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_cost_price", property="itemCostPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_info", property="itemInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_count", property="itemCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="item_unit", property="itemUnit", jdbcType=JdbcType.VARCHAR)
    })
    OrderItem selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrderItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    @UpdateProvider(type=OrderItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    @UpdateProvider(type=OrderItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderItem record);

    @Update({
        "update order_item",
        "set order_id = #{orderId,jdbcType=BIGINT},",
          "item_id = #{itemId,jdbcType=BIGINT},",
          "item_barcode = #{itemBarcode,jdbcType=VARCHAR},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_spec = #{itemSpec,jdbcType=VARCHAR},",
          "item_price = #{itemPrice,jdbcType=INTEGER},",
          "item_vip_price = #{itemVipPrice,jdbcType=INTEGER},",
          "item_cost_price = #{itemCostPrice,jdbcType=INTEGER},",
          "item_info = #{itemInfo,jdbcType=VARCHAR},",
          "item_count = #{itemCount,jdbcType=DOUBLE},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=SMALLINT},",
          "item_unit = #{itemUnit,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderItem record);
}