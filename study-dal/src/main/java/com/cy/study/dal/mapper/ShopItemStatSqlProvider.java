package com.cy.study.dal.mapper;

import com.cy.study.dal.model.ShopItemStat;
import com.cy.study.dal.model.ShopItemStatExample.Criteria;
import com.cy.study.dal.model.ShopItemStatExample.Criterion;
import com.cy.study.dal.model.ShopItemStatExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ShopItemStatSqlProvider {

    public String countByExample(ShopItemStatExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("shop_item_stat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ShopItemStatExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("shop_item_stat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ShopItemStat record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shop_item_stat");
        
        if (record.getPeriod() != null) {
            sql.VALUES("period", "#{period,jdbcType=INTEGER}");
        }
        
        if (record.getPeriodType() != null) {
            sql.VALUES("period_type", "#{periodType,jdbcType=SMALLINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.VALUES("item_spec", "#{itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getSalesCount() != null) {
            sql.VALUES("sales_count", "#{salesCount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAmount() != null) {
            sql.VALUES("sales_amount", "#{salesAmount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAvgPrice() != null) {
            sql.VALUES("sales_avg_price", "#{salesAvgPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getAmountRate() != null) {
            sql.VALUES("amount_rate", "#{amountRate,jdbcType=DOUBLE}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.VALUES("gmt_modify", "#{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ShopItemStatExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("period");
        sql.SELECT("period_type");
        sql.SELECT("shop_id");
        sql.SELECT("item_id");
        sql.SELECT("item_name");
        sql.SELECT("item_spec");
        sql.SELECT("sales_count");
        sql.SELECT("sales_amount");
        sql.SELECT("sales_avg_price");
        sql.SELECT("amount_rate");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("status");
        sql.FROM("shop_item_stat");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShopItemStat record = (ShopItemStat) parameter.get("record");
        ShopItemStatExample example = (ShopItemStatExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("shop_item_stat");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getPeriod() != null) {
            sql.SET("period = #{record.period,jdbcType=INTEGER}");
        }
        
        if (record.getPeriodType() != null) {
            sql.SET("period_type = #{record.periodType,jdbcType=SMALLINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{record.shopId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.SET("item_spec = #{record.itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getSalesCount() != null) {
            sql.SET("sales_count = #{record.salesCount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAmount() != null) {
            sql.SET("sales_amount = #{record.salesAmount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAvgPrice() != null) {
            sql.SET("sales_avg_price = #{record.salesAvgPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getAmountRate() != null) {
            sql.SET("amount_rate = #{record.amountRate,jdbcType=DOUBLE}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("shop_item_stat");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("period = #{record.period,jdbcType=INTEGER}");
        sql.SET("period_type = #{record.periodType,jdbcType=SMALLINT}");
        sql.SET("shop_id = #{record.shopId,jdbcType=INTEGER}");
        sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        sql.SET("item_spec = #{record.itemSpec,jdbcType=VARCHAR}");
        sql.SET("sales_count = #{record.salesCount,jdbcType=INTEGER}");
        sql.SET("sales_amount = #{record.salesAmount,jdbcType=INTEGER}");
        sql.SET("sales_avg_price = #{record.salesAvgPrice,jdbcType=DOUBLE}");
        sql.SET("amount_rate = #{record.amountRate,jdbcType=DOUBLE}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        
        ShopItemStatExample example = (ShopItemStatExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShopItemStat record) {
        SQL sql = new SQL();
        sql.UPDATE("shop_item_stat");
        
        if (record.getPeriod() != null) {
            sql.SET("period = #{period,jdbcType=INTEGER}");
        }
        
        if (record.getPeriodType() != null) {
            sql.SET("period_type = #{periodType,jdbcType=SMALLINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.SET("item_spec = #{itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getSalesCount() != null) {
            sql.SET("sales_count = #{salesCount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAmount() != null) {
            sql.SET("sales_amount = #{salesAmount,jdbcType=INTEGER}");
        }
        
        if (record.getSalesAvgPrice() != null) {
            sql.SET("sales_avg_price = #{salesAvgPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getAmountRate() != null) {
            sql.SET("amount_rate = #{amountRate,jdbcType=DOUBLE}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ShopItemStatExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}