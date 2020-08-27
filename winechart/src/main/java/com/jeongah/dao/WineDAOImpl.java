package com.jeongah.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.jeongah.vo.WineVO;

@Repository
public class WineDAOImpl implements WineDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.jeongah.mybatis.sql.test";
	
	@Override
	public List<WineVO> selectWine() throws Exception{
		return sqlSession.selectList(Namespace+".selectWine");
	}
}
