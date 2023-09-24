package ru.geekbrains.lesson6.database;

import java.util.Date;
import java.util.Objects;

public class NotesRecord {

    private static int counter = 1000;

    {
        id = ++counter;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

    public NotesRecord(int id, int userId, String title, String details, Date creationDate, Date editDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
        this.editDate = editDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    private int id;
    private int userId;

    private String title;

    private String details;

    private Date creationDate;
    private Date editDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotesRecord that = (NotesRecord) o;
        return id == that.id && userId == that.userId && Objects.equals(title, that.title) && Objects.equals(details, that.details) && Objects.equals(creationDate, that.creationDate) && Objects.equals(editDate, that.editDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, title, details, creationDate, editDate);
    }
}
