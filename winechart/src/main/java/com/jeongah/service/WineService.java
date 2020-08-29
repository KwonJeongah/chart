package com.jeongah.service;

import java.util.List;
import com.jeongah.vo.*;

public interface WineService {
	public List<QualityVO> selectQuality() throws Exception;
	public List<FaPhVO> selectFaPh() throws Exception;
	public List<TsdQualityVO> selectTsdQuality() throws Exception;
}
