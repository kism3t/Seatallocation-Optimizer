package com.kism3t.seatallocation.optimizer;

import java.util.ArrayList;
import java.util.List;

import com.kism3t.seatallocation.optimizer.model.facility.Block;
import com.kism3t.seatallocation.optimizer.model.facility.Building;
import com.kism3t.seatallocation.optimizer.model.facility.Room;
import com.kism3t.seatallocation.optimizer.model.facility.Workingstation;

public class CreateInitialData {

	public static List<Building> craeteSampleOffice() {

		long id = 0l;
		String buildingName = "Sample Avenue 12 ";
		String leftWingBlockName = "Left Wing ";
		String rightWingBlockName = "Right Wing ";
		String roomName = "Room ";
		String workingstationName = "Workingstation ";
		int roomPosition = 0;
		int workingstationPosition = 0;

		List<Building> buildings = new ArrayList<Building>();
		// Create Building
		Building building = new Building();
		building.setId(++id);
		building.setName(buildingName);

		// Create Block/Floor
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
		building.addBlock(leftWing);

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
		building.addBlock(rightWing);

		buildings.add(building);
		return buildings;

	}

}