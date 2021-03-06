package com.xuecheng.manage_media.controller;

import com.xuecheng.api.media.MediaUploadControllerApi;
import com.xuecheng.framework.domain.media.response.CheckChunkResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.manage_media.service.MediaUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Kiku
 * @date 2019/7/10 16:15
 */
@RestController
@RequestMapping("/media/upload")
public class MediaUploadController implements MediaUploadControllerApi {

    @Autowired
    private MediaUploadService mediaUploadService;

    @Override
    @PostMapping("/register")
    public ResponseResult register(@RequestParam("fileMd5")String fileMd5,
                                   @RequestParam("fileName")String fileName,
                                   @RequestParam("fileSize")Long fileSize,
                                   @RequestParam("mimetype")String mimeType,
                                   @RequestParam("fileExt")String fileExt)  {
        return mediaUploadService.register(fileMd5,fileName,fileSize,mimeType,fileExt);
    }

    @Override
    @PostMapping("/checkchunk")
    public CheckChunkResult checkChunk(@RequestParam("fileMd5")String fileMd5,
                                       @RequestParam("chunk")Integer chunk,
                                       @RequestParam("chunkSize")Long chunkSize) {
        return mediaUploadService.checkChunk(fileMd5,chunk,chunkSize);
    }

    @Override
    @PostMapping("/uploadchunk")
    public ResponseResult uploadChunk( @RequestParam("file")MultipartFile file,
                                       @RequestParam("chunk")Integer chunk,
                                       @RequestParam("fileMd5")String fileMd5) {
        return mediaUploadService.uploadChunk(file,chunk,fileMd5);
    }

    @Override
    @PostMapping("/mergechunks")
    public ResponseResult mergeChunks(@RequestParam("fileMd5")String fileMd5,
                                      @RequestParam("fileName")String fileName,
                                      @RequestParam("fileSize")Long fileSize,
                                      @RequestParam("mimetype")String mimeType,
                                      @RequestParam("fileExt")String fileExt) {
        return mediaUploadService.mergeChunks(fileMd5,fileName,fileSize,mimeType,fileExt);
    }
}
