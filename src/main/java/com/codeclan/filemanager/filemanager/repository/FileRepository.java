package com.codeclan.filemanager.filemanager.repository;


import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface FileRepository extends JpaRepository<File, Long> {



}

