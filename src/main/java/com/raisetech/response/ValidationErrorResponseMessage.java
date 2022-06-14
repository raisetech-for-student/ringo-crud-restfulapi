package com.raisetech.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ValidationErrorResponseMessage implements Serializable {

	// フィールド①
	private final String message;

	// フィールド②の定義クラス
	private static class ValidationMessage implements Serializable {

		// フィールド②のフィールド
		private final String messages;

		// フィールド②の定義クラスのコンストラクタ
		public ValidationMessage(String messages) {
			this.messages = messages;
		}

		// フィールド②のフィールドのゲッター
		public String getMessages() {
			return this.messages;
		}
	}

	// フィールド②
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private List<ValidationMessage> validationMessages = new ArrayList<>();

	// コンストラクタ
	public ValidationErrorResponseMessage(String message) {
		this.message = message;
	}

	// メソッド（フィールド②の定義クラスのコンストラクタを呼び出しフィールド②に対し値を追加）
	public void addValidationMessage(String messages) {
		this.validationMessages.add(new ValidationMessage(messages));
	}

	// フィールド①のゲッター
	public String getMessage() {
		return this.message;
	}

	// フィールド②のゲッター
	public List<ValidationMessage> getValidationMessages() {
		return this.validationMessages;
	}

}
