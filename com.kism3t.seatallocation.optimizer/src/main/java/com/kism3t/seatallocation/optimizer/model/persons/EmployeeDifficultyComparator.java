package com.kism3t.seatallocation.optimizer.model.persons;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

public class EmployeeDifficultyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {

		return new CompareToBuilder().append(arg0.getGroup().groupSize(),
				arg1.getGroup().groupSize()).toComparison();
	}

}
