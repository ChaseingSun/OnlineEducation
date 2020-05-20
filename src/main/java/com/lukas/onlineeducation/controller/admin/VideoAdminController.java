package com.lukas.onlineeducation.controller.admin;

import com.lukas.onlineeducation.domain.Video;
import com.lukas.onlineeducation.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员权限视频接口
 * @author lk
 * @date 2020-05-20 14:56
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {

    @Autowired
    private VideoService videoService;
    /**
     * 更新视频
     * @param video
     * @return
     */
    @PutMapping("update_by_id")
    public Object updateById(@RequestBody Video video){
        return videoService.update(video);
    }

    /**
     * 根据id删除视频
     * @param videoId
     * @return
     */
    @DeleteMapping("delete_by_id")
    public Object deleteById(@RequestParam(value = "video_id", required = true) int videoId){
        return videoService.delete(videoId);
    }
}
