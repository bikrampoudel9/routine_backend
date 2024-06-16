package com.routine.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.routine.model.repos.TimeTableRepo;
import com.routine.model.entities.TimeTable;;

@Service
public class TimeTableService {

    @Autowired
    TimeTableRepo timeTableRepo;

    public List<TimeTable> getAllTimetables() {
        return timeTableRepo.findAll();
    }

    public TimeTable getTimetableById(Long id) {
        return timeTableRepo.findById(id).orElse(null);
    }

    public TimeTable saveTimetable(TimeTable timetable) {
        return timeTableRepo.save(timetable);
    }

    public void deleteTimetable(Long id) {
        timeTableRepo.deleteById(id);
    }

    public List<TimeTable> getTimeTableByGroupName(String groupName){
        return timeTableRepo.findByGroupName(groupName);
    }


}