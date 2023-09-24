package ru.geekbrains.lesson6.notes.infrastructure.persistance;

import ru.geekbrains.lesson6.notes.core.domain.Note;

public interface Database {
    void saveNote(Note note);

    void removeNote(Note note);
}
