package com.lukas.onlineeducation.service;

import com.lukas.onlineeducation.domain.Video;

import java.util.List;

public interface VideoService {

    List<Video> findAll();

    Video findById(int id);

    int update(Video video);

    int delete(int id);
}
