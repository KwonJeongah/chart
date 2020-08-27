package com.jeongah.dao;

import java.util.List;
import com.jeongah.vo.FaPhVO;
import com.jeongah.vo.QualityVO;
import com.jeongah.vo.TsdQualityVO;
import com.jeongah.vo.WineVO;

public interface WineDAO {
	public List<WineVO> selectWine() throws Exception;
	public List<FaPhVO> selectFaPh() throws Exception;
	public List<QualityVO> selectQuality() throws Exception;
	public List<TsdQualityVO> selectTsdQuality() throws Exception;
}
