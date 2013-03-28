package com.kism3t.seatallocation.optimizer.solver;

import org.drools.planner.core.Solver;
import org.drools.planner.core.event.SolverEventListener;
import org.drools.planner.core.score.director.ScoreDirectorFactory;
import org.drools.planner.core.solution.Solution;
import org.drools.planner.core.solver.ProblemFactChange;

public class SeatallocationSolver implements Solver {

	@Override
	public void addEventListener(SolverEventListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addProblemFactChange(ProblemFactChange arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Solution getBestSolution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreDirectorFactory getScoreDirectorFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getTimeMillisSpend() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEveryProblemFactChangeProcessed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSolving() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTerminateEarly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeEventListener(SolverEventListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPlanningProblem(Solution arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void solve() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean terminateEarly() {
		// TODO Auto-generated method stub
		return false;
	}

}
