package com.jeongah.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.jeongah.dao.*;
import com.jeongah.vo.*;

@Service
public class WineServiceImpl implements WineService {

		@Inject
		private WineDAO dao;
		
		@Override
		public List<QualityVO> selectQuality() throws Exception{
			return dao.selectQuality();
		}
		
		@Override
		public List<FaPhVO> selectFaPh() throws Exception{
			return dao.selectFaPh();
		}
		
		@Override
		public List<TsdQualityVO> selectTsdQuality() throws Exception{
			return dao.selectTsdQuality();
		}
}
