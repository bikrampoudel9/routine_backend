package com.routine.model.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.routine.model.entities.TimeTable;

@Repository
public interface TimeTableRepo extends JpaRepository<TimeTable,Long> {

    public List<TimeTable> findByGroupName(String groupName);

}