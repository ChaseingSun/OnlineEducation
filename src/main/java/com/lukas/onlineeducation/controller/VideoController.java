package com.lukas.onlineeducation.controller;

import com.lukas.onlineeducation.domain.Video;
import com.lukas.onlineeducation.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object pageVideo(){
        return videoService.findAll();
    }

    @GetMapping("find_by_id")
    public Object findById(int videoId){
        return videoService.findById(videoId);
    }

    @PutMapping("update_by_id")
    public Object updateById(int videoId, String videoTitle){
        Video video = new Video();
        video.setId(videoId);
        video.setTitle(videoTitle);
        return videoService.update(video);
    }

    @DeleteMapping("delete_by_id")
    public Object deleteById(int videoId){
        return videoService.delete(videoId);
    }

}
