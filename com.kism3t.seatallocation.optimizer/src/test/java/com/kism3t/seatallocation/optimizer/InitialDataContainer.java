package com.kism3t.seatallocation.optimizer;

import java.util.List;

import com.kism3t.seatallocation.optimizer.model.facility.Building;
import com.kism3t.seatallocation.optimizer.model.persons.Employee;

public class InitialDataContainer {

	List<Building> buildings;
	List<Employee> employees;

	public InitialDataContainer(List<Building> buildings,
			List<Employee> employees) {
		super();
		this.buildings = buildings;
		this.employees = employees;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
