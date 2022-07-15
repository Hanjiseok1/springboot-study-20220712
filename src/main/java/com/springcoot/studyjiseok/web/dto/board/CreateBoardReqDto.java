package com.springcoot.studyjiseok.web.dto.board;

import com.springcoot.studyjiseok.domain.board.Board;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
	
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}
}
