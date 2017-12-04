package com.cy.study.dal.mapper;

import com.cy.study.dal.model.TokenAccessCode;
import com.cy.study.dal.model.TokenAccessCodeExample;
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

public interface TokenAccessCodeMapper {
    @SelectProvider(type=TokenAccessCodeSqlProvider.class, method="countByExample")
    long countByExample(TokenAccessCodeExample example);

    @DeleteProvider(type=TokenAccessCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(TokenAccessCodeExample example);

    @Delete({
        "delete from token_access_code",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into token_access_code (code, device_id, ",
        "nonce, expire, ",
        "user_id, gmt_create, ",
        "gmt_modify)",
        "values (#{code,jdbcType=VARCHAR}, #{deviceId,jdbcType=BIGINT}, ",
        "#{nonce,jdbcType=BIGINT}, #{expire,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=BIGINT}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(TokenAccessCode record);

    @InsertProvider(type=TokenAccessCodeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(TokenAccessCode record);

    @SelectProvider(type=TokenAccessCodeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="nonce", property="nonce", jdbcType=JdbcType.BIGINT),
        @Result(column="expire", property="expire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TokenAccessCode> selectByExample(TokenAccessCodeExample example);

    @Select({
        "select",
        "id, code, device_id, nonce, expire, user_id, gmt_create, gmt_modify",
        "from token_access_code",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.BIGINT),
        @Result(column="nonce", property="nonce", jdbcType=JdbcType.BIGINT),
        @Result(column="expire", property="expire", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    TokenAccessCode selectByPrimaryKey(Long id);

    @UpdateProvider(type=TokenAccessCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TokenAccessCode record, @Param("example") TokenAccessCodeExample example);

    @UpdateProvider(type=TokenAccessCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TokenAccessCode record, @Param("example") TokenAccessCodeExample example);

    @UpdateProvider(type=TokenAccessCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TokenAccessCode record);

    @Update({
        "update token_access_code",
        "set code = #{code,jdbcType=VARCHAR},",
          "device_id = #{deviceId,jdbcType=BIGINT},",
          "nonce = #{nonce,jdbcType=BIGINT},",
          "expire = #{expire,jdbcType=TIMESTAMP},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TokenAccessCode record);
}