package org.gfg.JBDL64DBConnectivity.services;

import org.gfg.JBDL64DBConnectivity.model.Author;
import org.gfg.JBDL64DBConnectivity.repositories.AuthorJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorJPARepository authorJPARepository;
    public boolean addAuthor(Author author) {
        authorJPARepository.save(author);
        return true;
    }
}
