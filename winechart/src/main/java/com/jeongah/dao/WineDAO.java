package com.jeongah.dao;

import java.util.List;
import com.jeongah.vo.*;

public interface WineDAO {
	public List<QualityVO> selectQuality() throws Exception;
	public List<TsdQualityVO> selectTsdQuality() throws Exception;
	public List<FaPhVO> selectFaPh() throws Exception;
}
