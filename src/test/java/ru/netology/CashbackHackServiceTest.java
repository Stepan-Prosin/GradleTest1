package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public  void remainTest(){
        CashbackHackService cash= new CashbackHackService();
        int expected = 300;
        int actual = cash.remain(700);
        Assert.assertEquals(actual,expected);
    }

}