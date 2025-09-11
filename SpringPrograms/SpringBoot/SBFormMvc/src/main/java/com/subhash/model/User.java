package com.subhash.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	private String username;
	private String email;
	private long mobile;
	private String gender;
}
