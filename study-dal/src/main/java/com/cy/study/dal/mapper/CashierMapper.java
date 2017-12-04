package com.cy.study.dal.mapper;

import com.cy.study.dal.model.Cashier;
import com.cy.study.dal.model.CashierExample;
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

public interface CashierMapper {
    @SelectProvider(type=CashierSqlProvider.class, method="countByExample")
    long countByExample(CashierExample example);

    @DeleteProvider(type=CashierSqlProvider.class, method="deleteByExample")
    int deleteByExample(CashierExample example);

    @Delete({
        "delete from cashier",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into cashier (shop_id, account, ",
        "password, name, ",
        "mobile, status, ",
        "gmt_create, gmt_modify)",
        "values (#{shopId,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{status,jdbcType=SMALLINT}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Cashier record);

    @InsertProvider(type=CashierSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Cashier record);

    @SelectProvider(type=CashierSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Cashier> selectByExample(CashierExample example);

    @Select({
        "select",
        "id, shop_id, account, password, name, mobile, status, gmt_create, gmt_modify",
        "from cashier",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    Cashier selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CashierSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    @UpdateProvider(type=CashierSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);

    @UpdateProvider(type=CashierSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Cashier record);

    @Update({
        "update cashier",
        "set shop_id = #{shopId,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Cashier record);
}