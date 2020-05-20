package com.lukas.onlineeducation.provider;

import com.lukas.onlineeducation.domain.Video;
import org.apache.ibatis.jdbc.SQL;

/**
 * video构建动态sql语句
 * @author lk
 * @date 2020-05-20 15:21
 */
public class VideoProvider {


    public String updateVideo(final Video video){
        return new SQL(){{
            UPDATE("video");

            //条件写法.
            if(video.getTitle()!= null){
                SET("title=#{title}");
            }
            if(video.getSummary()!= null){
                SET("summary=#{summary}");
            }
            if(video.getCoverImg()!= null){
                SET("cover_img=#{coverImg}");
            }
            if(video.getViewNum()!= null){
                SET("view_num=#{viewNum}");
            }
            if(video.getPrice()!= null){
                SET("price=#{price}");
            }
            if(video.getOnline()!= null){
                SET("online=#{online}");
            }
            if(video.getPoint()!= null){
                SET("point=#{point}");
            }

            WHERE("id=#{id}");
        }}.toString();
    }
}
