package com.cubic.HibernateWithAnnotations;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regemp")
@AttributeOverrides({
	@AttributeOverride(name="eid",column=@Column(name="eid")),
	@AttributeOverride(name="ename",column=@Column(name="ename"))
})
public class RegularEmployee extends Employee {
	@Column(name="salary")
	private int salary;
	@Column(name="bonus")
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
