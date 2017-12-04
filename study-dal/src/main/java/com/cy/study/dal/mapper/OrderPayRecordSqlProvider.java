package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderPayRecord;
import com.cy.study.dal.model.OrderPayRecordExample.Criteria;
import com.cy.study.dal.model.OrderPayRecordExample.Criterion;
import com.cy.study.dal.model.OrderPayRecordExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderPayRecordSqlProvider {

    public String countByExample(OrderPayRecordExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("order_pay_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrderPayRecordExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("order_pay_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrderPayRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order_pay_record");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getPayWay() != null) {
            sql.VALUES("pay_way", "#{payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.VALUES("pay_amount", "#{payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.VALUES("gmt_modify", "#{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOuterOrderId() != null) {
            sql.VALUES("outer_order_id", "#{outerOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getCallbackcontent() != null) {
            sql.VALUES("callbackContent", "#{callbackcontent,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderPayRecordExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_id");
        sql.SELECT("pay_way");
        sql.SELECT("pay_amount");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("outer_order_id");
        sql.SELECT("account");
        sql.SELECT("callbackContent");
        sql.SELECT("status");
        sql.FROM("order_pay_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrderPayRecord record = (OrderPayRecord) parameter.get("record");
        OrderPayRecordExample example = (OrderPayRecordExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("order_pay_record");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getPayWay() != null) {
            sql.SET("pay_way = #{record.payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{record.payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOuterOrderId() != null) {
            sql.SET("outer_order_id = #{record.outerOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getCallbackcontent() != null) {
            sql.SET("callbackContent = #{record.callbackcontent,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("order_pay_record");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("pay_way = #{record.payWay,jdbcType=SMALLINT}");
        sql.SET("pay_amount = #{record.payAmount,jdbcType=INTEGER}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("outer_order_id = #{record.outerOrderId,jdbcType=VARCHAR}");
        sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        sql.SET("callbackContent = #{record.callbackcontent,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        
        OrderPayRecordExample example = (OrderPayRecordExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrderPayRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("order_pay_record");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getPayWay() != null) {
            sql.SET("pay_way = #{payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOuterOrderId() != null) {
            sql.SET("outer_order_id = #{outerOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getCallbackcontent() != null) {
            sql.SET("callbackContent = #{callbackcontent,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderPayRecordExample example, boolean includeExamplePhrase) {
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