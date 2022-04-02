package com.example.SpringRESTfulTurorials;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

/**
 * 税込計算を行うロジッククラス
 * @author maetaku
 *
 */
@Service
public class TaxCalcService {
	private final AtomicLong counter = new AtomicLong();	
	public TaxCalc calculation(int price) {
		TaxCalc taxCalc = new TaxCalc(0, "税込 ", price, 0);
		taxCalc.setId(counter.incrementAndGet());
		int result = (int) (price * 1.10);
		taxCalc.setresult(result);
		return taxCalc;
		
	}


}
