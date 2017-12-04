package com.cy.study.dal.mapper;

import com.cy.study.dal.model.UserCreditCopy;
import com.cy.study.dal.model.UserCreditCopyExample;
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

public interface UserCreditCopyMapper {
    @SelectProvider(type=UserCreditCopySqlProvider.class, method="countByExample")
    long countByExample(UserCreditCopyExample example);

    @DeleteProvider(type=UserCreditCopySqlProvider.class, method="deleteByExample")
    int deleteByExample(UserCreditCopyExample example);

    @Delete({
        "delete from user_credit_copy",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_credit_copy (user_id, credit, ",
        "gmt_create, gmt_modify)",
        "values (#{userId,jdbcType=BIGINT}, #{credit,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserCreditCopy record);

    @InsertProvider(type=UserCreditCopySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserCreditCopy record);

    @SelectProvider(type=UserCreditCopySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit", property="credit", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserCreditCopy> selectByExample(UserCreditCopyExample example);

    @Select({
        "select",
        "id, user_id, credit, gmt_create, gmt_modify",
        "from user_credit_copy",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit", property="credit", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    UserCreditCopy selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserCreditCopySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserCreditCopy record, @Param("example") UserCreditCopyExample example);

    @UpdateProvider(type=UserCreditCopySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserCreditCopy record, @Param("example") UserCreditCopyExample example);

    @UpdateProvider(type=UserCreditCopySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserCreditCopy record);

    @Update({
        "update user_credit_copy",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "credit = #{credit,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserCreditCopy record);
}