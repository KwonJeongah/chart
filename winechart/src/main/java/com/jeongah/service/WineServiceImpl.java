package com.jeongah.service;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.jeongah.dao.WineDAO;
import com.jeongah.vo.FaPhVO;
import com.jeongah.vo.QualityVO;
import com.jeongah.vo.TsdQualityVO;
import com.jeongah.vo.WineVO;

@Service
public class WineServiceImpl implements WineService{
	@Inject
	private WineDAO dao;
	
	@Override
	public List<WineVO> selectWine() throws Exception{
		return dao.selectWine();
	}

	@Override
	public List<FaPhVO> selectFaPh() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QualityVO> selectQuality() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TsdQualityVO> selectTsdQuality() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
