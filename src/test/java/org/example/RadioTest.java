package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextLastRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevFirstRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetOverRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNegativeRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(-10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetIncreaseSoundVolumeLevel() {
        Radio radio = new Radio();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDecreaseSoundVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetOverMaxVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolume(110);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }


}