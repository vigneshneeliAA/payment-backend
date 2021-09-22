package com.example.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int transactionid;
	String customerid;
	String receiverBIC;
	String receiveraccountholdernumber;
	String receiveraccountholdername;
	String transfertypecode;
	String messagecode;
	float transferfees;
	float inramount;
	Date transferdate;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC= receiverBIC;
	}
	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}
	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}
	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}
	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public float getTransferfees() {
		return transferfees;
	}
	public void setTransferfees(float transferfees) {
		this.transferfees = transferfees;
	}
	public float getInramount() {
		return inramount;
	}
	public void setInramount(float inramount) {
		this.inramount = inramount;
	}
	public Date getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", customerid=" + customerid + ", receiverbic="
				+ receiverBIC + ", receiveraccountholdernumber=" + receiveraccountholdernumber
				+ ", receiveraccountholdername=" + receiveraccountholdername + ", transfertypecode=" + transfertypecode
				+ ", messagecode=" + messagecode + ", transferfees=" + transferfees + ", inramount=" + inramount
				+ ", transferdate=" + transferdate + "]";
	}
	
	

}
