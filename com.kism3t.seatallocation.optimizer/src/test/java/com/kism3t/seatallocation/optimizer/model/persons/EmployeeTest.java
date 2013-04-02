package com.kism3t.seatallocation.optimizer.model.persons;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.kism3t.seatallocation.optimizer.model.facility.Workingstation;
import com.kism3t.seatallocation.optimizer.model.person.group.Group;
import com.kism3t.seatallocation.optimizer.model.person.group.GroupStatus;

public class EmployeeTest {

	@Test
	@Ignore
	public void cloneTest() throws Exception {

		Group group = new Group();
		group.setId(123);
		group.setName("SCHOTT");
		group.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Workingstation workingstation = new Workingstation();
		workingstation.setId(789);
		workingstation.setName("Station 2");

		Employee e = new Employee();
		e.setId(565);
		e.setGroup(group);
		e.setName("Max");
		e.setSurname("Mustermann");
		e.setWorkingstation(workingstation);

		Employee clone = e.clone();

		Assert.assertEquals(e.getId(), clone.getId());
		Assert.assertEquals(e.getName(), clone.getName());
		Assert.assertEquals(e.getSurname(), clone.getSurname());
		Assert.assertEquals(e.getGroup(), clone.getGroup());
		Assert.assertEquals(e.getWorkingstation(), clone.getWorkingstation());

	}
}
