package top.godder.dataservice.mapper;

import top.godder.common.database.BaseMapper;
import top.godder.dataapi.entry.FileDownload;

import java.util.List;

public interface FileDownloadMapper extends BaseMapper<FileDownload> {
    List<FileDownload> findFileDownloadByFile(Long fileId);

    List<FileDownload> findFileDownloadByUser(Long userId);

    List<FileDownload> findAllFileDownload();

    boolean addFileDownload(FileDownload fileDownload);
}