package com.springcoot.studyjiseok.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springcoot.studyjiseok.web.dto.board.CreateBoardReqDto;

@Service
public class BoardServiceImpl implements BoardService{

	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		System.out.println(createBoardReqDto);
		if(0 == 0) {
			throw new RuntimeException();			
		}
		return true;
	}

	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
