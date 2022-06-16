package com.spinsoft.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spinsoft.model.Task;
import com.spinsoft.model.Users;

public class TaskMapper implements RowMapper<Task> {

	@Override
	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
		Task task = new Task();
		task.taskId = rs.getInt("task_id");
		task.taskName = rs.getString("task_name");
		task.createdBy = rs.getString("created_by");
		task.status = rs.getString("status");
		return task;
	}

}