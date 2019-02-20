package com.codeclan.filemanager.filemanager.repository;


import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.projections.EmbedFiles;
import com.codeclan.filemanager.filemanager.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
