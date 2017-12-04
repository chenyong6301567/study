package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderRefoud;
import com.cy.study.dal.model.OrderRefoudExample;
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

public interface OrderRefoudMapper {
    @SelectProvider(type=OrderRefoudSqlProvider.class, method="countByExample")
    long countByExample(OrderRefoudExample example);

    @DeleteProvider(type=OrderRefoudSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderRefoudExample example);

    @Delete({
        "delete from order_refoud",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into order_refoud (orders_id, refoud_amount, ",
        "refoud_cause, pay_way, ",
        "after_sale_member_id, member_id, ",
        "gmt_create, gmt_modify, ",
        "status, account, ",
        "pay_content)",
        "values (#{ordersId,jdbcType=BIGINT}, #{refoudAmount,jdbcType=DOUBLE}, ",
        "#{refoudCause,jdbcType=VARCHAR}, #{payWay,jdbcType=SMALLINT}, ",
        "#{afterSaleMemberId,jdbcType=INTEGER}, #{memberId,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=SMALLINT}, #{account,jdbcType=VARCHAR}, ",
        "#{payContent,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(OrderRefoud record);

    @InsertProvider(type=OrderRefoudSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(OrderRefoud record);

    @SelectProvider(type=OrderRefoudSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="orders_id", property="ordersId", jdbcType=JdbcType.BIGINT),
        @Result(column="refoud_amount", property="refoudAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="refoud_cause", property="refoudCause", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="after_sale_member_id", property="afterSaleMemberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_content", property="payContent", jdbcType=JdbcType.VARCHAR)
    })
    List<OrderRefoud> selectByExample(OrderRefoudExample example);

    @Select({
        "select",
        "id, orders_id, refoud_amount, refoud_cause, pay_way, after_sale_member_id, member_id, ",
        "gmt_create, gmt_modify, status, account, pay_content",
        "from order_refoud",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="orders_id", property="ordersId", jdbcType=JdbcType.BIGINT),
        @Result(column="refoud_amount", property="refoudAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="refoud_cause", property="refoudCause", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_way", property="payWay", jdbcType=JdbcType.SMALLINT),
        @Result(column="after_sale_member_id", property="afterSaleMemberId", jdbcType=JdbcType.INTEGER),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_content", property="payContent", jdbcType=JdbcType.VARCHAR)
    })
    OrderRefoud selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrderRefoudSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderRefoud record, @Param("example") OrderRefoudExample example);

    @UpdateProvider(type=OrderRefoudSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrderRefoud record, @Param("example") OrderRefoudExample example);

    @UpdateProvider(type=OrderRefoudSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrderRefoud record);

    @Update({
        "update order_refoud",
        "set orders_id = #{ordersId,jdbcType=BIGINT},",
          "refoud_amount = #{refoudAmount,jdbcType=DOUBLE},",
          "refoud_cause = #{refoudCause,jdbcType=VARCHAR},",
          "pay_way = #{payWay,jdbcType=SMALLINT},",
          "after_sale_member_id = #{afterSaleMemberId,jdbcType=INTEGER},",
          "member_id = #{memberId,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=SMALLINT},",
          "account = #{account,jdbcType=VARCHAR},",
          "pay_content = #{payContent,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrderRefoud record);
}