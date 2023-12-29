package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
  @Test
    public  void remainTest(){
        CashbackHackService cash= new CashbackHackService();
        int expected = 700;
        int actual = cash.remain(300);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public  void wrongRemainTest(){
        CashbackHackService cash= new CashbackHackService();
        int expected = 0;
        int actual = cash.remain(1000);
        Assert.assertEquals(expected,actual);
    }
}