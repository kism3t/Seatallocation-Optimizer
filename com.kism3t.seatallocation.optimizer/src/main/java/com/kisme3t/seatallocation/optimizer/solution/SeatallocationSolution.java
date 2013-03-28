package com.kisme3t.seatallocation.optimizer.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.drools.planner.core.score.buildin.hardandsoft.HardAndSoftScore;
import org.drools.planner.core.solution.Solution;

import com.kism3t.seatallocation.optimizer.model.facility.Building;
import com.kism3t.seatallocation.optimizer.model.facility.Workingstation;
import com.kism3t.seatallocation.optimizer.model.persons.Employee;

public class SeatallocationSolution implements Solution<HardAndSoftScore> {

	// Problem Facts
	List<Building> buildings = new ArrayList<Building>();

	// Planning Entities
	List<Employee> employees = new ArrayList<Employee>();

	// Score
	HardAndSoftScore score;

	public List<Workingstation> getWorkingstations() {

		List<Workingstation> workingstations = new ArrayList<Workingstation>();
		for (Building building : buildings) {
			workingstations.addAll(building.getWorkingstations());
		}
		return workingstations;
	}

	@Override
	public Solution<HardAndSoftScore> cloneSolution() {

		SeatallocationSolution clone = new SeatallocationSolution();

		// Problem Facts stay the same
		clone.buildings = buildings;

		// Planning Facts need to be cloned
		for (Employee employee : employees) {
			clone.employees.add(employee.clone());
		}
		return clone;
	}

	@Override
	public Collection<? extends Object> getProblemFacts() {

		/*
		 * All Planning Facts are inserted into WorkingMemory by default. Here
		 * are all Problem Facts.
		 */
		List<Object> facts = new ArrayList<Object>();
		facts.addAll(buildings);
		return facts;
	}

	@Override
	public HardAndSoftScore getScore() {

		return score;
	}

	@Override
	public void setScore(HardAndSoftScore score) {

		this.score = score;
	}

}
