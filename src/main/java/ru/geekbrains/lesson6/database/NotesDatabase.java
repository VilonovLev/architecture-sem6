package ru.geekbrains.lesson6.database;

import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null)
            notesTable = new NotesTable();
        return notesTable;
    }

    @Override
    public void saveNote(Note note) {
        notesTable.add(mapNote(note));
    }

    @Override
    public void removeNote(Note note) {
        notesTable.remove(mapNote(note));
    }

    public static NotesRecord mapNote(Note note) {
        return new NotesRecord(
                note.getId(),
                note.getUserId(),
                note.getTitle(),
                note.getDetails(),
                note.getCreationDate(),
                note.getEditDate()
        );
    }
}
