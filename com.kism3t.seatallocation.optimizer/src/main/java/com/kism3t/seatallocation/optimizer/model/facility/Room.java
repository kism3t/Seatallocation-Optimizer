package com.kism3t.seatallocation.optimizer.model.facility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.kism3t.seatallocation.optimizer.model.facility.positon.Entrance;

public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String roomNumber;
	private Entrance entrance;
	private List<Workingstation> workingstations = new ArrayList<Workingstation>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Entrance getEntrance() {
		return entrance;
	}

	public void setEntrance(Entrance entrance) {
		this.entrance = entrance;
	}

	public List<Workingstation> getWorkingstations() {
		return workingstations;
	}

	public void setWorkingstations(List<Workingstation> workingstations) {
		this.workingstations = workingstations;
	}

	public void addWorkinstation(Workingstation workingstation) {
		this.workingstations.add(workingstation);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((entrance == null) ? 0 : entrance.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((roomNumber == null) ? 0 : roomNumber.hashCode());
		result = prime * result
				+ ((workingstations == null) ? 0 : workingstations.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Room)) {
			return false;
		}
		Room other = (Room) obj;
		if (entrance != other.entrance) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (roomNumber == null) {
			if (other.roomNumber != null) {
				return false;
			}
		} else if (!roomNumber.equals(other.roomNumber)) {
			return false;
		}
		if (workingstations == null) {
			if (other.workingstations != null) {
				return false;
			}
		} else if (!workingstations.equals(other.workingstations)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {

		return new StringBuilder().append("Roomnumber [").append(roomNumber)
				.append("] Entrance [").append(entrance)
				.append("] Workingstation(s) [").append(workingstations)
				.append("]").toString();
	}
}
