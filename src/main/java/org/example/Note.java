package org.example;

import java.util.Comparator;

public class Note {
    private String place;
    private double timeSpend;
    private int important;

    public int getImportant(){
        return important;
    }
    public double getTimeSpend(){
        return timeSpend;
    }

    public Note(String place, double timeSpend, int important){
        this.place = place;
        this.timeSpend = timeSpend;
        this.important = important;
    }

    @Override
    public String toString() {
        return "Note{" +
                "place='" + place + '\'' +
                ", timeSpend=" + timeSpend +
                ", important=" + important +
                '}';
    }

    public static final Comparator<Note> COMPARE_BY_IMPORTANT = new Comparator<Note>() {
        @Override
        public int compare(Note lhs, Note rhs) {
            return lhs.getImportant() - rhs.getImportant();
        }
    };
}

