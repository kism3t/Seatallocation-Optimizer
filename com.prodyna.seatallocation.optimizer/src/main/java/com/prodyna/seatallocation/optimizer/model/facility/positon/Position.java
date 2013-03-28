package com.prodyna.seatallocation.optimizer.model.facility.positon;

public class Position {

	private Coordinate left_bottom;
	private Coordinate right_top;

	public Coordinate getLeft_bottom() {
		return left_bottom;
	}

	public void setLeft_bottom(Coordinate left_bottom) {
		this.left_bottom = left_bottom;
	}

	public Coordinate getRight_top() {
		return right_top;
	}

	public void setRight_top(Coordinate right_top) {
		this.right_top = right_top;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((left_bottom == null) ? 0 : left_bottom.hashCode());
		result = prime * result
				+ ((right_top == null) ? 0 : right_top.hashCode());
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
		if (!(obj instanceof Position)) {
			return false;
		}
		Position other = (Position) obj;
		if (left_bottom == null) {
			if (other.left_bottom != null) {
				return false;
			}
		} else if (!left_bottom.equals(other.left_bottom)) {
			return false;
		}
		if (right_top == null) {
			if (other.right_top != null) {
				return false;
			}
		} else if (!right_top.equals(other.right_top)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Position [left_bottom=" + left_bottom + ", right_top="
				+ right_top + "]";
	}
}
