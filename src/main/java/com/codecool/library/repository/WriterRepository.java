package com.codecool.library.repository;

import com.codecool.library.model.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WriterRepository {

    List<Writer> writers;

    @Autowired
    public WriterRepository(List<Writer> writers) {
        this.writers = writers;
    }

    public void addWriter(Writer writer) {
        writers.add(writer);
    }

    public List<Writer> getAll() {
        return writers;
    }

}
