package com.cy.study.dal.mapper;

import com.cy.study.dal.model.UserCredit;
import com.cy.study.dal.model.UserCreditExample;
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

public interface UserCreditMapper {
    @SelectProvider(type=UserCreditSqlProvider.class, method="countByExample")
    long countByExample(UserCreditExample example);

    @DeleteProvider(type=UserCreditSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserCreditExample example);

    @Delete({
        "delete from user_credit",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_credit (user_id, credit, ",
        "gmt_create, gmt_modify)",
        "values (#{userId,jdbcType=BIGINT}, #{credit,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModify,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserCredit record);

    @InsertProvider(type=UserCreditSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserCredit record);

    @SelectProvider(type=UserCreditSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit", property="credit", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserCredit> selectByExample(UserCreditExample example);

    @Select({
        "select",
        "id, user_id, credit, gmt_create, gmt_modify",
        "from user_credit",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="credit", property="credit", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP)
    })
    UserCredit selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserCreditSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserCredit record, @Param("example") UserCreditExample example);

    @UpdateProvider(type=UserCreditSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserCredit record, @Param("example") UserCreditExample example);

    @UpdateProvider(type=UserCreditSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserCredit record);

    @Update({
        "update user_credit",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "credit = #{credit,jdbcType=INTEGER},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserCredit record);
}