package kr.or.spring.instagram_clone.dao;

import java.util.List;
import javax.xml.stream.events.Comment;

public interface CommentDao {
	// 댓글 조회
	public List<Comment> list(int Post_id) throws Exception;

	// 댓글 작성
	public void write(Comment vo) throws Exception;

	// 댓글 수정
	public void modify(Comment vo) throws Exception;

	// 댓글 삭제
	public void delete(Comment vo) throws Exception;

}
