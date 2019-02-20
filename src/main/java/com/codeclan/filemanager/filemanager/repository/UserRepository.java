package com.codeclan.filemanager.filemanager.repository;


import com.codeclan.filemanager.filemanager.models.User;
import com.codeclan.filemanager.filemanager.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
