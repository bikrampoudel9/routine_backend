package com.routine.controller;

import org.springframework.web.bind.annotation.RestController;

import com.routine.model.entities.TimeTable;
import com.routine.model.services.TimeTableService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class Routine {

    @Autowired
    TimeTableService timeTableService;

    @RequestMapping("routine/{groupName}")
    public List<TimeTable>  getRoutine(@PathVariable String groupName) {
        // System.out.println(timeTableService.getTimeTableByGroupName("L1C9"));
        return timeTableService.getTimeTableByGroupName(groupName);
    }


}
