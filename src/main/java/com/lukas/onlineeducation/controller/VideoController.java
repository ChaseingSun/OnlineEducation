package com.lukas.onlineeducation.controller;

import com.lukas.onlineeducation.domain.Video;
import com.lukas.onlineeducation.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * video接口
 * @author lk
 * @date 2020-05-20 11:10
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 分页接口
     * @param page  当前第几页，默认第一页
     * @param size  每页显示几条
     * @return
     */
    @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size){
        return videoService.findAll();
    }

    /**
     * 根据id查找视频
     * @param videoId
     * @return
     */
    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id", required = true) int videoId){
        return videoService.findById(videoId);
    }



}
