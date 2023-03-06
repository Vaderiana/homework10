package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
        @Test
        public void shouldSetCurrentRadioStationTest1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(-1);
            int actual = radio.getCurrentRadioStation();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldCurrentRadioStationTest2() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(10);
            int actual = radio.getCurrentRadioStation();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationTest1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(3);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 4;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationTest2() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(5);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 6;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationLimitTest1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(0);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 1;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationLimitTest2() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(1);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 2;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationLimitTest3() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(9);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void nextStationLimitTest4() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(8);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 9;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationTest1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(3);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 2;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationTest2() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(5);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 4;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationLimitTest1() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(0);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 9;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationLimitTest2() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(1);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationLimitTest3() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(9);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 8;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void prevStationLimitTest4() {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(8);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            int expected = 7;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldCurrentVolumeTest1() {
            Radio radio = new Radio();
            radio.setCurrentVolume(-1);
            int actual = radio.getCurrentVolume();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void shouldCurrentVolumeTest2() {
            Radio radio = new Radio();
            radio.setCurrentVolume(11);
            int actual = radio.getCurrentVolume();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeTest1() {
            Radio radio = new Radio();
            radio.setCurrentVolume(5);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 6;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeTest2() {
            Radio radio = new Radio();
            radio.setCurrentVolume(7);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 8;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeLimitTest1() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 1;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeLimitTest2() {
            Radio radio = new Radio();
            radio.setCurrentVolume(1);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 2;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeLimitTest3() {
            Radio radio = new Radio();
            radio.setCurrentVolume(10);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 10;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void increaseVolumeLimitTest4() {
            Radio radio = new Radio();
            radio.setCurrentVolume(9);
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 10;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeTest1() {
            Radio radio = new Radio();
            radio.setCurrentVolume(5);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 4;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeTest2() {
            Radio radio = new Radio();
            radio.setCurrentVolume(7);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 6;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeLimitTest1() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeLimitTest2() {
            Radio radio = new Radio();
            radio.setCurrentVolume(1);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 0;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeLimitTest3() {
            Radio radio = new Radio();
            radio.setCurrentVolume(10);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 9;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void decreaseVolumeLimitTest4() {
            Radio radio = new Radio();
            radio.setCurrentVolume(9);
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            int expected = 8;
            Assertions.assertEquals(expected, actual);
        }

}