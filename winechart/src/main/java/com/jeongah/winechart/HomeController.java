package com.jeongah.winechart;

import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.jeongah.service.WineService;
import com.jeongah.vo.*;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private WineService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<FaPhVO> faPhList = service.selectFaPh();
		List<QualityVO> qualityList = service.selectQuality();
		List<TsdQualityVO> tsdQualityList = service.selectTsdQuality();
		
		model.addAttribute("faPhList", faPhList);
		model.addAttribute("qualityList", qualityList);
		model.addAttribute("tsdQualityList", tsdQualityList);
		
		return "home";
	}
	
}
