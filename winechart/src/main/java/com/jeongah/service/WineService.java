package com.jeongah.service;
import java.util.List;
import com.jeongah.vo.WineVO;
import com.jeongah.vo.FaPhVO;
import com.jeongah.vo.QualityVO;
import com.jeongah.vo.TsdQualityVO;

public interface WineService {
	public List<WineVO> selectWine() throws Exception;
	public List<FaPhVO> selectFaPh() throws Exception;
	public List<QualityVO> selectQuality() throws Exception;
	public List<TsdQualityVO> selectTsdQuality() throws Exception;
}
