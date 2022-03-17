package com.wh.json.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName user1
 */
@TableName(value ="user1")
public class User1 implements Serializable {
    /**
     * 
     */
    private String atd;

    /**
     * 
     */
    private String blNo;

    /**
     * 
     */
    private String bookOrderNum;

    /**
     * 
     */
    private String branchInvNo;

    /**
     * 
     */
    private String clearanceNo;

    /**
     * 
     */
    private String currencyCode;

    /**
     * 
     */
    private String custInvNoBranch;

    /**
     * 
     */
    private String customerId;

    /**
     * 
     */
    private String customsBrokerVendor;

    /**
     * 
     */
    private String cutoffDate;

    /**
     * 
     */
    private String detailAddress;

    /**
     * 
     */
    private String earliestDate;

    /**
     * 
     */
    private String endScheduleFromFac;

    /**
     * 
     */
    private String etd;

    /**
     * 
     */
    private String headerId;

    /**
     * 
     */
    private String invoiceDate;

    /**
     * 
     */
    private String invoiceNo;

    /**
     * 
     */
    private String isBondedArea;

    /**
     * 
     */
    private String isContainerOfFac;

    /**
     * 
     */
    private String orgId;

    /**
     * 
     */
    private String organizationId;

    /**
     * 
     */
    private String planOperator;

    /**
     * 
     */
    private String preLittleContainerQty;

    /**
     * 
     */
    private String salesPersonId;

    /**
     * 
     */
    private String shipNumbers;

    /**
     * 
     */
    private String shipToOrgId;

    /**
     * 
     */
    private String shipsCompanyCode;

    /**
     * 
     */
    private String shipsCompanyName;

    /**
     * 
     */
    private String terminal;

    /**
     * 
     */
    private String vendorId;

    /**
     * 
     */
    private String vesselAndVoyage;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getAtd() {
        return atd;
    }

    /**
     * 
     */
    public void setAtd(String atd) {
        this.atd = atd;
    }

    /**
     * 
     */
    public String getBlNo() {
        return blNo;
    }

    /**
     * 
     */
    public void setBlNo(String blNo) {
        this.blNo = blNo;
    }

    /**
     * 
     */
    public String getBookOrderNum() {
        return bookOrderNum;
    }

    /**
     * 
     */
    public void setBookOrderNum(String bookOrderNum) {
        this.bookOrderNum = bookOrderNum;
    }

    /**
     * 
     */
    public String getBranchInvNo() {
        return branchInvNo;
    }

    /**
     * 
     */
    public void setBranchInvNo(String branchInvNo) {
        this.branchInvNo = branchInvNo;
    }

    /**
     * 
     */
    public String getClearanceNo() {
        return clearanceNo;
    }

    /**
     * 
     */
    public void setClearanceNo(String clearanceNo) {
        this.clearanceNo = clearanceNo;
    }

    /**
     * 
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * 
     */
    public String getCustInvNoBranch() {
        return custInvNoBranch;
    }

    /**
     * 
     */
    public void setCustInvNoBranch(String custInvNoBranch) {
        this.custInvNoBranch = custInvNoBranch;
    }

    /**
     * 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     */
    public String getCustomsBrokerVendor() {
        return customsBrokerVendor;
    }

    /**
     * 
     */
    public void setCustomsBrokerVendor(String customsBrokerVendor) {
        this.customsBrokerVendor = customsBrokerVendor;
    }

    /**
     * 
     */
    public String getCutoffDate() {
        return cutoffDate;
    }

    /**
     * 
     */
    public void setCutoffDate(String cutoffDate) {
        this.cutoffDate = cutoffDate;
    }

    /**
     * 
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * 
     */
    public String getEarliestDate() {
        return earliestDate;
    }

    /**
     * 
     */
    public void setEarliestDate(String earliestDate) {
        this.earliestDate = earliestDate;
    }

    /**
     * 
     */
    public String getEndScheduleFromFac() {
        return endScheduleFromFac;
    }

    /**
     * 
     */
    public void setEndScheduleFromFac(String endScheduleFromFac) {
        this.endScheduleFromFac = endScheduleFromFac;
    }

    /**
     * 
     */
    public String getEtd() {
        return etd;
    }

    /**
     * 
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }

    /**
     * 
     */
    public String getHeaderId() {
        return headerId;
    }

    /**
     * 
     */
    public void setHeaderId(String headerId) {
        this.headerId = headerId;
    }

    /**
     * 
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * 
     */
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * 
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * 
     */
    public String getIsBondedArea() {
        return isBondedArea;
    }

    /**
     * 
     */
    public void setIsBondedArea(String isBondedArea) {
        this.isBondedArea = isBondedArea;
    }

    /**
     * 
     */
    public String getIsContainerOfFac() {
        return isContainerOfFac;
    }

    /**
     * 
     */
    public void setIsContainerOfFac(String isContainerOfFac) {
        this.isContainerOfFac = isContainerOfFac;
    }

    /**
     * 
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * 
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 
     */
    public String getPlanOperator() {
        return planOperator;
    }

    /**
     * 
     */
    public void setPlanOperator(String planOperator) {
        this.planOperator = planOperator;
    }

    /**
     * 
     */
    public String getPreLittleContainerQty() {
        return preLittleContainerQty;
    }

    /**
     * 
     */
    public void setPreLittleContainerQty(String preLittleContainerQty) {
        this.preLittleContainerQty = preLittleContainerQty;
    }

    /**
     * 
     */
    public String getSalesPersonId() {
        return salesPersonId;
    }

    /**
     * 
     */
    public void setSalesPersonId(String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    /**
     * 
     */
    public String getShipNumbers() {
        return shipNumbers;
    }

    /**
     * 
     */
    public void setShipNumbers(String shipNumbers) {
        this.shipNumbers = shipNumbers;
    }

    /**
     * 
     */
    public String getShipToOrgId() {
        return shipToOrgId;
    }

    /**
     * 
     */
    public void setShipToOrgId(String shipToOrgId) {
        this.shipToOrgId = shipToOrgId;
    }

    /**
     * 
     */
    public String getShipsCompanyCode() {
        return shipsCompanyCode;
    }

    /**
     * 
     */
    public void setShipsCompanyCode(String shipsCompanyCode) {
        this.shipsCompanyCode = shipsCompanyCode;
    }

    /**
     * 
     */
    public String getShipsCompanyName() {
        return shipsCompanyName;
    }

    /**
     * 
     */
    public void setShipsCompanyName(String shipsCompanyName) {
        this.shipsCompanyName = shipsCompanyName;
    }

    /**
     * 
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * 
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * 
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * 
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * 
     */
    public String getVesselAndVoyage() {
        return vesselAndVoyage;
    }

    /**
     * 
     */
    public void setVesselAndVoyage(String vesselAndVoyage) {
        this.vesselAndVoyage = vesselAndVoyage;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User1 other = (User1) that;
        return (this.getAtd() == null ? other.getAtd() == null : this.getAtd().equals(other.getAtd()))
            && (this.getBlNo() == null ? other.getBlNo() == null : this.getBlNo().equals(other.getBlNo()))
            && (this.getBookOrderNum() == null ? other.getBookOrderNum() == null : this.getBookOrderNum().equals(other.getBookOrderNum()))
            && (this.getBranchInvNo() == null ? other.getBranchInvNo() == null : this.getBranchInvNo().equals(other.getBranchInvNo()))
            && (this.getClearanceNo() == null ? other.getClearanceNo() == null : this.getClearanceNo().equals(other.getClearanceNo()))
            && (this.getCurrencyCode() == null ? other.getCurrencyCode() == null : this.getCurrencyCode().equals(other.getCurrencyCode()))
            && (this.getCustInvNoBranch() == null ? other.getCustInvNoBranch() == null : this.getCustInvNoBranch().equals(other.getCustInvNoBranch()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomsBrokerVendor() == null ? other.getCustomsBrokerVendor() == null : this.getCustomsBrokerVendor().equals(other.getCustomsBrokerVendor()))
            && (this.getCutoffDate() == null ? other.getCutoffDate() == null : this.getCutoffDate().equals(other.getCutoffDate()))
            && (this.getDetailAddress() == null ? other.getDetailAddress() == null : this.getDetailAddress().equals(other.getDetailAddress()))
            && (this.getEarliestDate() == null ? other.getEarliestDate() == null : this.getEarliestDate().equals(other.getEarliestDate()))
            && (this.getEndScheduleFromFac() == null ? other.getEndScheduleFromFac() == null : this.getEndScheduleFromFac().equals(other.getEndScheduleFromFac()))
            && (this.getEtd() == null ? other.getEtd() == null : this.getEtd().equals(other.getEtd()))
            && (this.getHeaderId() == null ? other.getHeaderId() == null : this.getHeaderId().equals(other.getHeaderId()))
            && (this.getInvoiceDate() == null ? other.getInvoiceDate() == null : this.getInvoiceDate().equals(other.getInvoiceDate()))
            && (this.getInvoiceNo() == null ? other.getInvoiceNo() == null : this.getInvoiceNo().equals(other.getInvoiceNo()))
            && (this.getIsBondedArea() == null ? other.getIsBondedArea() == null : this.getIsBondedArea().equals(other.getIsBondedArea()))
            && (this.getIsContainerOfFac() == null ? other.getIsContainerOfFac() == null : this.getIsContainerOfFac().equals(other.getIsContainerOfFac()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrganizationId() == null ? other.getOrganizationId() == null : this.getOrganizationId().equals(other.getOrganizationId()))
            && (this.getPlanOperator() == null ? other.getPlanOperator() == null : this.getPlanOperator().equals(other.getPlanOperator()))
            && (this.getPreLittleContainerQty() == null ? other.getPreLittleContainerQty() == null : this.getPreLittleContainerQty().equals(other.getPreLittleContainerQty()))
            && (this.getSalesPersonId() == null ? other.getSalesPersonId() == null : this.getSalesPersonId().equals(other.getSalesPersonId()))
            && (this.getShipNumbers() == null ? other.getShipNumbers() == null : this.getShipNumbers().equals(other.getShipNumbers()))
            && (this.getShipToOrgId() == null ? other.getShipToOrgId() == null : this.getShipToOrgId().equals(other.getShipToOrgId()))
            && (this.getShipsCompanyCode() == null ? other.getShipsCompanyCode() == null : this.getShipsCompanyCode().equals(other.getShipsCompanyCode()))
            && (this.getShipsCompanyName() == null ? other.getShipsCompanyName() == null : this.getShipsCompanyName().equals(other.getShipsCompanyName()))
            && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()))
            && (this.getVendorId() == null ? other.getVendorId() == null : this.getVendorId().equals(other.getVendorId()))
            && (this.getVesselAndVoyage() == null ? other.getVesselAndVoyage() == null : this.getVesselAndVoyage().equals(other.getVesselAndVoyage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAtd() == null) ? 0 : getAtd().hashCode());
        result = prime * result + ((getBlNo() == null) ? 0 : getBlNo().hashCode());
        result = prime * result + ((getBookOrderNum() == null) ? 0 : getBookOrderNum().hashCode());
        result = prime * result + ((getBranchInvNo() == null) ? 0 : getBranchInvNo().hashCode());
        result = prime * result + ((getClearanceNo() == null) ? 0 : getClearanceNo().hashCode());
        result = prime * result + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        result = prime * result + ((getCustInvNoBranch() == null) ? 0 : getCustInvNoBranch().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomsBrokerVendor() == null) ? 0 : getCustomsBrokerVendor().hashCode());
        result = prime * result + ((getCutoffDate() == null) ? 0 : getCutoffDate().hashCode());
        result = prime * result + ((getDetailAddress() == null) ? 0 : getDetailAddress().hashCode());
        result = prime * result + ((getEarliestDate() == null) ? 0 : getEarliestDate().hashCode());
        result = prime * result + ((getEndScheduleFromFac() == null) ? 0 : getEndScheduleFromFac().hashCode());
        result = prime * result + ((getEtd() == null) ? 0 : getEtd().hashCode());
        result = prime * result + ((getHeaderId() == null) ? 0 : getHeaderId().hashCode());
        result = prime * result + ((getInvoiceDate() == null) ? 0 : getInvoiceDate().hashCode());
        result = prime * result + ((getInvoiceNo() == null) ? 0 : getInvoiceNo().hashCode());
        result = prime * result + ((getIsBondedArea() == null) ? 0 : getIsBondedArea().hashCode());
        result = prime * result + ((getIsContainerOfFac() == null) ? 0 : getIsContainerOfFac().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        result = prime * result + ((getPlanOperator() == null) ? 0 : getPlanOperator().hashCode());
        result = prime * result + ((getPreLittleContainerQty() == null) ? 0 : getPreLittleContainerQty().hashCode());
        result = prime * result + ((getSalesPersonId() == null) ? 0 : getSalesPersonId().hashCode());
        result = prime * result + ((getShipNumbers() == null) ? 0 : getShipNumbers().hashCode());
        result = prime * result + ((getShipToOrgId() == null) ? 0 : getShipToOrgId().hashCode());
        result = prime * result + ((getShipsCompanyCode() == null) ? 0 : getShipsCompanyCode().hashCode());
        result = prime * result + ((getShipsCompanyName() == null) ? 0 : getShipsCompanyName().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        result = prime * result + ((getVendorId() == null) ? 0 : getVendorId().hashCode());
        result = prime * result + ((getVesselAndVoyage() == null) ? 0 : getVesselAndVoyage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", atd=").append(atd);
        sb.append(", blNo=").append(blNo);
        sb.append(", bookOrderNum=").append(bookOrderNum);
        sb.append(", branchInvNo=").append(branchInvNo);
        sb.append(", clearanceNo=").append(clearanceNo);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", custInvNoBranch=").append(custInvNoBranch);
        sb.append(", customerId=").append(customerId);
        sb.append(", customsBrokerVendor=").append(customsBrokerVendor);
        sb.append(", cutoffDate=").append(cutoffDate);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", earliestDate=").append(earliestDate);
        sb.append(", endScheduleFromFac=").append(endScheduleFromFac);
        sb.append(", etd=").append(etd);
        sb.append(", headerId=").append(headerId);
        sb.append(", invoiceDate=").append(invoiceDate);
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", isBondedArea=").append(isBondedArea);
        sb.append(", isContainerOfFac=").append(isContainerOfFac);
        sb.append(", orgId=").append(orgId);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", planOperator=").append(planOperator);
        sb.append(", preLittleContainerQty=").append(preLittleContainerQty);
        sb.append(", salesPersonId=").append(salesPersonId);
        sb.append(", shipNumbers=").append(shipNumbers);
        sb.append(", shipToOrgId=").append(shipToOrgId);
        sb.append(", shipsCompanyCode=").append(shipsCompanyCode);
        sb.append(", shipsCompanyName=").append(shipsCompanyName);
        sb.append(", terminal=").append(terminal);
        sb.append(", vendorId=").append(vendorId);
        sb.append(", vesselAndVoyage=").append(vesselAndVoyage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}