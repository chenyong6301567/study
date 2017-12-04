package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderItem;
import com.cy.study.dal.model.OrderItemExample.Criteria;
import com.cy.study.dal.model.OrderItemExample.Criterion;
import com.cy.study.dal.model.OrderItemExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderItemSqlProvider {

    public String countByExample(OrderItemExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("order_item");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrderItemExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("order_item");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrderItem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order_item");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemBarcode() != null) {
            sql.VALUES("item_barcode", "#{itemBarcode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.VALUES("item_spec", "#{itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getItemPrice() != null) {
            sql.VALUES("item_price", "#{itemPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemVipPrice() != null) {
            sql.VALUES("item_vip_price", "#{itemVipPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemCostPrice() != null) {
            sql.VALUES("item_cost_price", "#{itemCostPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemInfo() != null) {
            sql.VALUES("item_info", "#{itemInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemCount() != null) {
            sql.VALUES("item_count", "#{itemCount,jdbcType=DOUBLE}");
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
        
        if (record.getItemUnit() != null) {
            sql.VALUES("item_unit", "#{itemUnit,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderItemExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_id");
        sql.SELECT("item_id");
        sql.SELECT("item_barcode");
        sql.SELECT("item_name");
        sql.SELECT("item_spec");
        sql.SELECT("item_price");
        sql.SELECT("item_vip_price");
        sql.SELECT("item_cost_price");
        sql.SELECT("item_info");
        sql.SELECT("item_count");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("status");
        sql.SELECT("item_unit");
        sql.FROM("order_item");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrderItem record = (OrderItem) parameter.get("record");
        OrderItemExample example = (OrderItemExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("order_item");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemBarcode() != null) {
            sql.SET("item_barcode = #{record.itemBarcode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.SET("item_spec = #{record.itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getItemPrice() != null) {
            sql.SET("item_price = #{record.itemPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemVipPrice() != null) {
            sql.SET("item_vip_price = #{record.itemVipPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemCostPrice() != null) {
            sql.SET("item_cost_price = #{record.itemCostPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemInfo() != null) {
            sql.SET("item_info = #{record.itemInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemCount() != null) {
            sql.SET("item_count = #{record.itemCount,jdbcType=DOUBLE}");
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
        
        if (record.getItemUnit() != null) {
            sql.SET("item_unit = #{record.itemUnit,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("order_item");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        sql.SET("item_barcode = #{record.itemBarcode,jdbcType=VARCHAR}");
        sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        sql.SET("item_spec = #{record.itemSpec,jdbcType=VARCHAR}");
        sql.SET("item_price = #{record.itemPrice,jdbcType=INTEGER}");
        sql.SET("item_vip_price = #{record.itemVipPrice,jdbcType=INTEGER}");
        sql.SET("item_cost_price = #{record.itemCostPrice,jdbcType=INTEGER}");
        sql.SET("item_info = #{record.itemInfo,jdbcType=VARCHAR}");
        sql.SET("item_count = #{record.itemCount,jdbcType=DOUBLE}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        sql.SET("item_unit = #{record.itemUnit,jdbcType=VARCHAR}");
        
        OrderItemExample example = (OrderItemExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrderItem record) {
        SQL sql = new SQL();
        sql.UPDATE("order_item");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemBarcode() != null) {
            sql.SET("item_barcode = #{itemBarcode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemSpec() != null) {
            sql.SET("item_spec = #{itemSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getItemPrice() != null) {
            sql.SET("item_price = #{itemPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemVipPrice() != null) {
            sql.SET("item_vip_price = #{itemVipPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemCostPrice() != null) {
            sql.SET("item_cost_price = #{itemCostPrice,jdbcType=INTEGER}");
        }
        
        if (record.getItemInfo() != null) {
            sql.SET("item_info = #{itemInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getItemCount() != null) {
            sql.SET("item_count = #{itemCount,jdbcType=DOUBLE}");
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
        
        if (record.getItemUnit() != null) {
            sql.SET("item_unit = #{itemUnit,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderItemExample example, boolean includeExamplePhrase) {
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