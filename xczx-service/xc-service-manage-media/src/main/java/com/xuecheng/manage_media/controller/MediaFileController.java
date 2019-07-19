package com.xuecheng.manage_media.controller;

import com.xuecheng.api.media.MediaFileControllerApi;
import com.xuecheng.framework.domain.media.MediaFile;
import com.xuecheng.framework.domain.media.request.QueryMediaFileRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_media.service.MediaFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Kiku
 * @date 2019/7/12 16:12
 */
@RestController
@RequestMapping("/media/file")
public class MediaFileController implements MediaFileControllerApi {

    @Autowired
    MediaFileService mediaFileService;
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult<MediaFile> mediaList(@PathVariable("page") int page,
                                                    @PathVariable("size") int size,
                                                    QueryMediaFileRequest params) {
        return mediaFileService.queryMediaList(page,size,params);
    }
}
