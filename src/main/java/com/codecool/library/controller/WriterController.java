package com.codecool.library.controller;

import com.codecool.library.model.Writer;
import com.codecool.library.servive.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/writer")
public class WriterController {

    WriterService writerService;

    @Autowired
    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }

    @PostMapping
    public void addWriter(@RequestBody Writer writer) {
        writerService.addWriter(writer);
    }

    @GetMapping
    public List<Writer> getAll() {
        return writerService.getAll();
    }
}
