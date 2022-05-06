package com.codecool.library.servive;

import com.codecool.library.model.Writer;
import com.codecool.library.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterService {

    WriterRepository writerRepository;

    @Autowired
    public WriterService(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    public void addWriter(Writer writer) {
        writerRepository.addWriter(writer);
    }

    public List<Writer> getAll() {
        return writerRepository.getAll();
    }
}
