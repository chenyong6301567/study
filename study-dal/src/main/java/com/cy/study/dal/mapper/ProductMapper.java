package com.cy.study.dal.mapper;

import com.cy.study.dal.model.Product;
import com.cy.study.dal.model.ProductExample;
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

public interface ProductMapper {
    @SelectProvider(type=ProductSqlProvider.class, method="countByExample")
    long countByExample(ProductExample example);

    @DeleteProvider(type=ProductSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductExample example);

    @Delete({
        "delete from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into product (barcode, name, ",
        "pinyin, spec, unit, ",
        "location)",
        "values (#{barcode,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{pinyin,jdbcType=VARCHAR}, #{spec,jdbcType=VARCHAR}, #{unit,jdbcType=VARCHAR}, ",
        "#{location,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Product record);

    @InsertProvider(type=ProductSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Product record);

    @SelectProvider(type=ProductSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    List<Product> selectByExample(ProductExample example);

    @Select({
        "select",
        "id, barcode, name, pinyin, spec, unit, location",
        "from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    Product selectByPrimaryKey(Long id);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Product record);

    @Update({
        "update product",
        "set barcode = #{barcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "pinyin = #{pinyin,jdbcType=VARCHAR},",
          "spec = #{spec,jdbcType=VARCHAR},",
          "unit = #{unit,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Product record);
}