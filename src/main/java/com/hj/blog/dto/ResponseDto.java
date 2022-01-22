package com.hj.blog.dto;

import org.springframework.http.HttpStatus;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
	HttpStatus status;
	T data;
}
