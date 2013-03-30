package com.kism3t.seatallocation.optimizer.solver;

import java.util.List;

import org.drools.planner.config.XmlSolverFactory;
import org.drools.planner.core.Solver;

import com.kism3t.seatallocation.optimizer.model.facility.Building;
import com.kism3t.seatallocation.optimizer.model.persons.Employee;
import com.kisme3t.seatallocation.optimizer.solution.SeatallocationSolution;

public class SeatallocationSolver {

	private List<Building> buildings;
	private List<Employee> employees;
	private Solver solver;
	private SeatallocationSolution bestSolution = null;

	public SeatallocationSolver(List<Building> buildings,
			List<Employee> employees, String configPath) {

		this.buildings = buildings;
		this.employees = employees;

		XmlSolverFactory solverFactory = new XmlSolverFactory();
		solverFactory.configure(configPath);
		solver = solverFactory.buildSolver();

	}

	public SeatallocationSolution solve() {

		SeatallocationSolution planningProblem = new SeatallocationSolution();
		planningProblem.setBuildings(buildings);
		planningProblem.setEmployees(employees);
		solver.setPlanningProblem(planningProblem);

		solver.solve();

		bestSolution = (SeatallocationSolution) solver.getBestSolution();
		return bestSolution;
	}

	public SeatallocationSolution getBestSolution() {
		return bestSolution;
	}

}
