package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AccountDTO;
import com.example.service.AccountServiceProducer;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/account")
@AllArgsConstructor
public class AccountController {

	private AccountServiceProducer accountServiceProducer;

	@PostMapping("/new")
	public AccountDTO create(@RequestBody AccountDTO accountDTO) {
		accountServiceProducer.create(accountDTO);
		return accountDTO;
	}
}
