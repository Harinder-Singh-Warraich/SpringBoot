package com.springstudy.journalapp.entity;

public class JournalEntry {
    private int id;
    private String title;
    private String content;
    public void setID(int id){
        this.id=id;
    }
    public int getID(){
        return id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
}
