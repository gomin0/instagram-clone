package kr.or.spring.instagram_clone.service;

import javax.inject.Inject;
import javax.xml.stream.events.Comment;

import org.springframework.stereotype.Service;

import kr.or.spring.instagram_clone.dao.CommentDao;

@Service
public class CommentServicelmpl implements CommentService {
	
	@Inject
	private CommentDao dao;

	@Override
	public void write(Comment vo) throws Exception {
	    dao.write(vo);
	}

	@Override
	public void modify(Comment vo) throws Exception {
	    dao.modify(vo);
	}

	@Override
	public void delete(Comment vo) throws Exception {
	    dao.delete(vo);
	}

}
