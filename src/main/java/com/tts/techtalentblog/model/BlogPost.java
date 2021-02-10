package com.tts.techtalentblog.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// the entity is going to align to data in our database
// the entire class can be thought of as a table in a database
@Entity
public class BlogPost {

    // @Id is used to identify primary keys on entities
    // @GeneratedValue is used to auto generation of said keys
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;

    private String tile;
    private String author;
    private String blogEntry;



    public BlogPost(String tile, String author, String blogEntry) {
        this.tile = tile;
        this.author = author;
        this.blogEntry = blogEntry;
    }

    // default constructors are needed to utilize
    // the @Entity annotation
    public BlogPost() {

    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }


    @Override
    public String toString() {
        return "BlogPost{" +
                "Id=" + Id +
                ", tile='" + tile + '\'' +
                ", author='" + author + '\'' +
                ", blogEntry='" + blogEntry + '\'' +
                '}';
    }
    // additionally, you should override .hashcode() and .equals()
    // hashcode
    // equals

}
