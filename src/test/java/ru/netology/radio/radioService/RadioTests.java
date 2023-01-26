package ru.netology.radio.radioService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {
    @Test
    public void testRadio (){
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetFmStationMax(){
    Radio number = new Radio();
    number.setCurrentRadioStation(10);
    int expected = 0;
    int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetFmStationMin(){
        Radio number = new Radio();
        number.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetFmStation(){
        Radio number = new Radio();
        number.setCurrentRadioStation(2);
        int expected = 2;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetSound(){
        Radio valume = new Radio();
        valume.setSoundVolume(2);
        int expected = 2;
       int actual = valume.getSoundVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shuldSetSoundMin(){
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shuldSetSoundMax(){
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shouldNextStation(){
        Radio next = new Radio();
        next.setCurrentRadioStation(9);
        int expected = 0;
        int actual = next.nextStation();
        Assertions.assertEquals(expected, actual);
   }
   @Test
   public void shouldNextStationOk(){
       Radio next = new Radio();
       next.setCurrentRadioStation(7);
       int expected = 8;
       int actual = next.nextStation();
       Assertions.assertEquals(expected, actual);
   }



   @Test
    public void shouldPrevStation(){
        Radio prev = new Radio();
        prev.setCurrentRadioStation(0);
        int expected = 9;
        int actual = prev.prevStation();
        Assertions.assertEquals(expected,actual);
   }

   @Test
   public void shouldPrevStationOk(){
       Radio prev = new Radio();
       prev.setCurrentRadioStation(3);
       int expected = 2;
       int actual = prev.prevStation();
       Assertions.assertEquals(expected,actual);
   }

   @Test
   public void shouldPrevStationIf(){
       Radio prev = new Radio();
       prev.setCurrentRadioStation(-1);
       int expected = 9;
       int actual = prev.prevStation();
       Assertions.assertEquals(expected,actual);
   }

   @Test
    public void  shouldUpVolume(){
        Radio up = new Radio();
        up.setSoundVolume(2);
        int expected = 3;
        int actual = up.increaseVolume();
        Assertions.assertEquals(expected, actual);
   }

   @Test
   public void  shouldNoUpVolume(){
       Radio up = new Radio();
       up.setSoundVolume(100);
       int expected = 100;
       int actual = up.increaseVolume();
       Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shouldDownVolume(){
        Radio down = new Radio();
        down.setSoundVolume(3);
        int expected = 2;
        int actual = down.decreaseVolume();
        Assertions.assertEquals(expected, actual);
   }
   @Test
    public void shouldNoDownVolume(){
        Radio down = new Radio();
        down.setSoundVolume(0);
        int expected = 0;
        int actual = down.decreaseVolume();
        Assertions.assertEquals(expected, actual);
   }
}
