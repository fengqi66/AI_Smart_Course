package com.dd.ai_smart_course.Service.Impl;

import com.dd.ai_smart_course.Entity.Score;
import com.dd.ai_smart_course.Mapper.ScoreMapper;
import com.dd.ai_smart_course.Service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public Score getScoreByUserIdAndTaskId(int userId,int taskId) {
        Score score = scoreMapper.getScoreByUserIdAndTaskId(userId,taskId);
        return score;
    }

    @Override
    public void insertBatch(List<Score> scores) {
        scoreMapper.insertBatch(scores);
    }

    @Override
    public void deleteBatch(List<Integer> ids) {
        for(Integer id: ids){
            scoreMapper.getScoreById(id);
        }

    }

    @Override
    public void update(Score score) {
        score.setSubmitTime(new Timestamp(System.currentTimeMillis()));
        scoreMapper.update(score);
    }
}
