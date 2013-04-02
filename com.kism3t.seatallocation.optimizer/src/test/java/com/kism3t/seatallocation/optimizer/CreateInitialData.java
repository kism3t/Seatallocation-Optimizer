package com.kism3t.seatallocation.optimizer;

import java.util.ArrayList;
import java.util.List;

import com.kism3t.seatallocation.optimizer.model.facility.Block;
import com.kism3t.seatallocation.optimizer.model.facility.Building;
import com.kism3t.seatallocation.optimizer.model.facility.Room;
import com.kism3t.seatallocation.optimizer.model.facility.Workingstation;
import com.kism3t.seatallocation.optimizer.model.person.group.Group;
import com.kism3t.seatallocation.optimizer.model.person.group.GroupStatus;
import com.kism3t.seatallocation.optimizer.model.persons.Employee;

public class CreateInitialData {

	private static long id = 0l;
	private static String buildingName = "Sample Avenue 12 ";
	private static String leftWingBlockName = "Left Wing ";
	private static String rightWingBlockName = "Right Wing ";
	private static String roomName = "Room ";
	private static String workingstationName = "Workingstation ";
	private static int roomPosition = 0;
	private static int workingstationPosition = 0;

	public static InitialDataContainer craeteSampleOffice() {

		List<Building> buildings = new ArrayList<Building>();
		// Create Building
		Building building = new Building();
		building.setId(++id);
		building.setName(buildingName);

		// Create Block/Floor
		// Create Leftwing
		building.addBlock(createSampleLeftWing());

		// Create Rightwing
		building.addBlock(createSampleRightWing());

		List<Workingstation> workingstations = building.getWorkingstations();
		// Create Employee
		List<Employee> sampleEmployees = createSampleEmployees();
		for (int i = 0; i < sampleEmployees.size(); i++) {
			sampleEmployees.get(i).setWorkingstation(workingstations.get(i));
		}

		buildings.add(building);

		InitialDataContainer initialDataContainer = new InitialDataContainer(
				buildings, sampleEmployees);
		return initialDataContainer;

	}

	/**
	 * Create 47 Employees with following grouping: <br>
	 * 10 Employess no Project <br>
	 * 2 Projects with 2 Employees (Project A,B) <br>
	 * 3 Projects with 3 Employees (Project C,D,E) <br>
	 * 3 Projects with 4 Employees (Project F,G,H)<br>
	 * 2 Projects with 6 Employees (Project I,J)<br>
	 * 
	 * @return
	 */
	private static List<Employee> createSampleEmployees() {

		Group noProject = new Group();
		noProject.setId(++id);
		noProject.setName("Projectless people");
		noProject.setGroupStatus(GroupStatus.BENCH);

		Group projectA = new Group();
		projectA.setId(++id);
		projectA.setName("Customer A");
		projectA.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectB = new Group();
		projectB.setId(++id);
		projectB.setName("Customer B");
		projectB.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectC = new Group();
		projectC.setId(++id);
		projectC.setName("Customer C");
		projectC.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectD = new Group();
		projectD.setId(++id);
		projectD.setName("Customer D");
		projectD.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectE = new Group();
		projectE.setId(++id);
		projectE.setName("Customer E");
		projectE.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectF = new Group();
		projectF.setId(++id);
		projectF.setName("Customer F");
		projectF.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectG = new Group();
		projectG.setId(++id);
		projectG.setName("Customer G");
		projectG.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectH = new Group();
		projectH.setId(++id);
		projectH.setName("Customer C");
		projectH.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectI = new Group();
		projectI.setId(++id);
		projectI.setName("Customer I");
		projectI.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		Group projectJ = new Group();
		projectJ.setId(++id);
		projectJ.setName("Customer J");
		projectJ.setGroupStatus(GroupStatus.ONGOING_PROJECT);

		List<Employee> employess = CreateInitialData.createRandomEmployees(47);

		for (int i = 0; i < employess.size(); i++) {
			// No Project Employees
			if (i < 10) {
				employess.get(i).setGroup(noProject);
				noProject.addEmployee(employess.get(i));
			} else if (i < 12) {
				employess.get(i).setGroup(projectA);
				projectA.addEmployee(employess.get(i));
			} else if (i < 14) {
				employess.get(i).setGroup(projectB);
				projectB.addEmployee(employess.get(i));
			} else if (i < 17) {
				employess.get(i).setGroup(projectC);
				projectC.addEmployee(employess.get(i));
			} else if (i < 20) {
				employess.get(i).setGroup(projectD);
				projectD.addEmployee(employess.get(i));
			} else if (i < 23) {
				employess.get(i).setGroup(projectE);
				projectE.addEmployee(employess.get(i));
			} else if (i < 27) {
				employess.get(i).setGroup(projectF);
				projectF.addEmployee(employess.get(i));
			} else if (i < 31) {
				employess.get(i).setGroup(projectG);
				projectG.addEmployee(employess.get(i));
			} else if (i < 35) {
				employess.get(i).setGroup(projectH);
				projectH.addEmployee(employess.get(i));
			} else if (i < 41) {
				employess.get(i).setGroup(projectI);
				projectI.addEmployee(employess.get(i));
			} else if (i < 47) {
				employess.get(i).setGroup(projectJ);
				projectJ.addEmployee(employess.get(i));
			}
		}
		return employess;
	}

	private static List<Employee> createRandomEmployees(int amountOfEmployees) {

		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < amountOfEmployees; i++) {
			Employee e = new Employee();
			e.setId(++id);
			e.setName("Name" + i);
			e.setSurname("Surname" + i);
			employees.add(e);
		}
		return employees;
	}

	private static Block createSampleRightWing() {
		Block rightWing = new Block();
		rightWing.setId(++id);
		rightWing.setName(rightWingBlockName);

		// Create Rightwing rooms - No Positions
		roomPosition = 0;
		workingstationPosition = 0;
		Room rightWing_room01 = new Room();
		rightWing_room01.setId(++id);
		rightWing_room01.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing.addRoom(rightWing_room01);

		workingstationPosition = 0;
		Room rightWing_room02 = new Room();
		rightWing_room02.setId(++id);
		rightWing_room02.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		rightWing_room02.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room02.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room02.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room02.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing.addRoom(rightWing_room02);

		workingstationPosition = 0;
		Room rightWing_room03 = new Room();
		rightWing_room03.setId(++id);
		rightWing_room03.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		rightWing_room03.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room03.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing_room03.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing.addRoom(rightWing_room03);

		workingstationPosition = 0;
		Room rightWing_room04 = new Room();
		rightWing_room04.setId(++id);
		rightWing_room04.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		rightWing_room04.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		rightWing.addRoom(rightWing_room04);
		return rightWing;
	}

	private static Block createSampleLeftWing() {

		// Create Leftwing
		Block leftWing = new Block();
		leftWing.setId(++id);
		leftWing.setName(leftWingBlockName);
		// Create Rightwing
		Block rightWing = new Block();
		rightWing.setId(++id);
		rightWing.setName(rightWingBlockName);

		// Create Leftwing rooms - No Positions
		Room leftWing_room01 = new Room();
		leftWing_room01.setId(++id);
		leftWing_room01.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room01.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room01);

		workingstationPosition = 0;
		Room leftWing_room02 = new Room();
		leftWing_room02.setId(++id);
		leftWing_room02.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room02.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room02);

		workingstationPosition = 0;
		Room leftWing_room03 = new Room();
		leftWing_room03.setId(++id);
		leftWing_room03.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room03.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room03);

		workingstationPosition = 0;
		Room leftWing_room04 = new Room();
		leftWing_room04.setId(++id);
		leftWing_room04.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room04.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room04);

		workingstationPosition = 0;
		Room leftWing_room05 = new Room();
		leftWing_room05.setId(++id);
		leftWing_room05.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room05.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room05);

		workingstationPosition = 0;
		Room leftWing_room06 = new Room();
		leftWing_room06.setId(++id);
		leftWing_room06.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room06.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room06.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room06);

		workingstationPosition = 0;
		Room leftWing_room07 = new Room();
		leftWing_room07.setId(++id);
		leftWing_room07.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room07.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room07.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room07);

		workingstationPosition = 0;
		Room leftWing_room08 = new Room();
		leftWing_room08.setId(++id);
		leftWing_room08.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room08.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room08.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room08.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room08.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room08);

		workingstationPosition = 0;
		Room leftWing_room09 = new Room();
		leftWing_room09.setId(++id);
		leftWing_room09.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room09.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room09.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room09.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room09);

		workingstationPosition = 0;
		Room leftWing_room10 = new Room();
		leftWing_room10.setId(++id);
		leftWing_room10.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room10.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room10.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room10.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room10);

		workingstationPosition = 0;
		Room leftWing_room11 = new Room();
		leftWing_room11.setId(++id);
		leftWing_room11.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room11.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room11);

		workingstationPosition = 0;
		Room leftWing_room12 = new Room();
		leftWing_room12.setId(++id);
		leftWing_room12.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room12.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room12.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room12.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room12.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room12);

		workingstationPosition = 0;
		Room leftWing_room13 = new Room();
		leftWing_room13.setId(++id);
		leftWing_room13.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room13.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room13.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room13.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room13.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room13);

		workingstationPosition = 0;
		Room leftWing_room14 = new Room();
		leftWing_room14.setId(++id);
		leftWing_room14.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room14.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room14.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room14.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room14);

		workingstationPosition = 0;
		Room leftWing_room15 = new Room();
		leftWing_room15.setId(++id);
		leftWing_room15.setRoomNumber(leftWingBlockName + roomName
				+ ++roomPosition);
		leftWing_room15.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing_room15.addWorkinstation(new Workingstation(++id,
				leftWingBlockName + roomPosition + " " + workingstationName
						+ ++workingstationPosition));
		leftWing.addRoom(leftWing_room15);
		return leftWing;
	}

}