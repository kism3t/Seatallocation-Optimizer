package com.kism3t.seatallocation.optimizer.model.persons;

import org.drools.planner.api.domain.entity.PlanningEntity;
import org.drools.planner.api.domain.variable.PlanningVariable;
import org.drools.planner.api.domain.variable.ValueRange;
import org.drools.planner.api.domain.variable.ValueRangeType;

import com.kism3t.seatallocation.optimizer.model.facility.Workingstation;
import com.kism3t.seatallocation.optimizer.model.person.group.Group;

@PlanningEntity
public class Employee {

	private long id;
	private String name;
	private String surname;
	private Group group;

	private Workingstation workingstation;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@PlanningVariable
	@ValueRange(type = ValueRangeType.FROM_SOLUTION_PROPERTY, solutionProperty = "workingstations")
	public Workingstation getWorkingstation() {
		return workingstation;
	}

	public void setWorkingstation(Workingstation workingstation) {
		this.workingstation = workingstation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", group=" + group + ", workingstation=" + workingstation
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result
				+ ((workingstation == null) ? 0 : workingstation.hashCode());
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
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (group == null) {
			if (other.group != null) {
				return false;
			}
		} else if (!group.equals(other.group)) {
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
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		if (workingstation == null) {
			if (other.workingstation != null) {
				return false;
			}
		} else if (!workingstation.equals(other.workingstation)) {
			return false;
		}
		return true;
	}

	public Employee clone() {

		Employee clone = new Employee();
		clone.id = this.id;
		clone.name = this.name;
		clone.surname = this.surname;
		clone.group = this.group;
		clone.workingstation = this.workingstation;
		return clone;
	}
}
