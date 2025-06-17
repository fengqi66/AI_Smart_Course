package com.dd.ai_smart_course.Mapper;

import com.dd.ai_smart_course.Entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper {


    @Select("SELECT * FROM score WHERE user_id = #{userId} and task_id=#{taskId}")
    Score getScoreByUserIdAndTaskId(int userId,int taskId);

    @Select("SELECT * FROM score WHERE id = #{id}")
    Score getScoreById(int id);

    void insertBatch(List<Score> scores);

    void update(Score score);
}
