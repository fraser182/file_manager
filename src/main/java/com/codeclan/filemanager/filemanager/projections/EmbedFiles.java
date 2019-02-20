package com.codeclan.filemanager.filemanager.projections;


import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedFile", types = Folder.class)
public interface EmbedFiles {

    String getTitle();
    List<File> getFiles();

}
