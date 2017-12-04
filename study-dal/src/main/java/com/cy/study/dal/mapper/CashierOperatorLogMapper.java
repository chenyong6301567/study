package com.cy.study.dal.mapper;

import com.cy.study.dal.model.CashierOperatorLog;
import com.cy.study.dal.model.CashierOperatorLogExample;
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

public interface CashierOperatorLogMapper {
    @SelectProvider(type=CashierOperatorLogSqlProvider.class, method="countByExample")
    long countByExample(CashierOperatorLogExample example);

    @DeleteProvider(type=CashierOperatorLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(CashierOperatorLogExample example);

    @Delete({
        "delete from cashier_operator_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into cashier_operator_log (cashier_id, operator_code, ",
        "gmt_create, gmt_modify, ",
        "operator_info)",
        "values (#{cashierId,jdbcType=INTEGER}, #{operatorCode,jdbcType=SMALLINT}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP}, ",
        "#{operatorInfo,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CashierOperatorLog record);

    @InsertProvider(type=CashierOperatorLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(CashierOperatorLog record);

    @SelectProvider(type=CashierOperatorLogSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator_code", property="operatorCode", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_info", property="operatorInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CashierOperatorLog> selectByExampleWithBLOBs(CashierOperatorLogExample example);

    @SelectProvider(type=CashierOperatorLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator_code", property="operatorCode", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CashierOperatorLog> selectByExample(CashierOperatorLogExample example);

    @Select({
        "select",
        "id, cashier_id, operator_code, gmt_create, gmt_modify, operator_info",
        "from cashier_operator_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cashier_id", property="cashierId", jdbcType=JdbcType.INTEGER),
        @Result(column="operator_code", property="operatorCode", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_info", property="operatorInfo", jdbcType=JdbcType.LONGVARCHAR)
    })
    CashierOperatorLog selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CashierOperatorLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CashierOperatorLog record, @Param("example") CashierOperatorLogExample example);

    @UpdateProvider(type=CashierOperatorLogSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") CashierOperatorLog record, @Param("example") CashierOperatorLogExample example);

    @UpdateProvider(type=CashierOperatorLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CashierOperatorLog record, @Param("example") CashierOperatorLogExample example);

    @UpdateProvider(type=CashierOperatorLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CashierOperatorLog record);

    @Update({
        "update cashier_operator_log",
        "set cashier_id = #{cashierId,jdbcType=INTEGER},",
          "operator_code = #{operatorCode,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "operator_info = #{operatorInfo,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(CashierOperatorLog record);

    @Update({
        "update cashier_operator_log",
        "set cashier_id = #{cashierId,jdbcType=INTEGER},",
          "operator_code = #{operatorCode,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CashierOperatorLog record);
}