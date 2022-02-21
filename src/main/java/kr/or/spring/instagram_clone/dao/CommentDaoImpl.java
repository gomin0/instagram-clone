package kr.or.spring.instagram_clone.dao;

import java.util.List;
import javax.inject.Inject;
import javax.xml.stream.events.Comment;


import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoImpl implements CommentDao {
	
	@Inject
	private SqlSession sql;

	private static String namespace = "com.board.mappers.reply";

	// 댓글 작성
	@Override
	public void write(Comment vo) throws Exception {
	    sql.insert(namespace + ".replyWrite", vo);
	}

	// 댓글 수정
	@Override
	public void modify(Comment vo) throws Exception {
	    sql.update(namespace + ".replyModify", vo);
	}

	// 댓글 삭제
	@Override
	public void delete(Comment vo) throws Exception {
	    sql.delete(namespace + ".replyDelete", vo);
	}
}
