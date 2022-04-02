package com.example.SpringRESTfulTurorials;

/**
 * 税込計算のBeanクラス
 * @author maetaku
 *
 */
public class TaxCalc {
	
	/**
	 * id
	 */
	private long id;
	/**
	 * 「税込」の文言
	 */
	private final String content;
	/**
	 * 元値（入力値）
	 */
	private int price;
	/**
	 * 税込金額（計算値）
	 */
	private int result;
	
	public TaxCalc(long id, String content, int price, int result) {
		this.id = id;
		this.content = content;
		this.price = price;
		this.result = result;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public int getPrice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}

	public int getResult() {
		return result;
	}
	
	public void setresult(int result) {
		this.result = result;
	}

}
