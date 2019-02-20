package com.codeclan.filemanager.filemanager.components;


import com.codeclan.filemanager.filemanager.models.File;
import com.codeclan.filemanager.filemanager.models.Folder;
import com.codeclan.filemanager.filemanager.models.User;
import com.codeclan.filemanager.filemanager.repository.FileRepository;
import com.codeclan.filemanager.filemanager.repository.FolderRepository;
import com.codeclan.filemanager.filemanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Lindsay");
        userRepository.save(user1);

        User user2 = new User("Lady");
        userRepository.save(user2);

        Folder folder1 = new Folder("Music", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Documents", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Random", user2);
        folderRepository.save(folder3);


        File file1 = new File("We Came As Romans", ".mp3", 1.3, folder1);
        fileRepository.save(file1);

        File file2 = new File("Linkin Park", ".mp3", 1.6, folder1);
        fileRepository.save(file2);

        File file3 = new File("Biscuits", ".xls", 12.0, folder2);
        fileRepository.save(file3);

    }
}
