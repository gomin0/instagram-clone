package kr.or.spring.instagram_clone.service;

import java.util.List;

import kr.or.spring.instagram_clone.dto.Post;
import kr.or.spring.instagram_clone.dto.User;

public interface PostService {
	public static final Integer LIMIT = 5;
	public List<Post> getPosts(Integer start);
	public int deletePost(Long id, String ip);
	public Post addPost(Post post, String ip, String image, User user);
	public int getCount();
}