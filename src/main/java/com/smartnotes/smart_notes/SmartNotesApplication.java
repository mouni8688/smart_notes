package com.smartnotes.smart_notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.smartnotes.smart_notes.entity.User;
import com.smartnotes.smart_notes.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartNotesApplication.class, args);
	}

	}


