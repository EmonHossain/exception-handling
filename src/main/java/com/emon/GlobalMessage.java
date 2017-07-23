package com.emon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class GlobalMessage {
	private int msgCode;
	private String msg;
}
