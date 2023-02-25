package com.practice.spring.microservices.client.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserData implements Serializable{
	private Long id;
	private String name;
	private String loc;
}
