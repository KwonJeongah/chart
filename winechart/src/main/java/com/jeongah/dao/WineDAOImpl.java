package com.jeongah.dao;
import java.util.List;
import javax.inject.Inject; 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository; 
import com.jeongah.vo.*;

@Repository
public class WineDAOImpl implements WineDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.jeongah.mybatis.sql.test";
	
	@Override
	public List<QualityVO> selectQuality() throws Exception{
		return sqlSession.selectList(Namespace+".selectQuality");
	}

	@Override
	public List<TsdQualityVO> selectTsdQuality() throws Exception{
		return sqlSession.selectList(Namespace+".selectTsdQuality");
	}
	
	@Override
	public List<FaPhVO> selectFaPh() throws Exception{
		return sqlSession.selectList(Namespace+".selectFaPh");
	}
}
