package com.te.resumebuilder.convertion;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.AttributeConverter;

public class convertValue implements AttributeConverter<List<String>, String> {

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		String join = String.join(",", attribute);
		return join;
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		String[] split = dbData.split(",");

		List<String> asList = Arrays.asList(split);
		return asList;
	}

}
