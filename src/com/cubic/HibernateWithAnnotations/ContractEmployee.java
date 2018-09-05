package com.cubic.HibernateWithAnnotations;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conemp")
@AttributeOverrides({
	@AttributeOverride(name="eid",column=@Column(name="eid")),
	@AttributeOverride(name="ename",column=@Column(name="ename"))
})
public class ContractEmployee extends Employee{
	@Column(name="payperhour")
	private int payperhour;
	@Column(name="duration")
	private String duration;
	public int getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(int payperhour) {
		this.payperhour = payperhour;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
