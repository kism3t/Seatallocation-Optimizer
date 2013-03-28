package com.prodyna.seatallocation.optimizer.model.facility;

import java.io.Serializable;

import com.prodyna.seatallocation.optimizer.model.persons.Employee;

public class Workingstation implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;

	private Employee employee;

	private boolean fixWorkingstation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isFixWorkingstation() {
		return fixWorkingstation;
	}

	public void setFixWorkingstation(boolean fixWorkingstation) {
		this.fixWorkingstation = fixWorkingstation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + (fixWorkingstation ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Workingstation)) {
			return false;
		}
		Workingstation other = (Workingstation) obj;
		if (employee == null) {
			if (other.employee != null) {
				return false;
			}
		} else if (!employee.equals(other.employee)) {
			return false;
		}
		if (fixWorkingstation != other.fixWorkingstation) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Workingstation [id=" + id + ", name=" + name + ", employee="
				+ employee + ", fixWorkingstation=" + fixWorkingstation + "]";
	}
}
