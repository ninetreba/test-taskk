package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlacesInit {
    private List<Note> places;

    {
        places = new ArrayList<>();

        places.add(new Note("Исаакиевский собор", 5,10));
        places.add(new Note("Эрмитаж", 8,11));
        places.add(new Note("Кунсткамера", 3.5,4));
        places.add(new Note("Петропавловская крепость", 10,7));
        places.add(new Note("Ленинградский зоопарк", 9,15));
        places.add(new Note("Медный всадник", 1,17));
        places.add(new Note("Казанский собор", 4,3));
        places.add(new Note("Спас на Крови", 2,9));
        places.add(new Note("Зимний дворец Петра I", 7,12));
        places.add(new Note("Зоологический музей", 5.5,6));
        places.add(new Note("Музей обороны и блокады Ленинграда", 2,19));
        places.add(new Note("Русский музей", 5,8));
        places.add(new Note("Навестить друзей", 12,20));
        places.add(new Note("Музей восковых фигур", 2,13));
        places.add(new Note("Литературно-мемориальный музей Ф.М. Достоевского", 4,2));
        places.add(new Note("Екатерининский дворец", 1.5,5));
        places.add(new Note("Петербургский музей кукол", 1,14));
        places.add(new Note("Музей микроминиатюры «Русский Левша»", 3,18));
        places.add(new Note("Всероссийский музей А.С. Пушкина и филиалы", 6,1));
        places.add(new Note("Музей современного искусства Эрарта", 7,16));

    }

    public List<Note> index() {
        return places;
    }




}
