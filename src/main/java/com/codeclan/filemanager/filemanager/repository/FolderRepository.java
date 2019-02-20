package com.codeclan.filemanager.filemanager.repository;


import com.codeclan.filemanager.filemanager.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
