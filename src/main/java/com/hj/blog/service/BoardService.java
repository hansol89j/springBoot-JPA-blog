package com.hj.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hj.blog.model.Board;
import com.hj.blog.model.Reply;
import com.hj.blog.model.User;
import com.hj.blog.repository.BoardRepository;
import com.hj.blog.repository.ReplyRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private ReplyRepository replyRepository;
	
	@Transactional
	public void writeBoard(Board board, User user) {
		board.setCount(0);
		board.setUser(user);
		boardRepository.save(board);
	}
	
	@Transactional(readOnly=true)
	public Page<Board> boardList(Pageable pageable){
		return boardRepository.findAll(pageable);
	}
	
	@Transactional(readOnly=true)
	public Board boardDetail(int id) {
		return boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다.");
		});
	}
	
	@Transactional
	public void boardDelete(int id) {
		System.out.println("글삭제하기 : "+id);
		boardRepository.deleteById(id);
	}
	
	@Transactional
	public void updateBoard(Board requestBoard, int id) {
		Board board = boardRepository.findById(id)
						.orElseThrow(() -> {
							return new IllegalArgumentException("글 찾기 실패: 아이디를 찾을 수 없습니다.");
						});
		board.setTitle(requestBoard.getTitle());
		board.setContent(requestBoard.getContent());
	}
	
	@Transactional
	public void writeComment(User user, int boardId, Reply requestReply) {

		Board board = boardRepository.findById(boardId).orElseThrow(()->{
			return new IllegalArgumentException("댓글 쓰기 실패 : 게시글 id를 찾을 수 없습니다.");
		}); // 영속화 완료;

		requestReply.setUser(user);
		requestReply.setBoard(board);

		replyRepository.save(requestReply);
	}
	
	
}
