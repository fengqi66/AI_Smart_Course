package com.dd.ai_smart_course.Controller;

import com.dd.ai_smart_course.Entity.Result;
import com.dd.ai_smart_course.Entity.Score;
import com.dd.ai_smart_course.Service.ScoreService;
import com.dd.ai_smart_course.Service.TaskService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@Slf4j
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;






}
