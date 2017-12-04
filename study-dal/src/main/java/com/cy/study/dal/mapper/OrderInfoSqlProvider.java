package com.cy.study.dal.mapper;

import com.cy.study.dal.model.OrderInfo;
import com.cy.study.dal.model.OrderInfoExample.Criteria;
import com.cy.study.dal.model.OrderInfoExample.Criterion;
import com.cy.study.dal.model.OrderInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderInfoSqlProvider {

    public String countByExample(OrderInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("order_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrderInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("order_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrderInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order_info");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.VALUES("pay_amount", "#{payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getEffeAmount() != null) {
            sql.VALUES("effe_amount", "#{effeAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDeviceId() != null) {
            sql.VALUES("device_id", "#{deviceId,jdbcType=BIGINT}");
        }
        
        if (record.getCashierId() != null) {
            sql.VALUES("cashier_id", "#{cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getAttribute() != null) {
            sql.VALUES("attribute", "#{attribute,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.VALUES("gmt_create", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.VALUES("gmt_modify", "#{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayWay() != null) {
            sql.VALUES("pay_way", "#{payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.VALUES("coupon_id", "#{couponId,jdbcType=BIGINT}");
        }
        
        if (record.getCreditAmount() != null) {
            sql.VALUES("credit_amount", "#{creditAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.VALUES("discount_amount", "#{discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getCostAmount() != null) {
            sql.VALUES("cost_amount", "#{costAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtPay() != null) {
            sql.VALUES("gmt_pay", "#{gmtPay,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtReceive() != null) {
            sql.VALUES("gmt_receive", "#{gmtReceive,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeq() != null) {
            sql.VALUES("seq", "#{seq,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtDistribution() != null) {
            sql.VALUES("gmt_distribution", "#{gmtDistribution,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtBuild() != null) {
            sql.VALUES("gmt_build", "#{gmtBuild,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("pay_amount");
        sql.SELECT("effe_amount");
        sql.SELECT("device_id");
        sql.SELECT("cashier_id");
        sql.SELECT("shop_id");
        sql.SELECT("attribute");
        sql.SELECT("status");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("pay_way");
        sql.SELECT("amount");
        sql.SELECT("coupon_id");
        sql.SELECT("credit_amount");
        sql.SELECT("discount_amount");
        sql.SELECT("cost_amount");
        sql.SELECT("gmt_pay");
        sql.SELECT("gmt_receive");
        sql.SELECT("seq");
        sql.SELECT("user_address");
        sql.SELECT("gmt_distribution");
        sql.SELECT("gmt_build");
        sql.FROM("order_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrderInfo record = (OrderInfo) parameter.get("record");
        OrderInfoExample example = (OrderInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("order_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{record.payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getEffeAmount() != null) {
            sql.SET("effe_amount = #{record.effeAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDeviceId() != null) {
            sql.SET("device_id = #{record.deviceId,jdbcType=BIGINT}");
        }
        
        if (record.getCashierId() != null) {
            sql.SET("cashier_id = #{record.cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{record.shopId,jdbcType=INTEGER}");
        }
        
        if (record.getAttribute() != null) {
            sql.SET("attribute = #{record.attribute,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayWay() != null) {
            sql.SET("pay_way = #{record.payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("coupon_id = #{record.couponId,jdbcType=BIGINT}");
        }
        
        if (record.getCreditAmount() != null) {
            sql.SET("credit_amount = #{record.creditAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.SET("discount_amount = #{record.discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getCostAmount() != null) {
            sql.SET("cost_amount = #{record.costAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtPay() != null) {
            sql.SET("gmt_pay = #{record.gmtPay,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtReceive() != null) {
            sql.SET("gmt_receive = #{record.gmtReceive,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeq() != null) {
            sql.SET("seq = #{record.seq,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtDistribution() != null) {
            sql.SET("gmt_distribution = #{record.gmtDistribution,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtBuild() != null) {
            sql.SET("gmt_build = #{record.gmtBuild,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("order_info");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("pay_amount = #{record.payAmount,jdbcType=INTEGER}");
        sql.SET("effe_amount = #{record.effeAmount,jdbcType=INTEGER}");
        sql.SET("device_id = #{record.deviceId,jdbcType=BIGINT}");
        sql.SET("cashier_id = #{record.cashierId,jdbcType=INTEGER}");
        sql.SET("shop_id = #{record.shopId,jdbcType=INTEGER}");
        sql.SET("attribute = #{record.attribute,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        sql.SET("gmt_create = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{record.gmtModify,jdbcType=TIMESTAMP}");
        sql.SET("pay_way = #{record.payWay,jdbcType=SMALLINT}");
        sql.SET("amount = #{record.amount,jdbcType=INTEGER}");
        sql.SET("coupon_id = #{record.couponId,jdbcType=BIGINT}");
        sql.SET("credit_amount = #{record.creditAmount,jdbcType=INTEGER}");
        sql.SET("discount_amount = #{record.discountAmount,jdbcType=INTEGER}");
        sql.SET("cost_amount = #{record.costAmount,jdbcType=INTEGER}");
        sql.SET("gmt_pay = #{record.gmtPay,jdbcType=TIMESTAMP}");
        sql.SET("gmt_receive = #{record.gmtReceive,jdbcType=TIMESTAMP}");
        sql.SET("seq = #{record.seq,jdbcType=VARCHAR}");
        sql.SET("user_address = #{record.userAddress,jdbcType=VARCHAR}");
        sql.SET("gmt_distribution = #{record.gmtDistribution,jdbcType=TIMESTAMP}");
        sql.SET("gmt_build = #{record.gmtBuild,jdbcType=TIMESTAMP}");
        
        OrderInfoExample example = (OrderInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrderInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("order_info");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayAmount() != null) {
            sql.SET("pay_amount = #{payAmount,jdbcType=INTEGER}");
        }
        
        if (record.getEffeAmount() != null) {
            sql.SET("effe_amount = #{effeAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDeviceId() != null) {
            sql.SET("device_id = #{deviceId,jdbcType=BIGINT}");
        }
        
        if (record.getCashierId() != null) {
            sql.SET("cashier_id = #{cashierId,jdbcType=INTEGER}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=INTEGER}");
        }
        
        if (record.getAttribute() != null) {
            sql.SET("attribute = #{attribute,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        if (record.getGmtCreate() != null) {
            sql.SET("gmt_create = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModify() != null) {
            sql.SET("gmt_modify = #{gmtModify,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayWay() != null) {
            sql.SET("pay_way = #{payWay,jdbcType=SMALLINT}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("coupon_id = #{couponId,jdbcType=BIGINT}");
        }
        
        if (record.getCreditAmount() != null) {
            sql.SET("credit_amount = #{creditAmount,jdbcType=INTEGER}");
        }
        
        if (record.getDiscountAmount() != null) {
            sql.SET("discount_amount = #{discountAmount,jdbcType=INTEGER}");
        }
        
        if (record.getCostAmount() != null) {
            sql.SET("cost_amount = #{costAmount,jdbcType=INTEGER}");
        }
        
        if (record.getGmtPay() != null) {
            sql.SET("gmt_pay = #{gmtPay,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtReceive() != null) {
            sql.SET("gmt_receive = #{gmtReceive,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSeq() != null) {
            sql.SET("seq = #{seq,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtDistribution() != null) {
            sql.SET("gmt_distribution = #{gmtDistribution,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtBuild() != null) {
            sql.SET("gmt_build = #{gmtBuild,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderInfoExample example, boolean includeExamplePhrase) {
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