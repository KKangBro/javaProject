package com.shinhan.day10.project;

import java.util.*;

// DAO (Data Access Object)
// CRUD작업
public class DeptDAO {
	private List<DeptVO> data = new ArrayList<>();

	// 모두 조회
	public List<DeptVO> selectAll() {
		// DB가서 데이터 가져오기 코드추가될 예정 select * from departments;
		return data;
	}

	public DeptVO selectById(int deptId) {
		// 부서의 번호를 찾아서 return하기
		for (DeptVO dept : data) {
			if (dept.getDepartment_id() == deptId)
				return dept;
		}
		return null;
	}

	public void insert(DeptVO dept) {
		data.add(dept);
	}

}
