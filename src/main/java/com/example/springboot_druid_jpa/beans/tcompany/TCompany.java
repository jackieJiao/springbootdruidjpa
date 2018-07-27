package com.example.springboot_druid_jpa.beans.tcompany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 企业基本信息
 * @author zhouchaochen
 *
 */
@Entity
@Table(name = "t_company")
public class TCompany {
    @Id
    private String companyId;

    private String province;

    private String companyName;

    private String startDate;

    private String econKind;

    private String operName;

    private String rawRegistCapi;

    private Double registCapi;

    private String registCapiDesc;

    private String registNo;

    private String creditCode;

    private String address;

    private String termStart;

    private String termEnd;

    private String belongOrg;

    private String checkDate;

    private String endDate;

    private String status;

    private String isExpired;

    private Date createdDate;

    private Date updatedDate;

    private String scope;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEconKind() {
        return econKind;
    }

    public void setEconKind(String econKind) {
        this.econKind = econKind == null ? null : econKind.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getRawRegistCapi() {
        return rawRegistCapi;
    }

    public void setRawRegistCapi(String rawRegistCapi) {
        this.rawRegistCapi = rawRegistCapi == null ? null : rawRegistCapi.trim();
    }

    public Double getRegistCapi() {
        return registCapi;
    }

    public void setRegistCapi(Double registCapi) {
        this.registCapi = registCapi;
    }

    public String getRegistCapiDesc() {
        return registCapiDesc;
    }

    public void setRegistCapiDesc(String registCapiDesc) {
        this.registCapiDesc = registCapiDesc == null ? null : registCapiDesc.trim();
    }

    public String getRegistNo() {
        return registNo;
    }

    public void setRegistNo(String registNo) {
        this.registNo = registNo == null ? null : registNo.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTermStart() {
        return termStart;
    }

    public void setTermStart(String termStart) {
        this.termStart = termStart == null ? null : termStart.trim();
    }

    public String getTermEnd() {
        return termEnd;
    }

    public void setTermEnd(String termEnd) {
        this.termEnd = termEnd == null ? null : termEnd.trim();
    }

    public String getBelongOrg() {
        return belongOrg;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg == null ? null : belongOrg.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired == null ? null : isExpired.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}