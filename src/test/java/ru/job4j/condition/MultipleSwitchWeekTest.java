package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {
    @Test
    void whenMax1To2Then2() {
        System.out.println(MultipleSwitchWeek.numberOfDay("Пятница"));
    }
}