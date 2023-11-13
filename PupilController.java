package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PupilController {

	@GetMapping
	String getPupil(Model model){
		model.addAttribute("header", "This is coming from the controller");
		model.addAttribute("students",Arrays.asList(
				new Pupil(1L,"Maryam","maryam@gmail.com",LocalDate.of(2019, 3, 9),4),
				new Pupil(2L,"Omar","omar@gmail.com",LocalDate.of(2021, 5, 12),2)
				));
		return "Student";
	}
}
