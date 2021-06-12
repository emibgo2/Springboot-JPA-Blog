package com.cos.blog.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto <T>{
    HttpStatus status;
    T data;
}
