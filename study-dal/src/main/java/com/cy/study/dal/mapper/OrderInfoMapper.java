package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderInfo;
import com.cy.study.dal.model.OrderInfoExample;
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

public interface OrderInfoMapper {
    @SelectProvider(type=OrderInfoSqlProvider.class, method="countByExample")
    long countByExample(OrderInfoExample example);

    @DeleteProvider(type=OrderInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderInfoExample example);

    @Delete({
        "delete from order_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into order_info (user_id, pay_amount, ",
        "effe_amount, device_id, ",
        "cashier_id, shop_id, ",
        "attribute, status, ",
        "gmt_create, gmt_modify, ",
        "pay_way, amount, ",
        "coupon_id, credit_amount, ",
        "discount_amount, cost_amount, ",
        "gmt_pay, gmt_receive, ",
        "seq, user_address, ",
        "gmt_distribution, gmt_build)",
        "values (#{userId,jdbcType=BIGINT}, #{payAmount,jdbcType=INTEGER}, ",
        "#{effeAmount,jdbcType=INTEGER}, #{deviceId,jdbcType=BIGINT}, ",
        "#{cashierId,jdbcType=INTEGER}, #{shopId,jdbcType=INTEGER}, ",
        "#{attribute,jdbcType=VARCHAR}, #{status,jdbcType=SMALLINT}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP}, ",
        "#{payWay,jdbcType=SMALLINT}, #{amount,jdbcType=INTEGER}, ",
        "#{couponId,jdbcType=BIGINT}, #{creditAmount,jdbcType=INTEGER}, ",
        "#{discountAmount,jdbcType=INTEGER}, #{costAmount,jdbcType=INTEGER}, ",
        "#{gmtPay,jdbcType=TIMESTAMP}, #{gmtReceive,jdbcType=TIMESTAMP}, ",
        "#{seq,jdbcType=VARCHAR}, #{userAddress,jdbcType=VARCHAR}, ",
        "#{gmtDistribution,jdbcType=TIMESTAMP}, #{gmtBuild,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrderInfo record);

    @InsertProvider(type=OrderInfoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(OrderInfo record);

    @SelectProvider(type=OrderInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="effe_amount", property="effeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit_amount", property="creditAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="discount_amount", property="discountAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_amount", property="costAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_pay", property="gmtPay", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_receive", property="gmtReceive", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="seq", property="seq", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_distribution", property="gmtDistribution", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_build", property="gmtBuild", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderInfo> selectByExample(OrderInfoExample example);

    @Select({
        "select",
        "id, user_id, pay_amount, effe_amount, device_id, cashier_id, shop_id, attribute, ",
        "status, gmt_create, gmt_modify, pay_way, amount, coupon_id, credit_amount, discount_amount, ",
        "cost_amount, gmt_pay, gmt_receive, seq, user_address, gmt_distribution, gmt_build",
        "from order_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="effe_amount", property="effeAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit_amount", property="creditAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="discount_amount", property="discountAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_amount", property="costAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_pay", property="gmtPay", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_receive", property="gmtReceive", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="seq", property="seq", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_distribution", property="gmtDistribution", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_build", property="gmtBuild", jdbcType=JdbcType.TIMESTAMP)
    })
    OrderInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrderInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    @UpdateProvider(type=OrderInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    @UpdateProvider(type=OrderInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderInfo record);

    @Update({
        "update order_info",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "pay_amount = #{payAmount,jdbcType=INTEGER},",
          "effe_amount = #{effeAmount,jdbcType=INTEGER},",
          "device_id = #{deviceId,jdbcType=BIGINT},",
          "cashier_id = #{cashierId,jdbcType=INTEGER},",
          "shop_id = #{shopId,jdbcType=INTEGER},",
          "attribute = #{attribute,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "pay_way = #{payWay,jdbcType=SMALLINT},",
          "amount = #{amount,jdbcType=INTEGER},",
          "coupon_id = #{couponId,jdbcType=BIGINT},",
          "credit_amount = #{creditAmount,jdbcType=INTEGER},",
          "discount_amount = #{discountAmount,jdbcType=INTEGER},",
          "cost_amount = #{costAmount,jdbcType=INTEGER},",
          "gmt_pay = #{gmtPay,jdbcType=TIMESTAMP},",
          "gmt_receive = #{gmtReceive,jdbcType=TIMESTAMP},",
          "seq = #{seq,jdbcType=VARCHAR},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "gmt_distribution = #{gmtDistribution,jdbcType=TIMESTAMP},",
          "gmt_build = #{gmtBuild,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderInfo record);
}