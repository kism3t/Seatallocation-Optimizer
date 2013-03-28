package com.kism3t.seatallocation.optimizer.model.facility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Building implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private List<Block> blocks = new ArrayList<Block>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blocks == null) ? 0 : blocks.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Building)) {
			return false;
		}
		Building other = (Building) obj;
		if (blocks == null) {
			if (other.blocks != null) {
				return false;
			}
		} else if (!blocks.equals(other.blocks)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", blocks=" + blocks
				+ "]";
	}

	public List<Workingstation> getWorkingstations() {

		List<Workingstation> workingstations = new ArrayList<Workingstation>();
		for (Block block : blocks) {
			workingstations.addAll(block.getWorkingstations());
		}
		return workingstations;
	}
}
