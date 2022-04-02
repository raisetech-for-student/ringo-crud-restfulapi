package com.example.SpringRESTfulTurorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 税込価格を返してくれるRESTコントローラー
 * http://localhost:8080/taxcalc/100
 * @return 税込価格が画面に返ってくる
 * @author maetaku
 *
 */

@RestController
public class TaxCalcController {
	
	@Autowired TaxCalcService service;
	
	
	@GetMapping("/taxcalc/{price}")
	public TaxCalc taxcalc(@PathVariable int price) {
		return service.calculation(price);
	}

}
