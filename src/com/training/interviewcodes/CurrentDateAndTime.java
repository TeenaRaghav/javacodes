package com.training.interviewcodes;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateAndTime {
public static void main(String[] args) {
	System.out.println(LocalDate.now());
	System.out.println(LocalTime.of(4,32, 0));
}
}
