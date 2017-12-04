package com.cy.study.dal.mapper;

import com.cy.study.dal.model.UserCreditLog;
import com.cy.study.dal.model.UserCreditLogExample;
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

public interface UserCreditLogMapper {
    @SelectProvider(type=UserCreditLogSqlProvider.class, method="countByExample")
    long countByExample(UserCreditLogExample example);

    @DeleteProvider(type=UserCreditLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserCreditLogExample example);

    @Delete({
        "delete from user_credit_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_credit_log (user_id, amount, ",
        "description, app_id, ",
        "gmt_create, gmt_modify)",
        "values (#{userId,jdbcType=BIGINT}, #{amount,jdbcType=INTEGER}, ",
        "#{description,jdbcType=VARCHAR}, #{appId,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserCreditLog record);

    @InsertProvider(type=UserCreditLogSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserCreditLog record);

    @SelectProvider(type=UserCreditLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserCreditLog> selectByExample(UserCreditLogExample example);

    @Select({
        "select",
        "id, user_id, amount, description, app_id, gmt_create, gmt_modify",
        "from user_credit_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    UserCreditLog selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserCreditLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserCreditLog record, @Param("example") UserCreditLogExample example);

    @UpdateProvider(type=UserCreditLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserCreditLog record, @Param("example") UserCreditLogExample example);

    @UpdateProvider(type=UserCreditLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserCreditLog record);

    @Update({
        "update user_credit_log",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "amount = #{amount,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "app_id = #{appId,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserCreditLog record);
}