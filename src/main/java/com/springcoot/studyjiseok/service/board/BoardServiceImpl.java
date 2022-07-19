package com.springcoot.studyjiseok.service.board;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.springcoot.studyjiseok.domain.board.Board;
import com.springcoot.studyjiseok.domain.board.BoardRepository;
import com.springcoot.studyjiseok.web.dto.board.CreateBoardReqDto;
import com.springcoot.studyjiseok.web.dto.board.CreateBoardRespDto;
import com.springcoot.studyjiseok.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private final BoardRepository boardRepository;

	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		Board boardEntity = createBoardReqDto.toEntity();
		boolean insrtStatus = boardRepository.save(boardEntity) > 0;
		return boardEntity.toCreateBoardDto(insrtStatus);
	}

	@Override
	public ReadBoardRespDto readBoard(int boardcode) throws Exception {
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
	}
	
	@Override
	public ReadBoardRespDto readBoardList(int page) throws Exception {
		// TODO Auto-generated method stub
		return null;
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
