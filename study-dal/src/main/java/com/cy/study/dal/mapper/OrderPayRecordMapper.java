package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderPayRecord;
import com.cy.study.dal.model.OrderPayRecordExample;
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

public interface OrderPayRecordMapper {
    @SelectProvider(type=OrderPayRecordSqlProvider.class, method="countByExample")
    long countByExample(OrderPayRecordExample example);

    @DeleteProvider(type=OrderPayRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderPayRecordExample example);

    @Delete({
        "delete from order_pay_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into order_pay_record (order_id, pay_way, ",
        "pay_amount, gmt_create, ",
        "gmt_modify, outer_order_id, ",
        "account, callbackContent, ",
        "status)",
        "values (#{orderId,jdbcType=BIGINT}, #{payWay,jdbcType=SMALLINT}, ",
        "#{payAmount,jdbcType=INTEGER}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{outerOrderId,jdbcType=VARCHAR}, ",
        "#{account,jdbcType=VARCHAR}, #{callbackcontent,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrderPayRecord record);

    @InsertProvider(type=OrderPayRecordSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(OrderPayRecord record);

    @SelectProvider(type=OrderPayRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outer_order_id", property="outerOrderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="callbackContent", property="callbackcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    List<OrderPayRecord> selectByExample(OrderPayRecordExample example);

    @Select({
        "select",
        "id, order_id, pay_way, pay_amount, gmt_create, gmt_modify, outer_order_id, account, ",
        "callbackContent, status",
        "from order_pay_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="outer_order_id", property="outerOrderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="callbackContent", property="callbackcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT)
    })
    OrderPayRecord selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrderPayRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderPayRecord record, @Param("example") OrderPayRecordExample example);

    @UpdateProvider(type=OrderPayRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrderPayRecord record, @Param("example") OrderPayRecordExample example);

    @UpdateProvider(type=OrderPayRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderPayRecord record);

    @Update({
        "update order_pay_record",
        "set order_id = #{orderId,jdbcType=BIGINT},",
          "pay_way = #{payWay,jdbcType=SMALLINT},",
          "pay_amount = #{payAmount,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "outer_order_id = #{outerOrderId,jdbcType=VARCHAR},",
          "account = #{account,jdbcType=VARCHAR},",
          "callbackContent = #{callbackcontent,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderPayRecord record);
}