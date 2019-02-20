package com.codeclan.filemanager.filemanager;

import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import com.codeclan.filemanager.filemanager.repository.FileRepository;
import com.codeclan.filemanager.filemanager.repository.FolderRepository;
import com.codeclan.filemanager.filemanager.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagerApplicationTests {

	@Autowired // used on Inter
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSetupUser(){
		User user1 = new User("Lindsay");
		userRepository.save(user1);
	}

	@Test
	public void canSetupAFolder(){
		User user1 = new User("Belle");
		userRepository.save(user1);

		Folder folder1 = new Folder("windows", user1);
		folderRepository.save(folder1);
	}

	@Test
	public void canSetupAFile(){
		User user1 = new User("Jean");
		userRepository.save(user1);

		Folder folder1 = new Folder("windows", user1);
		folderRepository.save(folder1);

		File file1 = new File("We Came As Romans", ".mp3", 1.3, folder1);
		fileRepository.save(file1);

	}

}
