package com.example.pmulab1;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleUnitTest {
    @Test
    public void aFindMaxInNotEmptyListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(13);
        list.add(1);

        Assert.assertEquals(13, MinMax.max(list));
    }

    @Test
    public void bFindMaxInEmptyListTest() {
        List<Integer> list = new ArrayList<>();

        Assert.assertEquals("Лист пустой", MinMax.max(list));
    }

    @Test
    public void cFindMaxMinunValueInListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-13);
        list.add(-5);

        Assert.assertEquals(-1, MinMax.max(list));
    }

    @Test
    public void dFindMaxOneValueInListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        Assert.assertEquals(0, MinMax.max(list));
    }

    @Test
    public void eFindMinInNotEmptyListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(13);
        list.add(1);

        Assert.assertEquals(1, MinMax.min(list));
    }

    @Test
    public void fFindMinInEmptyListTest() {
        List<Integer> list = new ArrayList<>();

        Assert.assertEquals("Лист пустой", MinMax.min(list));
    }

    @Test
    public void gFindMinMinunValueInListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-13);
        list.add(-5);

        Assert.assertEquals(-13, MinMax.min(list));
    }

    @Test
    public void hFindMinOneValueInListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        Assert.assertEquals(0, MinMax.min(list));
    }
}