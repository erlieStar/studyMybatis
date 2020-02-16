package com.javashitang.part2.po;

public enum SexEnum {

	/*
	 * 枚举类，男学生和女学生
	 */
	MALE(1, "男"), FEMALE(2, "女");
	private int sexId;
	private String sex;

	private SexEnum(int sexId, String sex) {
		this.sexId = sexId;
		this.sex = sex;
	}

	public int getSexId() {
		return sexId;
	}

	public String getSex() {
		return sex;
	}

	public static SexEnum getSex(int id) {
		if (id == 1) {
			return MALE;
		} else if (id == 2) {
			return FEMALE;
		} else {
			return null;
		}
	}
}
