package com.dd.ai_smart_course.Controller;

import com.dd.ai_smart_course.Entity.Result;
import com.dd.ai_smart_course.Entity.Score;
import com.dd.ai_smart_course.Service.ScoreService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@Slf4j
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;


    @GetMapping("/{userId},{taskId}")
    public Result<Score> getScoreByUserIdAndTaskId(@PathVariable int userId, @PathVariable int taskId) {
        log.info("getScoreByUserId: {}{}", userId, taskId);
        Score score = scoreService.getScoreByUserIdAndTaskId(userId,taskId);
        return Result.success(score);
    }

    @PostMapping
    public Result insert(@RequestBody List<Score> scores) {
        log.info("insert: {}", scores);
        scoreService.insertBatch(scores);

        return Result.success();
    }

    @DeleteMapping
    public Result delete(@RequestBody List<Integer> ids) {
        log.info("delete: {}", ids);
        scoreService.deleteBatch(ids);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Score score) {
        log.info("update: {}", score);
        scoreService.update(score);
        return Result.success();
    }


}
