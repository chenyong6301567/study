package com.cy.study.dal.mapper;

import com.cy.study.dal.model.ShoppingCart;
import com.cy.study.dal.model.ShoppingCartExample;
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

public interface ShoppingCartMapper {
    @SelectProvider(type=ShoppingCartSqlProvider.class, method="countByExample")
    long countByExample(ShoppingCartExample example);

    @DeleteProvider(type=ShoppingCartSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShoppingCartExample example);

    @Delete({
        "delete from shopping_cart",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into shopping_cart (user_id, item_id, ",
        "item_barcode, item_name, ",
        "item_price, item_vip_price, ",
        "item_const_price, attribute, ",
        "device_id, cashier_id, ",
        "status, gmt_create, ",
        "gmt_modify, shop_id)",
        "values (#{userId,jdbcType=BIGINT}, #{itemId,jdbcType=BIGINT}, ",
        "#{itemBarcode,jdbcType=VARCHAR}, #{itemName,jdbcType=VARCHAR}, ",
        "#{itemPrice,jdbcType=INTEGER}, #{itemVipPrice,jdbcType=INTEGER}, ",
        "#{itemConstPrice,jdbcType=INTEGER}, #{attribute,jdbcType=VARCHAR}, ",
        "#{deviceId,jdbcType=BIGINT}, #{cashierId,jdbcType=INTEGER}, ",
        "#{status,jdbcType=SMALLINT}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{shopId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ShoppingCart record);

    @InsertProvider(type=ShoppingCartSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ShoppingCart record);

    @SelectProvider(type=ShoppingCartSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_price", property="itemPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_vip_price", property="itemVipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_const_price", property="itemConstPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER)
    })
    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    @Select({
        "select",
        "id, user_id, item_id, item_barcode, item_name, item_price, item_vip_price, item_const_price, ",
        "attribute, device_id, cashier_id, status, gmt_create, gmt_modify, shop_id",
        "from shopping_cart",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.BIGINT),
        @Result(column="item_barcode", property="itemBarcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_price", property="itemPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_vip_price", property="itemVipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="item_const_price", property="itemConstPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER)
    })
    ShoppingCart selectByPrimaryKey(Long id);

    @UpdateProvider(type=ShoppingCartSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    @UpdateProvider(type=ShoppingCartSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    @UpdateProvider(type=ShoppingCartSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShoppingCart record);

    @Update({
        "update shopping_cart",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "item_id = #{itemId,jdbcType=BIGINT},",
          "item_barcode = #{itemBarcode,jdbcType=VARCHAR},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_price = #{itemPrice,jdbcType=INTEGER},",
          "item_vip_price = #{itemVipPrice,jdbcType=INTEGER},",
          "item_const_price = #{itemConstPrice,jdbcType=INTEGER},",
          "attribute = #{attribute,jdbcType=VARCHAR},",
          "device_id = #{deviceId,jdbcType=BIGINT},",
          "cashier_id = #{cashierId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "shop_id = #{shopId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShoppingCart record);
}