package com.gogreen.consumer.dto;

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

	private static final long serialVersionUID = 5699092284923043752L;

	private String messageBody;
	private int serialNumber;
}
