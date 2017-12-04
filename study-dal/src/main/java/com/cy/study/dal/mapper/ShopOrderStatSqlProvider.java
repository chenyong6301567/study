package com.cy.study.dal.mapper;

import com.cy.study.dal.model.ShopOrderStat;
import com.cy.study.dal.model.ShopOrderStatExample.Criteria;
import com.cy.study.dal.model.ShopOrderStatExample.Criterion;
import com.cy.study.dal.model.ShopOrderStatExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ShopOrderStatSqlProvider {

    public String countByExample(ShopOrderStatExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("shop_order_stat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ShopOrderStatExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("shop_order_stat");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ShopOrderStat record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("shop_order_stat");
        
        if (record.getPeriod() != null) {
            sql.VALUES("period", "#{period,jdbcType=INTEGER}");
        }
        
        if (record.getPeriodType() != null) {
            sql.VALUES("period_type", "#{periodType,jdbcType=SMALLINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalCount() != null) {
            sql.VALUES("order_total_count", "#{orderTotalCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalAmount() != null) {
            sql.VALUES("order_total_amount", "#{orderTotalAmount,jdbcType=BIGINT}");
        }
        
        if (record.getOrderAvgAmount() != null) {
            sql.VALUES("order_avg_amount", "#{orderAvgAmount,jdbcType=INTEGER}");
        }
        
        if (record.getItemClassCount() != null) {
            sql.VALUES("item_class_count", "#{itemClassCount,jdbcType=INTEGER}");
        }
        
        if (record.getItemTotalCount() != null) {
            sql.VALUES("item_total_count", "#{itemTotalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getItemTotalAmount() != null) {
            sql.VALUES("item_total_amount", "#{itemTotalAmount,jdbcType=INTEGER}");
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

    public String selectByExample(ShopOrderStatExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("period");
        sql.SELECT("period_type");
        sql.SELECT("shop_id");
        sql.SELECT("order_total_count");
        sql.SELECT("order_total_amount");
        sql.SELECT("order_avg_amount");
        sql.SELECT("item_class_count");
        sql.SELECT("item_total_count");
        sql.SELECT("item_total_amount");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("status");
        sql.FROM("shop_order_stat");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShopOrderStat record = (ShopOrderStat) parameter.get("record");
        ShopOrderStatExample example = (ShopOrderStatExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("shop_order_stat");
        
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
        
        if (record.getOrderTotalCount() != null) {
            sql.SET("order_total_count = #{record.orderTotalCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalAmount() != null) {
            sql.SET("order_total_amount = #{record.orderTotalAmount,jdbcType=BIGINT}");
        }
        
        if (record.getOrderAvgAmount() != null) {
            sql.SET("order_avg_amount = #{record.orderAvgAmount,jdbcType=INTEGER}");
        }
        
        if (record.getItemClassCount() != null) {
            sql.SET("item_class_count = #{record.itemClassCount,jdbcType=INTEGER}");
        }
        
        if (record.getItemTotalCount() != null) {
            sql.SET("item_total_count = #{record.itemTotalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getItemTotalAmount() != null) {
            sql.SET("item_total_amount = #{record.itemTotalAmount,jdbcType=INTEGER}");
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
        sql.UPDATE("shop_order_stat");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("period = #{record.period,jdbcType=INTEGER}");
        sql.SET("period_type = #{record.periodType,jdbcType=SMALLINT}");
        sql.SET("shop_id = #{record.shopId,jdbcType=INTEGER}");
        sql.SET("order_total_count = #{record.orderTotalCount,jdbcType=INTEGER}");
        sql.SET("order_total_amount = #{record.orderTotalAmount,jdbcType=BIGINT}");
        sql.SET("order_avg_amount = #{record.orderAvgAmount,jdbcType=INTEGER}");
        sql.SET("item_class_count = #{record.itemClassCount,jdbcType=INTEGER}");
        sql.SET("item_total_count = #{record.itemTotalCount,jdbcType=DOUBLE}");
        sql.SET("item_total_amount = #{record.itemTotalAmount,jdbcType=INTEGER}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        
        ShopOrderStatExample example = (ShopOrderStatExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShopOrderStat record) {
        SQL sql = new SQL();
        sql.UPDATE("shop_order_stat");
        
        if (record.getPeriod() != null) {
            sql.SET("period = #{period,jdbcType=INTEGER}");
        }
        
        if (record.getPeriodType() != null) {
            sql.SET("period_type = #{periodType,jdbcType=SMALLINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalCount() != null) {
            sql.SET("order_total_count = #{orderTotalCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalAmount() != null) {
            sql.SET("order_total_amount = #{orderTotalAmount,jdbcType=BIGINT}");
        }
        
        if (record.getOrderAvgAmount() != null) {
            sql.SET("order_avg_amount = #{orderAvgAmount,jdbcType=INTEGER}");
        }
        
        if (record.getItemClassCount() != null) {
            sql.SET("item_class_count = #{itemClassCount,jdbcType=INTEGER}");
        }
        
        if (record.getItemTotalCount() != null) {
            sql.SET("item_total_count = #{itemTotalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getItemTotalAmount() != null) {
            sql.SET("item_total_amount = #{itemTotalAmount,jdbcType=INTEGER}");
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

    protected void applyWhere(SQL sql, ShopOrderStatExample example, boolean includeExamplePhrase) {
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