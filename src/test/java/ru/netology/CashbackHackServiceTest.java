package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
  @Test
    public  void remainTest(){
        CashbackHackService cash= new CashbackHackService();
        int expected = 1000;
        int actual = cash.remain(1000);
        Assert.assertEquals(expected,actual);
    }

}