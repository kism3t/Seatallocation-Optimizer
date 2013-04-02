package com.kism3t.seatallocation.optimizer.solver;

import org.junit.Test;

import com.kism3t.seatallocation.optimizer.CreateInitialData;
import com.kism3t.seatallocation.optimizer.InitialDataContainer;
import com.kisme3t.seatallocation.optimizer.solution.SeatallocationSolution;

public class SeatallocationSolverTest {

	@Test
	public void testSolver() {

		InitialDataContainer initialDataContainer = CreateInitialData
				.craeteSampleOffice();
		SeatallocationSolver solver = new SeatallocationSolver(
				initialDataContainer.getBuildings(),
				initialDataContainer.getEmployees(),
				"/solver/optimizerSolverConfiguration.xml");
		SeatallocationSolution solution = solver.solve();

	}
}
