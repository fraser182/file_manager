package com.codeclan.filemanager.filemanager.projections;


import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = User.class)
public interface EmbedFolders {

        String getName();
        List<Folder> getFolders();

}
