package com.zcbspay.platform.demo.bean;

/**
 * 实时代付请求bean
 * @author: zhangshd
 * @date:   2017年3月13日 下午1:17:46   
 * @version :v1.0
 */
public class RealTimePayReqBean extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6480809760868993217L;
	private String 	txnTime	;//	订单发送时间
	private String payTimeout;//支付超时时间
	private String 	merId	;//	商户代码
	private String 	merName	;//	商户全称
	private String 	merAbbr	;//	商户简称
	private String 	orderId	;//	商户订单号
	private String 	currencyCode	;//	交易币种
	private String 	txnAmt	;//	金额
	private String 	encryptData	;//	加密信息域
	private String 	reserved	;//	保留域
	private String 	backUrl	;//	通知地址
	
	private String orderDesc;//订单描述
	
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public String getBackUrl() {
		return backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}
	public String getPayTimeout() {
		return payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
	}
	public String getTxnTime() {
		return txnTime;
	}
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}
	public String getMerId() {
		return merId;
	}
	public void setMerId(String merId) {
		this.merId = merId;
	}
	public String getMerName() {
		return merName;
	}
	public void setMerName(String merName) {
		this.merName = merName;
	}
	public String getMerAbbr() {
		return merAbbr;
	}
	public void setMerAbbr(String merAbbr) {
		this.merAbbr = merAbbr;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getTxnAmt() {
		return txnAmt;
	}
	public void setTxnAmt(String txnAmt) {
		this.txnAmt = txnAmt;
	}
	public String getEncryptData() {
		return encryptData;
	}
	public void setEncryptData(String encryptData) {
		this.encryptData = encryptData;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}


}
