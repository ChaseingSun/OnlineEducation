package com.lukas.onlineeducation.mapper;

import com.lukas.onlineeducation.domain.Video;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VideoMapper {

    @Select("select * from video")
    List<Video> findAll();

    @Select("select * from video where id = #{id}")
    Video findById(int id);

    @Update("update video set title = #{title} where id = #{id}")
    int update(Video video);

    @Delete("delete from video where id = #{id}")
    int delete(int id);
}
