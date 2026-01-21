package com.springstudy.journalapp.controller;

import com.springstudy.journalapp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    final private Map<Integer, JournalEntry> database=new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAllEntries(){
        return new ArrayList<>(database.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry je){
        database.put(je.getID(),je);
        return true;
    }
    @GetMapping("/get/{id}")
    public JournalEntry returnEntry(@PathVariable int id){
        return database.getOrDefault(id,new JournalEntry());
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteEntry(@PathVariable int id){
        database.remove(id);
        return true;
    }
    @PutMapping("/put/{id}")
    public boolean updateEntry(@PathVariable int id,@RequestBody JournalEntry je){
        database.put(id,je);
        return true;
    }
}
