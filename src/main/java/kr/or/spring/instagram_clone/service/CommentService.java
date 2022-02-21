package kr.or.spring.instagram_clone.service;

import javax.xml.stream.events.Comment;

public interface CommentService {

	// 댓글 작성
	public void write(Comment vo) throws Exception;

	// 댓글 수정
	public void modify(Comment vo) throws Exception;

	// 댓글 삭제
	public void delete(Comment vo) throws Exception;

}
