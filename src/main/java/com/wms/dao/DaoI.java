package com.wms.dao;

import java.util.List;

import com.wms.model.Article;
import com.wms.model.User;

public interface DaoI {
	
	public User validate(String user,String pass);
	public void saveArticle(Article article);
	
	public User getUserByUserName(String uname);
	
	public List<Article> getAllArticle(String username);
	public Article getArticle(int articleId);

}
