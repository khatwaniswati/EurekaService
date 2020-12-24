package com.example.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyPojo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private String name;
}
