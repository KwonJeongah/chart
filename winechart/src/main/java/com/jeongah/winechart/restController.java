package com.jeongah.winechart;


import javax.inject.Inject;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jeongah.service.WineService;
import com.jeongah.vo.*;

@RestController
public class restController {
	private static final Logger logger = LoggerFactory.getLogger(restController.class);
			
	@Inject
	private WineService service;
	
	@RequestMapping(value = "qualityList")
	public List<QualityVO> qualityList() throws Exception{
		logger.info("home");
		
		List<QualityVO> qualityList = service.selectQuality();
		
		return qualityList;
	}
	
	
	@RequestMapping(value = "faPhList")
	public List<FaPhVO> faPhList() throws Exception{
		logger.info("home");
		
		List<FaPhVO> faPhList = service.selectFaPh();
		
		return faPhList;
	}
	
	@RequestMapping(value = "tsdQualityList")
	public List<TsdQualityVO> tsdQualityList() throws Exception{
		logger.info("home");
		
		List<TsdQualityVO> tsdQualityList = service.selectTsdQuality();
		
		return tsdQualityList;
	}
}
