package com.cy.study.dal.mapper;

import com.cy.study.dal.model.CashierOperatorLog;
import com.cy.study.dal.model.CashierOperatorLogExample.Criteria;
import com.cy.study.dal.model.CashierOperatorLogExample.Criterion;
import com.cy.study.dal.model.CashierOperatorLogExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CashierOperatorLogSqlProvider {

    public String countByExample(CashierOperatorLogExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("cashier_operator_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CashierOperatorLogExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("cashier_operator_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CashierOperatorLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("cashier_operator_log");
        
        if (record.getCashierId() != null) {
            sql.VALUES("cashier_id", "#{cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getOperatorCode() != null) {
            sql.VALUES("operator_code", "#{operatorCode,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.VALUES("gmt_modify", "#{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorInfo() != null) {
            sql.VALUES("operator_info", "#{operatorInfo,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(CashierOperatorLogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("cashier_id");
        sql.SELECT("operator_code");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("operator_info");
        sql.FROM("cashier_operator_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(CashierOperatorLogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("cashier_id");
        sql.SELECT("operator_code");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.FROM("cashier_operator_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CashierOperatorLog record = (CashierOperatorLog) parameter.get("record");
        CashierOperatorLogExample example = (CashierOperatorLogExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("cashier_operator_log");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCashierId() != null) {
            sql.SET("cashier_id = #{record.cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getOperatorCode() != null) {
            sql.SET("operator_code = #{record.operatorCode,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorInfo() != null) {
            sql.SET("operator_info = #{record.operatorInfo,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("cashier_operator_log");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("cashier_id = #{record.cashierId,jdbcType=INTEGER}");
        sql.SET("operator_code = #{record.operatorCode,jdbcType=SMALLINT}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("operator_info = #{record.operatorInfo,jdbcType=LONGVARCHAR}");
        
        CashierOperatorLogExample example = (CashierOperatorLogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("cashier_operator_log");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("cashier_id = #{record.cashierId,jdbcType=INTEGER}");
        sql.SET("operator_code = #{record.operatorCode,jdbcType=SMALLINT}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        
        CashierOperatorLogExample example = (CashierOperatorLogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CashierOperatorLog record) {
        SQL sql = new SQL();
        sql.UPDATE("cashier_operator_log");
        
        if (record.getCashierId() != null) {
            sql.SET("cashier_id = #{cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getOperatorCode() != null) {
            sql.SET("operator_code = #{operatorCode,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorInfo() != null) {
            sql.SET("operator_info = #{operatorInfo,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CashierOperatorLogExample example, boolean includeExamplePhrase) {
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