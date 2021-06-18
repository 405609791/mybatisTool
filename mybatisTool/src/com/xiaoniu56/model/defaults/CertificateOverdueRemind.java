package com.xiaoniu56.model.defaults;

import java.util.Date;

public class CertificateOverdueRemind {
    private String id;

    private Long seqId;

    private String documentId;

    private Long documentType;

    private Long certificateType;

    private Date certificateExpiryDate;

    private Long certificateOverdueStatus;

    private Boolean sentMessageFlag;

    private Integer sentCount;

    private Date lastSendMessageDate;

    private String lastSendMessageUserId;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    public Long getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Long documentType) {
        this.documentType = documentType;
    }

    public Long getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Long certificateType) {
        this.certificateType = certificateType;
    }

    public Date getCertificateExpiryDate() {
        return certificateExpiryDate;
    }

    public void setCertificateExpiryDate(Date certificateExpiryDate) {
        this.certificateExpiryDate = certificateExpiryDate;
    }

    public Long getCertificateOverdueStatus() {
        return certificateOverdueStatus;
    }

    public void setCertificateOverdueStatus(Long certificateOverdueStatus) {
        this.certificateOverdueStatus = certificateOverdueStatus;
    }

    public Boolean getSentMessageFlag() {
        return sentMessageFlag;
    }

    public void setSentMessageFlag(Boolean sentMessageFlag) {
        this.sentMessageFlag = sentMessageFlag;
    }

    public Integer getSentCount() {
        return sentCount;
    }

    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
    }

    public Date getLastSendMessageDate() {
        return lastSendMessageDate;
    }

    public void setLastSendMessageDate(Date lastSendMessageDate) {
        this.lastSendMessageDate = lastSendMessageDate;
    }

    public String getLastSendMessageUserId() {
        return lastSendMessageUserId;
    }

    public void setLastSendMessageUserId(String lastSendMessageUserId) {
        this.lastSendMessageUserId = lastSendMessageUserId == null ? null : lastSendMessageUserId.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVer() {
        return ver;
    }

    public void setVer(Long ver) {
        this.ver = ver;
    }
}