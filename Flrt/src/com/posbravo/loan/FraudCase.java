package com.posbravo.loan;
import java.math.BigDecimal;
import java.util.Date;

public class FraudCase {
	private String id_frd_case;
	private BigDecimal amt_loss;
	private String frd_case_sts;
	private String lost_type;
	private Date open_case;
	private Date close_date;
	
 public FraudCase() {
	super();
	
 }

public FraudCase(String id_frd_case, BigDecimal amt_loss, String frd_case_sts,
		String lost_type, Date open_case, Date close_date) {
	super();
	this.id_frd_case = id_frd_case;
	this.amt_loss = amt_loss;
	this.frd_case_sts = frd_case_sts;
	this.lost_type = lost_type;
	this.open_case = open_case;
	this.close_date = close_date;
}

public String getId_frd_case() {
	return id_frd_case;
}

public void setId_frd_case(String id_frd_case) {
	this.id_frd_case = id_frd_case;
}

public BigDecimal getAmt_loss() {
	return amt_loss;
}

public void setAmt_loss(BigDecimal amt_loss) {
	this.amt_loss = amt_loss;
}

public String getFrd_case_sts() {
	return frd_case_sts;
}

public void setFrd_case_sts(String frd_case_sts) {
	this.frd_case_sts = frd_case_sts;
}

public String getLost_type() {
	return lost_type;
}

public void setLost_type(String lost_type) {
	this.lost_type = lost_type;
}

public Date getOpen_case() {
	return open_case;
}

public void setOpen_case(Date open_case) {
	this.open_case = open_case;
}

public Date getClose_date() {
	return close_date;
}

public void setClose_date(Date close_date) {
	this.close_date = close_date;
}

 
}
