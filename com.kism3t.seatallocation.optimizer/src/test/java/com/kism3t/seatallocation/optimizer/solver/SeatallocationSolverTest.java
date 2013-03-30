package com.kism3t.seatallocation.optimizer.solver;

import org.junit.Test;

import com.kism3t.seatallocation.optimizer.CreateInitialData;
import com.kism3t.seatallocation.optimizer.InitialDataContainer;

public class SeatallocationSolverTest {

	@Test
	public void testSolver() {

		InitialDataContainer initialDataContainer = CreateInitialData
				.craeteSampleOffice();
		SeatallocationSolver solver = new SeatallocationSolver(
				initialDataContainer.getBuildings(),
				initialDataContainer.getEmployees(),
				"/solver/optimizerSolverConfiguration.xml");
		solver.solve();
	}
}
