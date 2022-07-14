package com.springcoot.studyjiseok.web.dto.board;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
}
