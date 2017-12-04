package com.cy.study.dal.mapper;

import com.cy.study.dal.model.PublicItem;
import com.cy.study.dal.model.PublicItemExample;
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

public interface PublicItemMapper {
    @SelectProvider(type=PublicItemSqlProvider.class, method="countByExample")
    long countByExample(PublicItemExample example);

    @DeleteProvider(type=PublicItemSqlProvider.class, method="deleteByExample")
    int deleteByExample(PublicItemExample example);

    @Delete({
        "delete from public_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into public_item (barcode, name, ",
        "pinyin, spec, unit, ",
        "location, price, ",
        "vip_price, cost_price, ",
        "status, gmt_create, ",
        "gmt_modify, keyword)",
        "values (#{barcode,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{pinyin,jdbcType=VARCHAR}, #{spec,jdbcType=VARCHAR}, #{unit,jdbcType=VARCHAR}, ",
        "#{location,jdbcType=VARCHAR}, #{price,jdbcType=INTEGER}, ",
        "#{vipPrice,jdbcType=INTEGER}, #{costPrice,jdbcType=INTEGER}, ",
        "#{status,jdbcType=SMALLINT}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{keyword,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(PublicItem record);

    @InsertProvider(type=PublicItemSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(PublicItem record);

    @SelectProvider(type=PublicItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="vip_price", property="vipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR)
    })
    List<PublicItem> selectByExample(PublicItemExample example);

    @Select({
        "select",
        "id, barcode, name, pinyin, spec, unit, location, price, vip_price, cost_price, ",
        "status, gmt_create, gmt_modify, keyword",
        "from public_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="vip_price", property="vipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR)
    })
    PublicItem selectByPrimaryKey(Long id);

    @UpdateProvider(type=PublicItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PublicItem record, @Param("example") PublicItemExample example);

    @UpdateProvider(type=PublicItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PublicItem record, @Param("example") PublicItemExample example);

    @UpdateProvider(type=PublicItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PublicItem record);

    @Update({
        "update public_item",
        "set barcode = #{barcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "pinyin = #{pinyin,jdbcType=VARCHAR},",
          "spec = #{spec,jdbcType=VARCHAR},",
          "unit = #{unit,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "vip_price = #{vipPrice,jdbcType=INTEGER},",
          "cost_price = #{costPrice,jdbcType=INTEGER},",
          "status = #{status,jdbcType=SMALLINT},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modify = #{gmtModify,jdbcType=TIMESTAMP},",
          "keyword = #{keyword,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PublicItem record);
}