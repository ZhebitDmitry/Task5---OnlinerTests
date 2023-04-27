package org.example.ForCatalogTitles;

import java.util.ArrayList;
import java.util.List;

public class ExpectedList {
    public ExpectedList() {
    }

    public static List createExpectedList() {
        List<String> expectedList = new ArrayList();
        expectedList.add("Onlíner Prime");
        expectedList.add("Электроника");
        expectedList.add("Компьютеры и сети");
        expectedList.add("Бытовая техника");
        expectedList.add("На каждый день");
        expectedList.add("Стройка и ремонт");
        expectedList.add("Дом и сад");
        expectedList.add("Авто и мото");
        expectedList.add("Красота и спорт");
        expectedList.add("Детям и мамам");
        return expectedList;
    }
}
