package com.example.demo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pupil {
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	private Integer age;
}
