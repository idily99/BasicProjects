package com.red.bus.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bus")
public class BusDto 
{
	@Id
	int ticket_no;
	@Column(name="source")
	String source;
	@Column(name="distnation")
	String distnation;
	public int getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(int ticket_no) {
		this.ticket_no = ticket_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDistnation() {
		return distnation;
	}
	public void setDistnation(String distnation) {
		this.distnation = distnation;
	}
	@Override
	public String toString() {
		return "BusDto [ticket_no=" + ticket_no + ", source=" + source + ", distnation=" + distnation + "]";
	}
	
}
