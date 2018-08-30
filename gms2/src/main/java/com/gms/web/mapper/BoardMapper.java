package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.domain.ArticleDTO;
import com.gms.web.domain.MemberDTO;
@Repository
public interface BoardMapper {
	public void create(ArticleDTO p);
	public void update(ArticleDTO p);
	public void delete(ArticleDTO p);
	public ArticleDTO read(String p);
	public ArticleDTO listAll(String p);
	public ArticleDTO listPage(String p);
	public ArticleDTO listCriteria(Map<?,?> p);
	public int countPaging();
	public List<ArticleDTO> listSearch(Map<?,?> p);
	public int listSearchCount();
}
