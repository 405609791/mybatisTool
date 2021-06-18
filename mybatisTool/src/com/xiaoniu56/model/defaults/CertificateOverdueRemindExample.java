package com.xiaoniu56.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateOverdueRemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateOverdueRemindExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("seq_id is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(Long value) {
            addCriterion("seq_id =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(Long value) {
            addCriterion("seq_id <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(Long value) {
            addCriterion("seq_id >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_id >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(Long value) {
            addCriterion("seq_id <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(Long value) {
            addCriterion("seq_id <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<Long> values) {
            addCriterion("seq_id in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<Long> values) {
            addCriterion("seq_id not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(Long value1, Long value2) {
            addCriterion("seq_id between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(Long value1, Long value2) {
            addCriterion("seq_id not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNull() {
            addCriterion("document_id is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("document_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(String value) {
            addCriterion("document_id =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(String value) {
            addCriterion("document_id <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(String value) {
            addCriterion("document_id >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(String value) {
            addCriterion("document_id >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(String value) {
            addCriterion("document_id <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(String value) {
            addCriterion("document_id <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLike(String value) {
            addCriterion("document_id like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotLike(String value) {
            addCriterion("document_id not like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<String> values) {
            addCriterion("document_id in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<String> values) {
            addCriterion("document_id not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(String value1, String value2) {
            addCriterion("document_id between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(String value1, String value2) {
            addCriterion("document_id not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("document_type is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("document_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(Long value) {
            addCriterion("document_type =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(Long value) {
            addCriterion("document_type <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(Long value) {
            addCriterion("document_type >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("document_type >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(Long value) {
            addCriterion("document_type <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(Long value) {
            addCriterion("document_type <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<Long> values) {
            addCriterion("document_type in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<Long> values) {
            addCriterion("document_type not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(Long value1, Long value2) {
            addCriterion("document_type between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(Long value1, Long value2) {
            addCriterion("document_type not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Long value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Long value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Long value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Long value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Long value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Long> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Long> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Long value1, Long value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Long value1, Long value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateIsNull() {
            addCriterion("certificate_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateIsNotNull() {
            addCriterion("certificate_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateEqualTo(Date value) {
            addCriterion("certificate_expiry_date =", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateNotEqualTo(Date value) {
            addCriterion("certificate_expiry_date <>", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateGreaterThan(Date value) {
            addCriterion("certificate_expiry_date >", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("certificate_expiry_date >=", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateLessThan(Date value) {
            addCriterion("certificate_expiry_date <", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateLessThanOrEqualTo(Date value) {
            addCriterion("certificate_expiry_date <=", value, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateIn(List<Date> values) {
            addCriterion("certificate_expiry_date in", values, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateNotIn(List<Date> values) {
            addCriterion("certificate_expiry_date not in", values, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateBetween(Date value1, Date value2) {
            addCriterion("certificate_expiry_date between", value1, value2, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateExpiryDateNotBetween(Date value1, Date value2) {
            addCriterion("certificate_expiry_date not between", value1, value2, "certificateExpiryDate");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusIsNull() {
            addCriterion("certificate_overdue_status is null");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusIsNotNull() {
            addCriterion("certificate_overdue_status is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusEqualTo(Long value) {
            addCriterion("certificate_overdue_status =", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusNotEqualTo(Long value) {
            addCriterion("certificate_overdue_status <>", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusGreaterThan(Long value) {
            addCriterion("certificate_overdue_status >", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("certificate_overdue_status >=", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusLessThan(Long value) {
            addCriterion("certificate_overdue_status <", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusLessThanOrEqualTo(Long value) {
            addCriterion("certificate_overdue_status <=", value, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusIn(List<Long> values) {
            addCriterion("certificate_overdue_status in", values, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusNotIn(List<Long> values) {
            addCriterion("certificate_overdue_status not in", values, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusBetween(Long value1, Long value2) {
            addCriterion("certificate_overdue_status between", value1, value2, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andCertificateOverdueStatusNotBetween(Long value1, Long value2) {
            addCriterion("certificate_overdue_status not between", value1, value2, "certificateOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagIsNull() {
            addCriterion("sent_message_flag is null");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagIsNotNull() {
            addCriterion("sent_message_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagEqualTo(Boolean value) {
            addCriterion("sent_message_flag =", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagNotEqualTo(Boolean value) {
            addCriterion("sent_message_flag <>", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagGreaterThan(Boolean value) {
            addCriterion("sent_message_flag >", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sent_message_flag >=", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagLessThan(Boolean value) {
            addCriterion("sent_message_flag <", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("sent_message_flag <=", value, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagIn(List<Boolean> values) {
            addCriterion("sent_message_flag in", values, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagNotIn(List<Boolean> values) {
            addCriterion("sent_message_flag not in", values, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("sent_message_flag between", value1, value2, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentMessageFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sent_message_flag not between", value1, value2, "sentMessageFlag");
            return (Criteria) this;
        }

        public Criteria andSentCountIsNull() {
            addCriterion("sent_count is null");
            return (Criteria) this;
        }

        public Criteria andSentCountIsNotNull() {
            addCriterion("sent_count is not null");
            return (Criteria) this;
        }

        public Criteria andSentCountEqualTo(Integer value) {
            addCriterion("sent_count =", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountNotEqualTo(Integer value) {
            addCriterion("sent_count <>", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountGreaterThan(Integer value) {
            addCriterion("sent_count >", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sent_count >=", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountLessThan(Integer value) {
            addCriterion("sent_count <", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountLessThanOrEqualTo(Integer value) {
            addCriterion("sent_count <=", value, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountIn(List<Integer> values) {
            addCriterion("sent_count in", values, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountNotIn(List<Integer> values) {
            addCriterion("sent_count not in", values, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountBetween(Integer value1, Integer value2) {
            addCriterion("sent_count between", value1, value2, "sentCount");
            return (Criteria) this;
        }

        public Criteria andSentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sent_count not between", value1, value2, "sentCount");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateIsNull() {
            addCriterion("last_send_message_date is null");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateIsNotNull() {
            addCriterion("last_send_message_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateEqualTo(Date value) {
            addCriterion("last_send_message_date =", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateNotEqualTo(Date value) {
            addCriterion("last_send_message_date <>", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateGreaterThan(Date value) {
            addCriterion("last_send_message_date >", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_send_message_date >=", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateLessThan(Date value) {
            addCriterion("last_send_message_date <", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateLessThanOrEqualTo(Date value) {
            addCriterion("last_send_message_date <=", value, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateIn(List<Date> values) {
            addCriterion("last_send_message_date in", values, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateNotIn(List<Date> values) {
            addCriterion("last_send_message_date not in", values, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateBetween(Date value1, Date value2) {
            addCriterion("last_send_message_date between", value1, value2, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageDateNotBetween(Date value1, Date value2) {
            addCriterion("last_send_message_date not between", value1, value2, "lastSendMessageDate");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdIsNull() {
            addCriterion("last_send_message_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdIsNotNull() {
            addCriterion("last_send_message_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdEqualTo(String value) {
            addCriterion("last_send_message_user_id =", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdNotEqualTo(String value) {
            addCriterion("last_send_message_user_id <>", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdGreaterThan(String value) {
            addCriterion("last_send_message_user_id >", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_send_message_user_id >=", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdLessThan(String value) {
            addCriterion("last_send_message_user_id <", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdLessThanOrEqualTo(String value) {
            addCriterion("last_send_message_user_id <=", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdLike(String value) {
            addCriterion("last_send_message_user_id like", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdNotLike(String value) {
            addCriterion("last_send_message_user_id not like", value, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdIn(List<String> values) {
            addCriterion("last_send_message_user_id in", values, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdNotIn(List<String> values) {
            addCriterion("last_send_message_user_id not in", values, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdBetween(String value1, String value2) {
            addCriterion("last_send_message_user_id between", value1, value2, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andLastSendMessageUserIdNotBetween(String value1, String value2) {
            addCriterion("last_send_message_user_id not between", value1, value2, "lastSendMessageUserId");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("ver is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("ver is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(Long value) {
            addCriterion("ver =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(Long value) {
            addCriterion("ver <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(Long value) {
            addCriterion("ver >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(Long value) {
            addCriterion("ver >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(Long value) {
            addCriterion("ver <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(Long value) {
            addCriterion("ver <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<Long> values) {
            addCriterion("ver in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<Long> values) {
            addCriterion("ver not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(Long value1, Long value2) {
            addCriterion("ver between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(Long value1, Long value2) {
            addCriterion("ver not between", value1, value2, "ver");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}