package com.dd.ai_smart_course.Service;

import com.dd.ai_smart_course.Entity.Score;

import java.util.List;

public interface ScoreService {
    Score getScoreByUserIdAndTaskId(int userId,int taskId);

    void insertBatch(List<Score> score);

    void deleteBatch(List<Integer> ids);

    void update(Score score);
}
