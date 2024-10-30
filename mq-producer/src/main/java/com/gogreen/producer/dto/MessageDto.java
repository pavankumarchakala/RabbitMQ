package com.gogreen.producer.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto implements Serializable {

	private static final long serialVersionUID = -8839288805506211065L;

	private String messageBody;
	private int serialNumber;
}
