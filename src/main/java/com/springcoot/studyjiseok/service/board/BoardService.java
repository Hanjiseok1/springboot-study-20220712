package com.springcoot.studyjiseok.service.board;

import com.springcoot.studyjiseok.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
//	public boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public boolean deleteBoard(int boardcode) throws Exception;
		
}
