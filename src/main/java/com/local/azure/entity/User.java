package com.local.azure.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = -295422703255886286L;
	private String name;
}